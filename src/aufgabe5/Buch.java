package aufgabe5;

public class Buch extends Ware {
	private String titel;
	private String autor;
	
	public Buch(String titel, String autor, int preis) {
		super(preis);
		this.titel = titel;
		this.autor = autor;
	}
	
	public String toString() {
		return super.toString() + " Titel: " + titel + " Autor: " + autor;
	}
}
