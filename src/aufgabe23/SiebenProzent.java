package aufgabe23;

public class SiebenProzent implements IWert {

	@Override
	public int gibNeuenWert(int alterWert) {
		int x = (int) (Math.random() * 2);
		if (x == 0)
			x = -1;
		return (int) Math.round(alterWert + x * 0.07 * alterWert);
	}
}
