package aufgabe25;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class MessgeraetGUI extends Stage {
	private Messgeraet mess;

	private Label lavafarbe, rauchfarbe, fliessgeschw;
	private TextField tf_lavafarbe, tf_rauchfarbe, tf_fliessgeschw;
	private Button ok;

	public MessgeraetGUI(Messgeraet m) {
		
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
	}
}
