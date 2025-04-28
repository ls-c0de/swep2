package aufgabe4;

public class Rechteck<Type extends Number> implements IFlaecheninhalt {
	private Type breite;
	private Type hoehe;
	
	public Rechteck() {
	}
	public Rechteck(Type g, Type h) {
		breite = g;
		hoehe = h;
	}
	
	public Type getHoehe() {
		return hoehe;
	}
	public void setHoehe(Type h) {
		this.hoehe = h;
	}
	
	public Type getGrundseite() {
		return breite;
	}
	public void setGrundseite(Type g) {
		this.breite = g;
	}
	
	public double gibFlaechenInhalt() {
		return breite.doubleValue() * hoehe.doubleValue();
	}
}
