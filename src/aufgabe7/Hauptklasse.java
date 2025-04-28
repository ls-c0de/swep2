package aufgabe7;

import java.util.Arrays;

public class Hauptklasse {

	public static void main(String[] args) {
		Konto[] k = new Konto[4];

		k[0] = new Konto(12345, 100);
		k[1] = new Konto(67890, 50);
		k[2] = new Konto(123, 0);
		k[3] = new Konto(456, 20);

		Arrays.sort(k, new vergleicheKontostand());
		for (Konto konto : k) {
			System.out.println(konto.toString());
		}
		
		System.out.println();
		
		Arrays.sort(k, new vergleicheKontonummer());
		for (Konto konto : k) {
			System.out.println(konto.toString());
		}
	}

}
