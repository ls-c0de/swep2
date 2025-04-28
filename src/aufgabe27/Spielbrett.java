package aufgabe27;

import aufgabe21.Spielstein;

public class Spielbrett {
	private Spielstein[][] brett;
	private final int breite;
	private final int hoehe;

	public Spielbrett(int h, int b) {
		hoehe = h;
		breite = b;
		brett = new Spielstein[hoehe][breite];
		entleeren();
	}

	public int getBreite() {
		return breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	// weist dem Spielbretteintraegen den Spielstein LEER zu
	public void entleeren() {
		for (int i = 0; i < hoehe; i++)
			for (int j = 0; j < breite; j++)
				brett[i][j] = Spielstein.LEER;
	}

	private void zeichneHLinie() {
		for (int i = 0; i < breite; i++) {
			System.out.printf("+-");
		}
		System.out.printf("+\n");
	}

	// Die unterste Spielbrettzeile wird hier mit 0 indiziert. Die Ausgabe
	// des Spielbrettes muss daher von hoehe-1 beginnend erfolgen.
	public void zeichne() {
		zeichneHLinie();
		for (int i = hoehe - 1; i >= 0; i--) {
			for (int j = 0; j < breite; j++) {
				System.out.printf("|" + brett[i][j].toChar());
			}
			System.out.printf("|\n");
			zeichneHLinie();
		}
		for (int i = 1; i <= breite; i++) {
			System.out.printf(" " + i);
		}
		System.out.printf("\n\n");
	}

	public Spielstein getBrett(int zeile, int spalte) {
		return brett[zeile][spalte];
	}

	// hier wird von unten nach oben die Spalte inspiziert;
	// falls man auf einen leeren Spielstein trifft,
	// gibt man die aktuelle Zeile zurück;
	// sind alle Spielsteine <> LEER, ist der Returnvalue -1
	public int setzeStein(Spielstein s, int spalte) {
		if (spalte >= 0 && spalte < breite) {
			for (int zeile = 0; zeile < hoehe; zeile++) {
				if (getBrett(zeile, spalte) == Spielstein.LEER) {
					brett[zeile][spalte] = s;
					return zeile;
				}
			}
		}
		return -1;
	}

	public boolean zugNochMoeglich() {
		for (int i = 0; i < breite; i++)
			if (brett[hoehe - 1][i] == Spielstein.LEER)
				return true;
		return false;
	}

	public int zaehleSteineInRichtung(int posX, int posY, int dx, int dy, Spielstein stein) {
		if (posX < 0 || posX >= breite || posY < 0 || posY >= hoehe) {
			return 0;
		} 
		
		if (brett[posY][posX] == stein) {
			return zaehleSteineInRichtung(posX+dx, posY+dy, dx, dy, stein) + 1;
		} else {
			return 0;
		}
	}
}
