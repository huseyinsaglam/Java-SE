package _05.function;

import java.util.function.Function;

public class Example {
	
	public static void main(String[] args) {
		
		// Function<T, R> ==>  R apply(T t);
		Function<String, Integer> length1 = str -> str.length();
		// Function<String, Integer> length1 = (String str) -> str.length();
		
		
		System.out.println(length1.apply("hellword"));
		
		
	}

}
