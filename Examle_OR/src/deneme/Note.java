package deneme;

import java.util.Scanner;

public class Note {
	
	
	public static void mekanaGiris(int yasi) throws Exception
	{
		if(yasi<18)
		{
			throw new Exception();
		}
		else
		{
			System.out.println("Mekana hosgeldiniz..");
		}
	}

	public static void main(String[] args) {
		
		
		Scanner giris = new Scanner(System.in);
		int yas;
		System.out.println("Lütfen bir yasinizi giriniz =");
		yas=giris.nextInt();
		
		try {
			mekanaGiris(yas);
		} catch (Exception e) {
			System.out.println("18 yasindan kucukler mekana giremez");
		}
		
		

		

	}

}
