package aufgabe5;

public abstract class Ware {
	private int preis;
	
	public Ware(int preis) {
		this.preis = preis;
	}
	
	public String toString() {
		return "Der Preis beträgt: " + preis;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
}
