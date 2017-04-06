package practise;

import java.io.File;

public class ListDirectoryContents {

	public static void main(String[] args) {

		getListFiles();
	}

	/*
	 * Write a Java program to get a list of all file/directory names from the
	 * given.
	 */
	public static void getListFiles() {
		String str = "/home/ramesh/workspace/JavaPractice/src/practise";
		File f = new File(str);

		boolean checkfile = f.exists();
		if (checkfile == true) {
			System.out.println(checkfile);
			String[] filelist = f.list();
			for (String s : filelist) {
				System.out.println(s);
			}

		}

	}

}
