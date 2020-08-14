package _07.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStream04 {
	
	public static void main(String[] args) {
		
		System.out.println("=========== Example1 ===========");
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("ali");
		List<String> two = Arrays.asList("ahmet","mehmet");
		Stream<List<String>> animals = Stream.of(zero,one,two);
		animals.flatMap(i -> i.stream()).forEach(System.out::println);
		
	}

}
