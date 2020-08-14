package _04.consumer;

import java.util.function.Consumer;

public class Example {

	public static void main(String[] args) {
		
		
		//  Consumer<T> ==> void accept(T t);
		Consumer<String> predicate = str -> System.out.println(str.toUpperCase());
		predicate.accept("hello");
	}
}
