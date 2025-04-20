package aufgabe5;

public class SDKarte extends Ware {
	private String hersteller;
	private int speicherplatz;
	
	public SDKarte(String hersteller, int speicherplatz, int preis) {
		super(preis);
		//super.setPreis(preis);
		this.hersteller = hersteller;
		this.speicherplatz = speicherplatz;
		
	}
	
	public String toString() {
		return super.toString() + " Speicher: " 
		+speicherplatz + " Hersteller:" +hersteller;
	}
}
