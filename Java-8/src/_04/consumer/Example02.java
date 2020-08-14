package _04.consumer;

import java.util.function.Consumer;

public class Example02 {
	
	public static void main(String[] args) {
		
		Consumer<String> c1 = str -> System.out.println(str);
		Consumer<String> c2 = System.out::println;
		
		// System.out::println => System.out.println(String x);
		// c1 ve c2 ayni anlamdadir
		
		c1.accept("hello");
		c2.accept("hello");
	}

}
