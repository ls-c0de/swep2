package aufgabe13_1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottozahlenMain {
	public static void main(String[] args) {
		Random rand = new Random();

		TreeSet<Integer>[] serie = new TreeSet[10];

		for (int i = 0; i < serie.length; i++) {
			
			serie[i] = new TreeSet<Integer>();
			
			for (int j = 0; j < 6; j++) {
				int temp = rand.nextInt(49) + 1;
				
				if (serie[i].contains(temp)) {
					j--;
				}
				
				serie[i].add(temp);
			}
		}
		
		for (Set<Integer> e : serie) {
			System.out.println(e);
		}
		System.out.println("Ende");
	}
}
