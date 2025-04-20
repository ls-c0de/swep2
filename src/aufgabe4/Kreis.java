package aufgabe4;

public class Kreis<Type extends Number> implements IFlaecheninhalt {
	private Type radius;
	
	public Kreis() {
	}
	
	public Kreis(Type s) {
		setSeite(s);
	}

	public Type getSeite() {
		return radius;
	}

	public void setSeite(Type seite) {
		this.radius = seite;
	}
	
	public double gibFlaechenInhalt() {
		return Math.pow(radius.doubleValue(), 2) * Math.PI;
 	}
}
