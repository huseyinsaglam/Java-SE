package _06.stringBufferAndStringBuilder;

public class Example02 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		//
		System.out.println(sb1.equals(sb2));// false olur!!
		// StringBuilder objesi uzerinden equals KULLANMA !
		// bu direkt == ile ayni anlama gelir.
		// cunku bu siniflarda equals metodu override edilmemistir!
		
		
		System.out.println(sb1.toString().equals(sb2.toString()));
	}
}
