package aufgabe7;

public class Einzelueberweisung extends Ueberweisung {
	private Konto anKonto;
	private Konto vonKonto;
	private int betrag;

	public Einzelueberweisung(Konto vonKonto, Konto anKonto, int betrag) {
		this.vonKonto = vonKonto;
		this.anKonto = anKonto;
		this.betrag = betrag;
	}

	@Override
	public void buchen() {
		if (vonKonto.getKontostand() < betrag) {
			throw new IllegalArgumentException("Kontostand ist nicht hoch genug");
		}
		vonKonto.setKontostand(vonKonto.getKontostand() - betrag);
		anKonto.setKontostand(anKonto.getKontostand() + betrag);
	}

	public String toString() {
		return "Von dem Konto: " + vonKonto.getKontonummer() + " an das Konto " + anKonto.getKontonummer()
				+ " wurde ueberwiesen der Betrag" + betrag;
	}
}
