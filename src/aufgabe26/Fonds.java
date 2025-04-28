package aufgabe26;

import aufgabe23.*;
import java.util.ArrayList;

public class Fonds extends Anlage {
	private String name;
	private ArrayList<AnlagenGegenstand> gegenstaende;

	public Fonds(String name) {
		this.name = name;
		gegenstaende = new ArrayList<AnlagenGegenstand>();
	}

	public void hinzufuegen(Anlage anlage, int anzahl) {
		gegenstaende.add(new AnlagenGegenstand(anlage, anzahl));
	}

	@Override
	protected void ausgeben() {
		System.out.println(this);
//		for (AnlagenGegenstand a : gegenstaende) {
//			System.out.println(a.getWert() + " " + a.toString());
//		}
		System.out.println(name + " Wert: " + getWert());
		
		System.out.println();
	}

	public String toString() {
		return name + gegenstaende.toString();
	}

	@Override
	public int berechneNeuenWert() {
		int erg = 0;

		System.out.println("--- Neue Werte berechnet! ---");
		System.out.println();
		
		for (AnlagenGegenstand a : gegenstaende) {
			a.berechneNeuenWert();
			erg += a.getWert();
		}

		return erg;
	}

	public int getWert() {
		int erg = 0;

		for (AnlagenGegenstand a : gegenstaende) {
			erg += a.getWert();
		}

		return erg;
	}

	private class AnlagenGegenstand {
		private int anzahl;
		private Anlage anlage;

		public String toString() {
			return "\n Anzahl: " + anzahl + ", Anlage: " + anlage.toString();
		}

		public AnlagenGegenstand(Anlage a, int anzahl) {
			this.anzahl = anzahl;
			anlage = a;
		}

		public void berechneNeuenWert() {
			anlage.berechneNeuenWert();
		}

		public int getWert() {
			int erg = anzahl * anlage.getWert();
			return  erg;
		}
	}
	
}
