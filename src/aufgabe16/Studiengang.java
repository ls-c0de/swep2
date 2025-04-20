package aufgabe16;

public enum Studiengang {
	INFORMATIK(8), WIRTSCHAFTSINFORMATIK(8), ELEKTROTECHNIK(9), MASCHINENBAU(7);

	private final int regelstudienzeit;

	private Studiengang(int regelstudienzeit) {
		this.regelstudienzeit = regelstudienzeit;
	}

	public int gibRegelstudienzeit() {
		return regelstudienzeit;
	}
}
