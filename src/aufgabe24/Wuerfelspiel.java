package aufgabe24;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Wuerfelspiel extends Application {
	boolean gezinkt = false;
	int seiten;

	public void start(Stage primaryStage) throws Exception {

		primaryStage.setScene(new Scene(root, 400, 300));
		primaryStage.show();
	}

	public class MeinEventHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
		}

	}

	public void createEinstellung() {

	}

}
