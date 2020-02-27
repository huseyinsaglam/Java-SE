package stackException;

public class Example {
	
	public static void ucuncuFonksiyon()
	{
		int a = 12 / 0;
		System.out.println("ucuncu metodu");

	}
	public static void ikinciFonk()
	{
		try {
			ucuncuFonksiyon();
			
		} catch (Exception e) {
			System.out.println("bir sayý 0 ile bolunemez");
		}
		
		System.out.println("ikinci metodu");

	}
	public static void birinciFonk()
	{
		ikinciFonk();
		System.out.println("birinci metodu");

	}
	public static void main(String[] args) {
		birinciFonk();
		System.out.println("main metodu");

	}

}
