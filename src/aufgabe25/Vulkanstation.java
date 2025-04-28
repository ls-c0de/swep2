package aufgabe25;

public class Vulkanstation extends Subject {
	private Lavafarbe lf;
	private Rauchfarbe rf;
	private int rh;
	private Fliessgeschw fl;

	public Vulkanstation() {
		
	}
	
	public Vulkanstation(Lavafarbe lavafarbe, Rauchfarbe rauchfarbe, int rauchhoehe, Fliessgeschw fliessgeschw) {
		setLavafarbe(lavafarbe);
		setRauchfarbe(rauchfarbe);
		setRh(rauchhoehe);
		setFliessgeschw(fliessgeschw);
	}

	public Lavafarbe getLavafarbe() {
		return lf;
	}
	public void setLavafarbe(Lavafarbe lf) {
		this.lf = lf;
		benachrichtigen();
	}

	public Rauchfarbe getRauchfarbe() {
		return rf;
	}
	public void setRauchfarbe(Rauchfarbe rf) {
		this.rf = rf;
		benachrichtigen();
	}

	public int getRauchhoehe() {
		return rh;
	}
	public void setRh(int rh) {
		this.rh = rh;
		benachrichtigen();
	}

	public Fliessgeschw getFliessgeschw() {
		return fl;
	}
	public void setFliessgeschw(Fliessgeschw fl) {
		this.fl = fl;
		benachrichtigen();
	}
	
	public void setAll(Lavafarbe lavafarbe, Rauchfarbe rauchfarbe, int rauchhoehe, Fliessgeschw fliessgeschw) {
		lf = lavafarbe;
		rf = rauchfarbe;
		rh = rauchhoehe;
		fl = fliessgeschw;
		benachrichtigen();
	}
}
