package fileWrite;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		
		File file = new File("file.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file,true);
			String[] essay = {"software engineer","Asus","File","Stream"};
			for(int i=0 ; i<essay.length ;i++)
			{
				byte[] essays = essay[i].getBytes();
				fos.write(essays);
			    System.out.println(i+1 + " index = " + essay[i]);
			}
			String essayNew = "software engineer";
			byte[] s = essayNew.getBytes();
			
			fos.write(65);
			fos.write(s);
		} catch (Exception e) {
			System.out.println("dosya yazýlamadý");
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("dosya kapatilamadi");
			}
			
		}
		

	}

}
