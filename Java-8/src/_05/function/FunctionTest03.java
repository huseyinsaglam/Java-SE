package _05.function;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionTest03 {

	public static void main(String[] args) {
		
		// public static int parseInt(String s) 
		//Function<String , Integer> parseInt = Integer::parseInt;
		
		Function<String , Integer> parseInt = FunctionTest03::parseMyString;
		Function<Integer, Integer> f2 = Math::abs;
		
        Arrays.stream("-4,-9,-16".split(",")).map(parseInt).forEach(System.out::println);
        //
        
        System.out.println();
        Arrays.stream("-4,-9,-16".split(",")).map(parseInt).map(f2).forEach(System.out::println);
		//
	}
	
	public static int parseMyString(String str) {
		return Integer.parseInt(str);
	}
}
