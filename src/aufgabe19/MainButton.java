package aufgabe19;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainButton extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Muenzenwerfer");
		
		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(10, 10, 10, 10));

		Label label = new Label("Noch nichts geworfen!");
		Button button = new Button("Werfe eine Muenze");
		
		label.setStyle("-fx-font: 18 arial;");
		button.setStyle("-fx-font: 18 arial;");
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		Scene myScene = new Scene(root);
				
		class ClickHandler implements EventHandler<MouseEvent> {
			@Override
			public void handle(MouseEvent event) {
				label.setText("Wurf " + Logic.gibAnzahlWuerfe() + ": " + Logic.werfen() );
			}
		}
		
		button.addEventHandler(MouseEvent.MOUSE_PRESSED, new ClickHandler());
		
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
	
}
