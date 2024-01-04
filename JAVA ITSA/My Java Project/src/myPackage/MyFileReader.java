package myPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	public static void readTxtFile() throws IOException {
		
		FileReader fr = new  FileReader("./data/Customer.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String File = null ;
		String[ ] token ;
		
		while( (File = br.readLine()) != null ) {
			System.out.println(File);
			token = File.split("\t");
			
			System.out.println(" ");
			
			System.out.println(token[0]);
			System.out.println(token[1]);
			System.out.println(token[2]);
			System.out.println(token[3]);
			System.out.println(token[4]);
			
			System.out.println(" ");
		}
		
		if (br != null) {
			br.close();
		}
	}

	public static void main(String[] arsg) throws IOException {
		MyFileReader.readTxtFile();
	}
}
