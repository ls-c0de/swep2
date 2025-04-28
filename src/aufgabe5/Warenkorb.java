package aufgabe5;

public class Warenkorb {
	private static final int MAX_GROESSE = 10;
	private Bestellposition<?>[] korb = new Bestellposition<?>[MAX_GROESSE];
	//Referenzen bei denen der konkrete Typ egal ist immer Wildcard
	//Array von generischen Objekten immer mit Wildcard
	private int bestellwert = 0;
	private int cnt = 0;

	public void aktualisiereBestellwert() {
		
		for (int i = 0; i < cnt; i++) {
			bestellwert = getBestellwert() + korb[i].berechneBestellwert();
		}
	}

	public void anhaengen(Bestellposition<?> bp) {
		if (cnt < MAX_GROESSE) {
			korb[cnt] = bp;
			cnt++;
		} else {
			System.exit(0);
		}
	}

	public int getBestellwert() {
		return bestellwert;
	}
	
	public String toString() {
		return "Bestellwert beträgt: " + bestellwert;
	}
}
