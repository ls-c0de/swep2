package aufgabe17;

import java.util.ArrayList;

public class Patient {
	private String vorname;
	private String name;
	private ArrayList<Medikamente> med = new ArrayList<>();;
	
	public Patient(String vorname, String name, Medikamente... m) {
		this.vorname = vorname;
		this.name = name;
		for (Medikamente element : m) {
			med.add(element);
		}
	}
	
	public void addMedikament(Medikamente m) {
		med.add(m);
	}
	
	public ArrayList<Medikamente> gibMedikamente() {
		return med;
	}
	
	public String toString() {
		return vorname + " " + name + ":" ;
	}
	
}
