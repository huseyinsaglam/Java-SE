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
			
			Ogrenci[] objects = (Ogrenci[]) oit.readObject();
			List<Ogrenci> listobjects = (List<Ogrenci>) oit.readObject();
			
			
			System.out.println("************Array*********************");
            for(Ogrenci s : objects)
            {
            	System.out.println(s);
            }
            
            
            System.out.println("**************ArrayList*******************");
            for(Ogrenci se : listobjects)
            {
            	System.out.println(se);
            }
			
			
			
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
