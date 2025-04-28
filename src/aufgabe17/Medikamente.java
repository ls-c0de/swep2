package aufgabe17;

public enum Medikamente {
//	Husten("Bronchikum"), Schnupfen("Nasic"), Kopfschmerzen("Thomapyrin"), Halsschmerzen("Dobendan"), 
//	Schlafstoerung("Neurexan"), Kobritis("Antaclin");
	
	Bronchikum("Husten"), Nasic("Schnupfen"), Thomapyrin("Kopfschmerzen"), Dobendan("Halsschmerzen"),
	Neurexan("Schlafstoerung"), Antaclin("Kobritis");

	private final String medikament;
	
	Medikamente(String string) {
		this.medikament = string;
	}

	public String gibBeschwerde() {
		return medikament;
	}
}
