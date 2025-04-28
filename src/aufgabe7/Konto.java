package aufgabe7;

public class Konto {

	private int kontonummer;
	private int kontostand;

	public Konto(int kontonummer, int kontostand) {
		this.kontonummer = kontonummer;
		setKontostand(kontostand);
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public int getKontostand() {
		return kontostand;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}

	public String toString() {
		return "Kontonummer: " + kontonummer + " Kontostand: " + kontostand;
	}

}
