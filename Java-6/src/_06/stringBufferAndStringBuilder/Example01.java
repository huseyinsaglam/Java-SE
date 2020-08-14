package _06.stringBufferAndStringBuilder;

public class Example01 {

	public static void main(String[] args) {
		
		// StringBuilder compilerError = "compiler error";
		
		StringBuilder sb = new StringBuilder("Java");
		//sb = sb + "rules"; //not works!
		sb.append(" Rules!"); //obje mutable ozellige sahiptir kendisine atama yapmaya gerek YOKTUR!
		
		System.out.println(sb);
		
		//
		
		sb.delete(0,3);
		
		System.out.println(sb);
		
		sb.insert(3, "INSERT!");
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		//String str = sb; // StringBuilder IS-A String DEGILDIR!
		
		String str = sb.toString();
	}
}

// java.lang.StringBuffer
// java.lang.StringBuilder

// Bu siniflarin metotlari aynidir.
// StringBuffer in metotlari synchronized ozelige sahiptir. (thread-safe ozellge sahiptir.)
// StringBuilder in metotlari ise synchronized degildir. bu nedenle daha hizli calisir.