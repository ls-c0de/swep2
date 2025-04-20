package aufgabe21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Testprogramm_viergewinnt {

	public static void main(String[] args) {
		int spalte, zeile;
		Spielstein s = Spielstein.WEISS;
		Spielbrett feld = new Spielbrett(6, 7);
		feld.zeichne();

		try {
			System.out.println(
					"Spieler " + s + ": In welcher Spalte soll ein Stein gesetzt werden? [1:" + feld.getBreite() + "]");

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			System.out.print("> ");
			str = in.readLine();
			spalte = Integer.parseInt(str);
			zeile = feld.setzeStein(s, spalte - 1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		feld.zeichne();
		feld.entleeren();
		feld.zeichne();
	}
}
