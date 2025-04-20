package aufgabe7;

public class Sammelueberweisung extends Ueberweisung {

	private final static int MAX_UBERWEISUNGSANZAHL = 10;

	private Ueberweisung[] ueberweisungen = new Ueberweisung[MAX_UBERWEISUNGSANZAHL];

	@Override
	public void buchen() {
		for (int i = 0; i < ueberweisungen.length; i++) {
			if (ueberweisungen[i] == null) {
				continue;
			} else {
				ueberweisungen[i].buchen();
			}
		}
	}

	public void addUeberweisung(Ueberweisung ueberweisung) {

		for (int i = 0; i < ueberweisungen.length; i++) {
			if (ueberweisungen[i] == null) {
				ueberweisungen[i] = ueberweisung;
				break;
			}
		}
	}
}
