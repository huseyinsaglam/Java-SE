package _05.function;

import java.util.function.Function;

public class FunctionTest02 {

	public static void main(String[] args) {

		// public static int parseInt(String s)
		// Integer::parseInt; metot referans diye geçiyor..
		Function<String, Integer> f1 = Integer::parseInt;
		Function<String, Integer> f2 = (String str) -> {
			return Integer.parseInt(str);
		};
		Function<String, Integer> f3 = str -> Integer.parseInt(str);
		
		Integer parsedValue = f1.apply("1000");
		System.out.println(parsedValue);
		
		//  public static int abs(int a)
		
		Function<Integer, Integer> f4 = Math::abs;
	}
}
