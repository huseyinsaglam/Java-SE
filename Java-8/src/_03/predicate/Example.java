package _03.predicate;

import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		
		Stream.of("hello","word","sample","data","test").filter(str -> str.startsWith("h")).forEach(System.out::println);
		
	}
}
