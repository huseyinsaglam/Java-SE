package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		
		File file = new File("dosya5.txt");
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(file);
			writer.write("Fenerbahce Spor Klubu\n");
			writer.write("Software Developer");
		} catch (IOException e) {
			System.out.println("dosya yazilamadi");
		}
		finally{
			
		  try {
			writer.close();
		} catch (IOException e) {
			System.out.println("Dosya kapatilamadi");
		}
		}
		
	}
	

}
