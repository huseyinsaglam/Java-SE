package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {

	public static void main(String[] args) {
		File file = new File("ogrenci.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			ObjectInputStream oit = new ObjectInputStream(fileInputStream);
			
			Ogrenci ogrenci13 = (Ogrenci) oit.readObject();
			Ogrenci ogrenci23 = (Ogrenci) oit.readObject();
			
			
			System.out.println("*********************************");
            System.out.println(ogrenci23);
            System.out.println("*********************************");
            System.out.println(ogrenci13);
          
			
			
		} catch (FileNotFoundException e) {
			System.out.println("dosya okunurken hata olustu");
		}
		catch (IOException e) {
			System.out.println("dosya okunurken IOException  hatasi olustu");
		}
		catch (ClassNotFoundException e) {
			System.out.println("sinif bulunamadi");
		}

	}

}
