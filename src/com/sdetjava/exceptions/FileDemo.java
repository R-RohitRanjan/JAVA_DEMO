package com.sdetjava.exceptions;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public FileDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		File f = new File("D:\testData/movie.txt");
		f.mkdirs();
		File f1 = new File("corejava/notes/file","fileNotes.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
