package mp3_Kopyalama;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static List<Integer> icerik = new ArrayList<Integer>();
	
	public static void dosyaOku()
	{
		File file = new File("marþ.mp3");
		int deger;
		
		try {
			FileInputStream in = new FileInputStream(file);
			while ( (deger = in.read()) != -1)
			{
				icerik.add(deger);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void dosyaYaz()
	{
		try {
			FileOutputStream out = new FileOutputStream("mars2.mp3");
			
			for(int s : icerik)
			{
				out.write(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		dosyaOku();
		dosyaYaz();
		

	}

}
