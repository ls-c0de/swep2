package aufgabe6;

import java.util.Arrays;
import java.util.Random;

public class Hauptklasse2_6 {

	public static void main(String[] args) {
		Konto[] k = new Konto[4];

		k[0] = new Konto(12345, 100);
		k[1] = new Konto(67890, 50);
		k[2] = new Konto(123, 0);
		k[3] = new Konto(456, 20);

		for (Konto konto : k) {
			System.out.println(konto.toString());
		}

		System.out.println();

		Arrays.sort(k);

		for (Konto konto : k) {
			System.out.println(konto.toString());
		}

		Random rand = new Random();
		
		for (int i = 0; i < k.length; i++) {
			k[i].setKontostand(i * rand.nextInt(50));
		}
		
		System.out.println();
		
		Arrays.sort(k);

		for (Konto konto : k) {
			System.out.println(konto.toString());
		}

		// int random = (int) (Math.random()*((100-1)+1));
		// System.out.println(random);
	}

}
