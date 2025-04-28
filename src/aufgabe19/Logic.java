package aufgabe19;

import java.util.Random;

public final class Logic {
	private static int anzahlWuerfe = 1;
	
	public static String werfen() {
		anzahlWuerfe++;
		
		Random rand = new Random();
		int erg = rand.nextInt(2);
		
		if (erg == 0) {
			return "Zahl";
		} else {
			return "Kopf";
		}
	}
	
	public static String gibAnzahlWuerfe() {
		return "" + anzahlWuerfe;
	}

}
