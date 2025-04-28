package aufgabe18;

import java.util.ArrayList;

public abstract class Subject {
	private ArrayList<IBeobachter> beobachter;
	
	public Subject() {
		beobachter = new ArrayList<IBeobachter>();
	}
	
	public void anmelden (IBeobachter b){
		beobachter.add(b);
	}
	
	public void abmelden (IBeobachter b){
		beobachter.remove(b);
	}
	
	public void benachrichtigen(){
		for (IBeobachter beob : beobachter){
			beob.aktualisieren();
		}
	}
}
