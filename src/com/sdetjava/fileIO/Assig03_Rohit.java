package com.sdetjava.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Rohit
 *
 */
public class Assig03_Rohit {

	public static void main(String[] args) throws IOException {
		
		String filename = "d:\\testData\\movie.txt";
		Assig03_Rohit util = new Assig03_Rohit();
		
		System.out.println("*********************************************************************");
		System.out.println("Previously added data are available in the File :["+filename+"] are: ");
		System.out.println("**********************************************************************");
		
		util.printData(filename);
		
		System.out.println("*********************************************************************");
		System.out.println("Newly added data to the File :["+filename+"] are: ");
		System.out.println("**********************************************************************");
		
		util.appendData("1004, Dangal , Hindi , 23-12-2016", filename);
		util.appendData("1005, KGF , Hindi , 21-12-2018", filename);
		util.appendData("1006, Guzarish , Hindi , 19-11-2010", filename);

	}
	
//****************************READ DATA FROM THE FILE & PRINT ON THE CONSOLE*************************************
	
	public void printData(String fileName){
		
		try (FileReader fileReader = new FileReader(fileName)){
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
//***********************************APPEND DATA TO THE FILE***************************************************
	
	public void appendData(String data, String fileName) {
		System.out.println("New Data ["+data.toUpperCase()+
				"] is Appended to the File at Location	: ["+fileName+"]");
		try (FileWriter writer = new FileWriter(fileName,true)){
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(data);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
