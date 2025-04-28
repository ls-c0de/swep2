package aufgabe7;

import java.util.Comparator;

public class vergleicheKontonummer implements Comparator<Konto>{

	@Override
	public int compare(Konto o1, Konto o2) {
		return o2.getKontonummer() - o1.getKontonummer();
	}

}
