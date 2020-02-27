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
			Ogrenci ogrenci2 = new Ogrenci(1907, "fenerbahce", "spor klubu");
			Ogrenci ogrenci3 = new Ogrenci(15, "ahmet", "yilmaz");
			Ogrenci ogrenci4 = new Ogrenci(19, "mehmet", "yilmaz");
			Ogrenci objects[] = {ogrenci1,ogrenci2,ogrenci3,ogrenci4};
			List<Ogrenci> listobjects = new ArrayList<Ogrenci>(Arrays.asList(objects));
			out.writeObject(objects);
			out.writeObject(listobjects);
			
			
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
