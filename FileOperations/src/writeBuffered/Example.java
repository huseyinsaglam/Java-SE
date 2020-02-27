package writeBuffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		
		File file = new File("ogrenciler.txt");
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file,true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Huseyin Saglam, Software Developer\n");
		} catch (IOException e) {
			System.out.println("Dosya yazilamadi");
		}
		finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				System.out.println("dosya kapatilamadi");
			}
		}
		

	}

}
