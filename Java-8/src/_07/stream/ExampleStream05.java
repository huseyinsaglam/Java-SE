package _07.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleStream05 {

	// Terminal operation lar bir kez intermediate operations dan sonra calisir.
	// birden fazla calisdiktan sonra hata firlatir
	// bir kere calisdiktan sonra zaten close olmus oluyor
	
	// NOT-1 : fonksiyonel interface sadece bir tane metot olmalýdýr.
	// diger metotlar olursa ya static yada default metotlar olmalidir.
	// object parametresi alinan metotlar sayilmamaktadir. Cunku Object sinifinda yer alýyor..
	// OR ->  Comparator<T> => boolean equals(Object obj);
	
	
	// NOT-2 : Genel olarak stream olarak donuyorsa terminal operation degildir.
	// geriye long, operation, int , String gibi donuyorsa terminal operation dur..
	public static void main(String[] args) {
		
		System.out.println("=========== Example1 ===========");
		
		Stream<String> str = Stream.of("fenerbahce","hatayspor","basaksehir","malatyaspor");
		Long strSize = str.count();
		System.out.println(strSize);
		
		
		System.out.println("=========== Example2 ===========");
		
		IntStream intStream  = IntStream.of(20,30,40,50,-20,-80);
		System.out.println(intStream.min());
		IntStream intStream2  = IntStream.of(20,30,40,50,-20,-80);
   		System.out.println(intStream2.min().getAsInt());
   		
   		
   		System.out.println("=========== Example3 ===========");
		
		Stream<String> str3 = Stream.of("fenerbahce","hatayspor","basaksehir","malatyaspor");
		System.out.println(str3.findFirst().get());
		
		
		System.out.println("=========== Example4 ===========");
		List<String> list =  Arrays.asList("fenerbahce","hatayspor","basaksehir","malatyaspor");
		list.stream().filter(i -> i.length()>7).limit(2).forEach(System.out::println);
		
		
		System.out.println("=========== Example5 ===========");
		// Supplier<T> =>  T get();
		// Stream.generate(()->"huseyin").forEach(System.out::println);
		// sonsuz donguye girer..
		
		System.out.println("=========== Example6 ===========");
		// Supplier<T> =>  T get();
		Stream.generate(()->"huseyin").limit(5).forEach(System.out::println);
		// sonsuz donguye girer..
		
		
	
		
		
	}
}
