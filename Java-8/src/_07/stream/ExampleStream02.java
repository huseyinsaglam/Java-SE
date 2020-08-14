package _07.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleStream02 {
	
	public static void main(String[] args) {
		
		System.out.println("=========== Example1 ===========");
		
		// 1- Stream source (1 dahil 10 dahil degil)
		 IntStream.range(1, 10).forEach(System.out::println);
		 
		 System.out.println("=========== Example2 ===========");
		
		// 2 - Stream source
		// for(int i=1 ; i<10;i++)
	     IntStream.iterate(1, i -> i+1).skip(5).limit(10).forEach(System.out::println);
		
	     System.out.println("=========== Example3 ===========");
	     
		// 3- Stream source
		List<String> list = Arrays.asList("ali","ahmet","davut","polat","fener");
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
		
		System.out.println("=========== Example4 ===========");
		
		//  Supplier<T> =>  T get();
		// supplier =>  Math.public static double random();
		// 4 - Stream source
		Stream<Double> dbr = Stream.generate(Math::random).limit(5);
		dbr.forEach(System.out::println);
		
		System.out.println("=========== Example5 ===========");
		// 5 - Stream source
		Stream.of("fenerbahce","hatayspor","basaksehir","malatyaspor").forEach(System.out::println);
		
		System.out.println("=========== Example6 ===========");
		// 6- Stream source
		int a[]={33,3,4,5};
		List<int []> arr = Arrays.asList(a);
		Stream<int []> arr_stream = arr.stream();
		arr_stream.forEach(System.out::println);
	}

}
