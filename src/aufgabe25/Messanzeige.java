package aufgabe25;

public class Messanzeige <T> implements IBeobachter {
	private Vulkanstation vs;
	private T attribut;
	
	public Messanzeige(Vulkanstation v) {
		vs = v;
		attribut = null;
		
		vs.anmelden(this);
		aktualisieren();
	}
	
	public void aktualisieren() {
	
	}
	
	public String toString() {
		return "+Messgeraet+\n " + "Ergebnis: " + attribut;
	}

}
