package aufgabe4;

public class GenerischeDatentypen {
	public static void main(String [] args) {
		IFlaecheninhalt[] arr = new IFlaecheninhalt[8];
		
		arr[0] = new Dreieck<Integer>(1, 2);
		arr[1] = new Dreieck<Double>(1.0, 2.0);
		
		arr[2] = new  Quadrat2<Integer>(4);
		System.out.println(arr[2].gibFlaechenInhalt());
		
		//Dreieck<String> s = new Dreieck<String>("Hi", "Hallo"); //NICHT MOEGLICH
		
		for (int i = 0;i < 1;i++) {
			System.out.println(arr[i].gibFlaechenInhalt()); 
		}
	}

}
