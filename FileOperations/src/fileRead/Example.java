package fileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		
		File dosya = new File("dosya3.txt");
		FileInputStream fis = null;
		int deger;
		String s ="";
		
		try {
			fis = new FileInputStream(dosya);
			fis.skip(5);
			while ((deger =  fis.read()) != -1)
			{
			
			  s = s+ (char )deger;
			
			}
			 System.out.println("Dosya icerigi : " + s);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya okunamadi 1 ");
		} catch (IOException e) {
			
			System.out.println("Dosya okunamadi 2 ");
		}
		finally {
            try {
                /*if (fis != null ){
                    fis.close();
                    
                } */
            	fis.close();
                
            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu...");
            }
		
		
		

	}
		
	
	}

}
