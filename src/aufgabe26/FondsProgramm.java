package aufgabe26;

import aufgabe23.*;

public class FondsProgramm {
	public static void main(String[] args) {
		Fonds f = new Fonds("DerFonds");
		Aktie a1 = new Aktie("Daimler", 100, new SiebenProzent());
		Aktie a2 = new Aktie("VW", 200, new SiebenProzent());
		Aktie a3 = new Aktie("Porsche", 300, new SiebenProzent());
		Aktie a4 = new Aktie("Opel", 400, new SiebenProzent());
		
			Aktie a9 = new Aktie("Nvidia", 1000, new NeuGleichAlt()); //Einschub 1
			f.hinzufuegen(a9, 10); //Einschub 2
		
		f.hinzufuegen(a1, 10);
		f.hinzufuegen(a2, 20);
		f.hinzufuegen(a3, 30);
		f.hinzufuegen(a4, 40);
		
		//System.out.println("Fond-Wert 1: " + f.getWert()); //Einschub 3
		
		f.ausgeben();
		f.berechneNeuenWert();
		f.ausgeben();
		
		Fonds f1 = new Fonds("Unterfonds");
		Aktie a5 = new Aktie("Bayer", 10, new SiebenProzent());
		Aktie a6 = new Aktie("Hoechst", 20, new Zufall());
		Aktie a7 = new Aktie("Aventis", 30, new NeuGleichAlt());
		Aktie a8 = new Aktie("MedPharm", 40, new Quadrat());
		
		
		f1.hinzufuegen(a1, 10);
		f1.hinzufuegen(a5, 10);
		f1.hinzufuegen(a6, 10);
		f1.hinzufuegen(a7, 10);
		f1.hinzufuegen(a8, 10);
		f.hinzufuegen(f1, 3);
		
		//System.out.println("Fond-Wert 2: " + f.getWert()); //Wert 2
		
		f.ausgeben();
		f.berechneNeuenWert();
		f.ausgeben();
		
		//System.out.println("Fond-Wert 3: " + f.getWert()); //Wert 3
	}
}