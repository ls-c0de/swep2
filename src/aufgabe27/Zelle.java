package aufgabe27;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Zelle extends Label {
	private ImageView iconLeer = new ImageView(new Image(getClass().getResourceAsStream("weiss.gif")));
	private ImageView iconGelb = new ImageView(new Image(getClass().getResourceAsStream("gelb.gif")));
	private ImageView iconRot = new ImageView(new Image(getClass().getResourceAsStream("rot.gif")));

	public Zelle() {
		this.setGraphic(iconLeer);
		setPrefSize(69.0, 69.0);
	}

	public void setzeLeer() {
		this.setGraphic(iconLeer);
	}

	public void setzeGelb() {
		this.setGraphic(iconGelb);
	}

	public void setzeRot() {
		this.setGraphic(iconRot);
	}
}
