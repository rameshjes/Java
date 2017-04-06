package practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		
		System.out.println("============================ List files from directory ==============================");
		getContentWithExtension();
		
		System.out.println("============================= Read Data from file ==================================== ");
		readDatafromFile();
		writeDataToFile();
	}

	/*
	 * Write a Java program to get specific files by extensions from a specified
	 * folder.
	 */
	public static void getContentWithExtension() {

		String str = "/home/ramesh/workspace/JavaPractice/src/practise";
		File f = new File(str);

		String[] list = f.list();

		for (String s : list) {

			if (s.toLowerCase().endsWith(".txt")) {
				// System.out.println(s);
				System.out.println(s);

			}
		}

	}

	// Read data from file
	public static void readDatafromFile() throws FileNotFoundException {

		File f = new File("/home/ramesh/workspace/JavaPractice/src/practise/intro.txt");

		Scanner file = new Scanner(f);

		while (file.hasNextLine()) {
			String read = file.nextLine();
			System.out.println(read);
		}

	}

	// Write data to file
	public static void writeDataToFile() throws IOException {
		File f = new File("/home/ramesh/workspace/JavaPractice/src/practise/writeFile.txt");

		f.createNewFile(); // create empty file

		FileWriter write = new FileWriter(f); // write data to created file

		write.write("This data is being written to file");
		write.flush();
		write.close();

	}

}