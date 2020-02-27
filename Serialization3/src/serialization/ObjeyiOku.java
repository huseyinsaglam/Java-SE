package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjeyiOku {

	public static void main(String[] args) {
		File file = new File("ogrenci.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			ObjectInputStream oit = new ObjectInputStream(fileInputStream);
			

			Ogrenci ogrenci = (Ogrenci) oit.readObject();
			System.out.println(ogrenci);
			System.out.println("Static anahtar kelimesi =" +Ogrenci.getBolum());
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("dosya okunurken hata olustu");
		}
		catch (IOException e) {
			System.out.println("dosya okunurken IOException  hatasi olustu");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
