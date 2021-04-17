package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileIODemo {
public static void main(String[] args) {
	
	
	// to create a folder / blank file we can use File class / Files class
	
	
	File dir=new File("data");
	
	System.out.println(" is data exists? "+ dir.exists());
	
	
	// to create a folder we can use mkdirs method
	
	dir.mkdirs(); // will create folders under current project directory
	
	System.out.println(" is data exists? "+ dir.exists());
	
	
	File file=new File("data/mydata.txt"); // just a pointer to a file which may or may not exist
	
	// to create a blank file
	
	try {
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// create following directries in current project folder
		// corejava/notes/files
	File dirs=new File("corejava/notes/file");
	dirs.mkdirs();
	// create a blank file under corejava/notes/files called and fileNotes.txt
	
	
	File fil=new File(dirs, "fileNotes.txt");
	try {
		fil.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
