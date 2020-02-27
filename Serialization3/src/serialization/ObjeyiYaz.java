package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		
		File file = new File("ogrenci.txt");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream out = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			out = new ObjectOutputStream(fileOutputStream);
			
			
			Ogrenci ogrenci1 = new Ogrenci(150, "huseyin", "saglam");
			Ogrenci.setBolum("Muhendislik");
			out.writeObject(ogrenci1);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("dosya acilamadi");
		}
		catch (IOException e ) {
			System.out.println("Dosya acilirken IOException hatasi olustu ");
		}
//		finally {
//			try {
//				out.close();
//			} catch (IOException e) {
//				System.out.println("dosya kapatilamadi");
//			}
//		}
		

	}

}
