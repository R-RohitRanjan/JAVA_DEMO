package com.sdetjava.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Rohit
 *
 */
public class CreateDirectory {

	public static void main(String[] args) {
		File dir = new File("d:\\testData");
		dir.mkdirs();
		
		String fileName = "movie.txt";
		File path = new File(dir,fileName );
		
		try(FileWriter writer = new FileWriter(path)){
			path.createNewFile();
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("1001, Gunjan , Hindi , 12-12-2020"
			+"\n1002, Tanhaji, Hindi , 02-04-2019"
			+"\n1003, Acharya, English, 02-04-2004");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close(); 
			System.out.println("Data are Added Successfully to the file : ["+fileName.toUpperCase()+"] at : ["+dir+"] location");
			System.out.println("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
