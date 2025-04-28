package aufgabe4;

public class Dreieck<Type extends Number> implements IFlaecheninhalt {
	private Type grundseite;
	private Type hoehe;
	
	public Dreieck() {
	}
	public Dreieck(Type g, Type h) {
		grundseite = g;
		hoehe = h;
	}
	
	public Type getHoehe() {
		return hoehe;
	}
	public void setHoehe(Type h) {
		this.hoehe = h;
	}
	
	public Type getGrundseite() {
		return grundseite;
	}
	public void setGrundseite(Type g) {
		this.grundseite = g;
	}
	
	public double gibFlaechenInhalt() {
		return grundseite.doubleValue() * hoehe.doubleValue() * 0.5;
	}
}
