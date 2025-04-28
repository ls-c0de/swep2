package aufgabe23;

public class Aktie extends Anlage {

	private IWert berechner;

	public Aktie(String n, int w, IWert b) {
		super(n, w);
		berechner = b;
	}

	@Override
	protected void ausgeben() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Aktie [wert=" + wert + ", name=" + name + "]";
	}

	@Override
	public int berechneNeuenWert() {
		wert = berechner.gibNeuenWert(wert);
		return wert;
	}
}
