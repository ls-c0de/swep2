package aufgabe18;

public class Hauptprogramm {
	public static void main(String[] args) {
		Meer meinMeer = new Meer(10);

		for (int i = 0; i < 20; i++)
			meinMeer.simuliereTreffenZweierMeerestiere();
		meinMeer.ausgeben();
	}
}
