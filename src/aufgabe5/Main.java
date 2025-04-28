package aufgabe5;

public class Main {
	public static void main(String[] args) {
		Buch[] buecher = { new Buch("Der Hobbit", "J.R.R. Tolkien", 1599), new Buch("1984", "George Orwell", 1699) };

		Bestellposition<Buch> buchPosition = new Bestellposition<>(1, buecher[0]);

		Warenkorb warenkorb = new Warenkorb();
		warenkorb.anhaengen(buchPosition);

		SDKarte[] sdkarten = { new SDKarte("SanDisk", 64, 1999), new SDKarte("Kingston", 128, 2999) };

		Bestellposition<SDKarte> sdKartePosition1 = new Bestellposition<>(3, sdkarten[0]);
		Bestellposition<SDKarte> sdKartePosition2 = new Bestellposition<>(3, sdkarten[1]);

		warenkorb.anhaengen(sdKartePosition1);
		warenkorb.anhaengen(sdKartePosition2);

		int differenz = sdKartePosition1.gutschrift(sdKartePosition2);
		System.out.println("Differenzbetrag: " + differenz + " Cent");

		warenkorb.aktualisiereBestellwert();
		System.out.println(warenkorb);

	}

}
