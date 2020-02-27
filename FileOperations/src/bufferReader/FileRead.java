package bufferReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		
		
		File file = new File("ogrenciler.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			Scanner scanner = new Scanner(bufferedReader);
			while(scanner.hasNextLine())
			{
			  String ogrenciBilgisi = scanner.nextLine();
			  String[] array = ogrenciBilgisi.split(",");
				if(array[1].equals("Bilgisayar Muhendisligi"))
				{
					System.out.println(ogrenciBilgisi);
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("dosya okunmadi");
		}

	}

}
