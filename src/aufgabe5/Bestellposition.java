package aufgabe5;

public class Bestellposition <Type extends Ware>{
	private int anzahl;
	private Type ware;
	
	public Bestellposition(int anz, Type w) {
		setAnzahl(anz);
		setWare(w);
	}

	public int berechneBestellwert() {
		return ware.getPreis() * anzahl;
	}
	
	public int gutschrift(Bestellposition<Type> bp) {
		return bp.berechneBestellwert() - this.berechneBestellwert();
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public Type getWare() {
		return ware;
	}
	public void setWare(Type ware) {
		this.ware = ware;
	}
	
	
	
}
