package aufgabe23;

public abstract class Anlage {

	protected int wert;
	protected String name;

	protected abstract void ausgeben();

	public abstract int berechneNeuenWert();

	public Anlage() { //Warum muss ich hier den leeren Konstruktur hinmachen?
	}
	
	public Anlage(String name, int wert) {
		super();
		this.name = name;
		this.wert = wert;
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
