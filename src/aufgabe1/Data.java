package aufgabe1;

import java.io.File;
import java.io.IOException;

public class Data extends DirectoryObject {
	private String currentDir;
	
	public Data(String path) {
		currentDir = path;
	}
	
	public void ausgeben() {
		System.out.println(this);
	}
	
	public String toString() {
		File f = new File(currentDir);
		try {
			return "Datei: " + f.getCanonicalPath();
		} catch (IOException e) {
			return "null";
		}
	}

}
