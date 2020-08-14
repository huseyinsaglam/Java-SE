package _07.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ExampleStream03 {
	
	public static void main(String[] args) {
		
		System.out.println("=========== Example1 ===========");
		// 1-distinct intermediate operations
		Stream.of("a1","a2","a3","a1","a2","a4","a5").distinct().forEach(System.out::println);
		
		System.out.println("=========== Example2 ===========");		
		// 2 - peek intermediate operations
		Stream<String> str = Stream.of("fenerbahce","hatayspor","basaksehir","malatyaspor");
		Long long1 = str.peek(System.out::println).count();
		System.out.println(long1);
		
		System.out.println("=========== Example3 ===========");		
		//  <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// 	Function<T, R> ==>  R apply(T t);
		Stream<String> str2 = Stream.of("fenerbahce","hatayspor","basaksehir","malatyaspor");
		str2.map(i->i.length()).forEach(System.out::println);
		
		System.out.println("=========== Example4 ===========");	
		//  	Function<T, R> ==>  R apply(T t);
		// Math . public static double sqrt(double a);
		// burada goruldugu gibi sqrt double alýyor ve geriye double donuyor..
		DoubleStream.of(1.0,4.0,9.0,16.0).map(Math::sqrt).forEach(System.out::println);
		
		System.out.println("=========== Example5 ===========");	
		//  	Function<T, R> ==>  R apply(T t);
		// String.  public int length();
		Stream<String> str3 = Stream.of("fenerbahce","hatayspor","basaksehir","malatyaspor");
		str3.map(String::length).forEach(System.out::println);
		
		
		System.out.println("=========== Example6 ===========");	
		//  	Function<T, R> ==>  R apply(T t);
		// Math . public static double sqrt(double a);
		// burada goruldugu gibi sqrt double alýyor ve geriye double donuyor..
		double summ = DoubleStream.of(1.0,4.0,9.0,16.0).map(Math::sqrt).peek(System.out::println).sum();
		System.out.println(summ);
		
	}

}
