package aufgabe8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class MorseAlphabet {
	private static HashMap<String, Character> morseToABC;
	private static HashMap<Character, String> abcToMorse;

	public static void main(String[] args) {
		init();
		String s = "Das soll der Beispieltext sein. Äpfel.";
		String bigS = s.toUpperCase();
		
		File f = new File("morse.txt");
		
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < bigS.length(); i++) {
				if (abcToMorse.containsKey( bigS.charAt(i) )) {
					bw.write(  abcToMorse.get( bigS.charAt(i) ));
					bw.write(" ");
				}
				
			}

			bw.flush();
			bw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
					
			String erg = br.readLine();

			String[] morsezeichen = erg.split(" ");
			
			for (String morse : morsezeichen) {
				System.out.print(morseToABC.getOrDefault(morse, ' '));
			}
			br.close();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

	public static void init() {
		morseToABC = new HashMap<String, Character>();
		abcToMorse = new HashMap<Character, String>();

		char h = 65;
		for (int i = 0; i < 25; i++) { // A-Z in Ascii
			morseToABC.put(morse[i], h);
			abcToMorse.put(h, morse[i]);

			h++;
		}

		h = 48;
		for (int i = 0; i < 10; i++) {
			morseToABC.put(morse[i + 25], h);
			abcToMorse.put(h, morse[i + 25]);
			h++;
		}

	}

	private static String[] morse = { ".-", // A
			"-...", // B
			"-.-.", // C
			"-..", // D
			".", // E
			"..-.", // F
			"--.", // G
			"....", // H
			"..", // I
			".---", // J
			"-.-", // K
			".-..", // L
			"--", // M
			"-.", // N
			"---", // O
			".--.", // P
			"--.-", // Q
			".-.", // R
			"...", // S
			"-", // T
			"..-", // U
			"...-", // V
			".--", // W
			"-..-", // X
			"-.--", // Y
			"--..", // Z
			".----", // 1
			"..---", // 2
			"...--", // 3
			"....-", // 4
			".....", // 5
			"-....", // 6
			"--...", // 7
			"---..", // 8
			"----.", // 9
			"-----" // 0
	};

}
