package aufgabe1;

import java.io.File;
import java.io.IOException;

public class Directory extends DirectoryObject {
	private final int maxFiles = 100;
	private DirectoryObject[] dataArray;
	private String currentDir;

	public Directory(String path) throws directoryException {
		if (!path.isEmpty()) {
			this.currentDir = path;
		} else {
			throw new directoryException();
		}

		File f = new File(currentDir);
		File[] subDirs = f.listFiles();

		if (subDirs.length == 0) {
			System.out.print("Empty Directory! ");
			try {
				System.out.println(f.getCanonicalPath());
			} catch (IOException ioe) {
				
			}
			// ausgeben();
		} else {
			dataArray = new DirectoryObject[subDirs.length];
			for (int i = 0; i < subDirs.length; i++) {
				if (subDirs[i].isDirectory()) {
					dataArray[i] = new Directory(subDirs[i].toString());
				} else if (subDirs[i].isFile()) {
					dataArray[i] = new Data(subDirs[i].toString());
				}
			}
		}

	}

	public void ausgeben() {
		System.out.println(this);
		if (dataArray == null) {
			System.out.print("Empty Directory ");
			System.out.println(currentDir);
		} else {
			for (int i = 0; i < dataArray.length; i++) {
				dataArray[i].ausgeben();
			}
		}
	}

	public String toString() {
		File f = new File(currentDir);
		try {
			return "Verzeichnis: " + f.getCanonicalPath();
		} catch (IOException e) {
			return "null";
		}
	}

}
