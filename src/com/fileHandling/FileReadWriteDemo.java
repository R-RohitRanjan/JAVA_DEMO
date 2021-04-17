package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {

	public static void main(String[] args) {
		
		FileReadWriteDemo  obj=new FileReadWriteDemo();
		
		
		String filename ="corejava/notes/file/fileNotes.txt";
		//obj.writeDataToFile("\n File class helps to create blank files or folders ", filename );
		//obj.readFileData(filename);
		obj.readFileUsingBufferedReader(filename);
		

	}
	
	
	void readFileUsingBufferedReader(String filename){
		
		
		try(FileReader reader=new FileReader(filename);
		BufferedReader in =new BufferedReader(reader)){
			
			String line= in.readLine();
			
			do{
				System.out.println(line);
				line= in.readLine();
			}while(line!=null);
			
			
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
	}
	
	
	
	
	
	void readFileData(String fileName){
		
		//FileReader reader=null;
		// Use Try with resource statement 
		// will close the used streams automatically and no need to write finally block
		try(FileReader reader= new FileReader(fileName)) {
			//reader=new FileReader(fileName);
			// keep reading until it returns  -1
			int ch=0;
			do{
				ch=reader.read();
				if(ch==-1) break;
				System.out.print((char)ch);
				
			}while(ch!=-1);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*
		// this will not be needed as we have used try with resource
		finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
	}
	
	void writeDataToFile(String data, String filename){
		// which steam should we use here input /output  : Outputstream to write
		// to write simple text based data which stream should we use?
		// Byte / Character
		
		//  use Character to write characters
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(filename,true);
			writer.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" --- Data copied to file....");
		
		
	}

}
