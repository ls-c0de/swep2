package aufgabe27;

import aufgabe21.Spielstein;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SpielbrettAnzeige extends Application implements EventHandler<ActionEvent> {

	private int zeilen, spalten;
	private Spielbrett brett;
	private Zelle[][] zellen;
	private Button[] einwurf;
	Spielstein aktuellerSpielstein;

	private Label status;

	/**
	 * Einstiegspunkt zum Starten der Application
	 * 
	 * @param args
	 */
	public static void startGUI(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		zeilen = 6;
		spalten = 8;
		brett = new Spielbrett(zeilen, spalten);
		aktuellerSpielstein = Spielstein.WEISS;
	}

	@Override
	public void start(Stage stage) throws Exception {
		// create the visual board
		TilePane board = new TilePane();
		board.setPrefColumns(brett.getBreite());
		erzeugeZellen();
		for (int z = zeilen - 1; z >= 0; z--)
			board.getChildren().addAll(zellen[z]);

		// create the button pane
		TilePane buttonPane = new TilePane();
		buttonPane.setPrefColumns(board.getPrefColumns());

		statusLabel();

		erzeugeButtons();
		buttonPane.getChildren().addAll(einwurf);

		BorderPane root = new BorderPane();
		root.setTop(status);
		root.setCenter(buttonPane);
		root.setBottom(board);

		Scene scene = new Scene(root);
		stage.setTitle("Vier gewinnt");

		stage.setScene(scene);
		stage.show();
	}

	private void statusLabel() {
		status = new Label("Der erste Spieler darf beginnen! (Gelb)");
		status.setPrefHeight(100);
		status.setMaxWidth(Double.MAX_VALUE);
		status.setAlignment(Pos.CENTER);
	}

	/**
	 * für jedes Feld auf dem Spielbrett wird eine Zelle erzeugt
	 */
	private void erzeugeZellen() {
		zellen = new Zelle[zeilen][spalten];
		for (int z = zeilen - 1; z >= 0; z--) {
			for (int s = 0; s < spalten; s++) {
				zellen[z][s] = new Zelle();
			}
		}
	}

	/**
	 * die Buttons für den Einwurf erzeugen
	 */
	private void erzeugeButtons() {
		einwurf = new Button[spalten];
		for (int s = 0; s < spalten; s++) {
			einwurf[s] = new Button("Einwurf");
			einwurf[s].setUserData(s);
			einwurf[s].setPrefSize(69, 69);
			einwurf[s].setOnAction(this);
		}
	}

	/**
	 * die Zellen müssen entsprechend an den Zustand des Spielbretts angepasst
	 * werden. Jedes Feld auf dem Brett wird geprüft und das dazu passende Image in
	 * der Zelle ausgewählt.
	 */
	private void aktualisiere() {
		for (int z = zeilen - 1; z >= 0; z--) {
			for (int s = 0; s < spalten; s++) {
				switch (brett.getBrett(z, s)) {
				case WEISS:
					zellen[z][s].setzeGelb();
					break;
				case SCHWARZ:
					zellen[z][s].setzeRot();
					break;
				default:
					zellen[z][s].setzeLeer();
				}
			}
		}

	}

	/**
	 * aktuellen Spielstein wechseln (Spieler spielen abwechselnd)
	 */
	private void wechsleSpielstein() {
		aktuellerSpielstein = aktuellerSpielstein == Spielstein.WEISS ? Spielstein.SCHWARZ : Spielstein.WEISS;

		if (aktuellerSpielstein == Spielstein.WEISS) {
			status.setText("GELB ist am Zug!");
		} else {
			status.setText("ROT ist am Zug!");
		}
	}

	private boolean siegesZug(int zeile, int spalte) {
		Spielstein s = brett.getBrett(zeile, spalte);

		//Spielstein s = aktuellerSpielstein;

		if (brett.zaehleSteineInRichtung(spalte, zeile, 1, 0, s)
				+ brett.zaehleSteineInRichtung(spalte, zeile, -1, 0, s) > 4)
			return true;
		else if (brett.zaehleSteineInRichtung(spalte, zeile, 0, 1, s) // kann man rausschmeißen
				+ brett.zaehleSteineInRichtung(spalte, zeile, 0, -1, s) > 4)
			return true;
		else if (brett.zaehleSteineInRichtung(spalte, zeile, 1, 1, s)
				+ brett.zaehleSteineInRichtung(spalte, zeile, -1, -1, s) > 4)
			return true;
		else if (brett.zaehleSteineInRichtung(spalte, zeile, -1, 1, s)
				+ brett.zaehleSteineInRichtung(spalte, zeile, 1, -1, s) > 4)
			return true;
		else
			return false;

	}

	/**
	 * EventHandler für das Drücken eines Buttons. aktueller Spielstein wird in die
	 * betreffende Spalte geworfen.
	 */
	@Override
	public void handle(ActionEvent event) {
		int zeile = 0;

		Button klicked = (Button) event.getSource();

		if ((zeile = brett.setzeStein(aktuellerSpielstein, (int) klicked.getUserData())) != -1) {
			wechsleSpielstein();
			aktualisiere();
			
			if (siegesZug(zeile, (int) klicked.getUserData())) {
				statusLabelSieg(aktuellerSpielstein);
			}
			if (!brett.zugNochMoeglich()) {
				status.setText("DAS SPIEL IST UNENTSCHIEDEN!");

				buttonsDeaktivieren();
			}

		}

		// System.out.println(brett.getHoehe() + " " + brett.getBreite() + " " + zeile);

//		if (brett.getHoehe() == zeile+1) {
//			einwurf[(int) klicked.getUserData()].setDisable(true);
//		}
	}

	public void statusLabelSieg(Spielstein s) {
		if (s == s.WEISS) {
			status.setText("ROT hat gewonnen!");
		} else {
			status.setText("GELB hat gewonnen!");
		}
		buttonsDeaktivieren();
	}

	private void buttonsDeaktivieren() {
		for (Button b : einwurf) {
			b.setDisable(true);
		}
	}

}
