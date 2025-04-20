package aufgabe4;

public class Quadrat<Type extends Number> implements IFlaecheninhalt {
	private Type seite;
	
	public Quadrat() {
	}
	
	public Quadrat(Type s) {
		setSeite(s);
	}

	public Type getSeite() {
		return seite;
	}

	public void setSeite(Type seite) {
		this.seite = seite;
	}
	
	public double gibFlaechenInhalt() {
		return seite.doubleValue() * seite.doubleValue();
 	}
}
