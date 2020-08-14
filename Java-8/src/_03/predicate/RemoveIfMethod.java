package _03.predicate;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;

public class RemoveIfMethod {
	public static void main(String[] args) {
		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
		greeting.add("test");
		greeting.add("sample");
		//
		greeting.removeIf(str -> str.startsWith("h"));
		greeting.forEach(System.out::println);
		
		System.out.println(greeting);
	}
}