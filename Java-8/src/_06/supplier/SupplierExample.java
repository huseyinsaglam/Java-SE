package _06.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.omg.CORBA.portable.Streamable;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		// Supplier<T> ==> T get();
		
		Random random = new Random();
		
		Supplier<Integer> int1 = () -> random.nextInt();
		
		Stream.generate(int1).limit(5).forEach(System.out::println);	
	}

} 
