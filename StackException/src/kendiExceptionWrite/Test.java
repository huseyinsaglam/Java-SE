package kendiExceptionWrite;

import java.util.Scanner;

public class Test {
	
//	public static void mekan_kontrol(int yas)
//	{
//		if(yas<18)
//		{
//			try {
//				throw new InvalidAgeException();
//			} catch (InvalidAgeException e) {
//				e.printStackTrace();
//				
//			}
//			
//			
//		}
//		else
//		{
//			System.out.println("Mekana Hosgeldiniz");
//		}
//	}
	
	
	public static void mekan_kontrol(int yas) throws InvalidAgeException 
	{
	    throw new InvalidAgeException();
		
		
		
	}


	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int yas;
		System.out.println("Lütfen bir yasinizi giriniz =");
		yas=giris.nextInt();
		
		
		// mekan_kontrol(yas);
		
		try {
			mekan_kontrol(yas);
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}

	}

}
