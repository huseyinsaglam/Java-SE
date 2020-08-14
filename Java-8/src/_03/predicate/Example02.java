package _03.predicate;

import java.util.function.Predicate;

public class Example02 {
	
	public static void main(String[] args) {
		
		//  Predicate<T> ==> boolean test(T t);
		Predicate<String> nullCheck = str -> str != null;
		Predicate<String> emptyCheck = str -> str.length()>0;
		Predicate<String> mergeCheck = nullCheck.and(emptyCheck);
		
		String message = "Hello Word";
		String nullStr = null;
		
		System.out.println(mergeCheck.test(message));
		System.out.println(mergeCheck.test(nullStr));
		
	}

}
