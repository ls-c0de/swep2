package aufgabe21;

public enum Spielstein {
	WEISS('o'), SCHWARZ('x'), LEER(' ');

	private final char zeichen;

	private Spielstein(char c) {
		zeichen = c;
	}

	public char toChar() {
		return zeichen;
	}
}
