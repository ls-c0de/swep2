package aufgabe25;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class VulkanstationGUI extends Stage {
	private Vulkanstation vs;

	private Label lavafarbe, rauchfarbe, fliessgeschw;
	private TextField tf_lavafarbe, tf_rauchfarbe, tf_fliessgeschw;
	private Button ok;

	public VulkanstationGUI(Vulkanstation v) {
		vs = v;
		
		TilePane root = new TilePane();
		root.setPrefColumns(2);

		lavafarbe = new Label("Farbe der Lava: ");
		lavafarbe.setAlignment(Pos.BASELINE_RIGHT);
		rauchfarbe = new Label("Farbe des Rauchs: ");
		rauchfarbe.setAlignment(Pos.BASELINE_RIGHT);
		fliessgeschw = new Label("Fliessgeschwindigkeit: ");
		fliessgeschw.setAlignment(Pos.BASELINE_RIGHT);

		tf_lavafarbe = new TextField();
		tf_rauchfarbe = new TextField();
		tf_fliessgeschw = new TextField();

		// tf_lavafarbe.setText( m.getLavafarbe().toString() );
		tf_rauchfarbe = new TextField();
		tf_fliessgeschw = new TextField();
		
		ok = new Button("OK");
		ok.setOnAction(new OK_ButtonEventHandler());

		// Füge Komponenten dem Root-Element zu:
		root.getChildren().addAll(lavafarbe, tf_lavafarbe, rauchfarbe, tf_rauchfarbe, fliessgeschw, tf_fliessgeschw, ok);

		// ok-Button soll mit ENTER gedrückt werden können:
		ok.setDefaultButton(true);
		
		//Stage mit Titel versehen:
		this.setTitle("Wetterstation Eingabe");
		
		//Stage mit Scene befüllen
		this.setScene(new Scene(root));
	}
	
	class OK_ButtonEventHandler implements EventHandler<ActionEvent> {
		public void actionPerformed(ActionEvent e) {
		}

		@Override
		public void handle(ActionEvent event) {
			int t, h, d;
			System.out.println("*-----------------------*");
			t = Integer.parseInt(tf_temp.getText());
			h = Integer.parseInt(tf_hygro.getText());
			d = Integer.parseInt(tf_druck.getText());
			vs.setAll(t, h, d);

		}
	}
}
