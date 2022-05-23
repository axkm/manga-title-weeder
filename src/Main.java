import java.io.File;
import java.util.Scanner;

public class Main {
	
	private final static String dataPath = "./src/manga data/";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final File folder = new File(dataPath);
		listFilesForFolder(folder);
	}
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}

}
