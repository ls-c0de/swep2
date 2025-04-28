package aufgabe7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UeberweisungTest {

	private Konto konto1;
	private Konto konto2;

	@BeforeEach
	public void initUeberweisung() {
		System.out.println("Hallo");
		konto1 = new Konto(12345, 100);
		konto2 = new Konto(67890, 50);
	}

	@Test
	public void buchenKleinerZahlTest() {
		Einzelueberweisung einzelueberweisung = new Einzelueberweisung(konto1, konto2, 20);
		einzelueberweisung.buchen();

		assertEquals(80, konto1.getKontostand());
		assertEquals(70, konto2.getKontostand());
	}
	
	@Test
	public void buchenZahlTest() {
		Einzelueberweisung einzelueberweisung = new Einzelueberweisung(konto1, konto2, 20);
		einzelueberweisung.buchen();

		assertEquals(80, konto1.getKontostand());
		assertEquals(60, konto2.getKontostand());
	}

}
