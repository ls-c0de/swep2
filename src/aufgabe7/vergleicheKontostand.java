package aufgabe7;

import java.util.Comparator;

public class vergleicheKontostand implements Comparator<Konto> {

	@Override
	public int compare(Konto o1, Konto o2) {
		return o2.getKontostand() - o1.getKontostand();
	}

}
