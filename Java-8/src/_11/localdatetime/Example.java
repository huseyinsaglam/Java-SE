package _11.localdatetime;

import java.time.LocalDateTime;

public class Example {

	public static void main(String[] args) {
		
		
		//  final class LocalDateTime (  This class is immutable and thread-safe. )
		// LocalDateTime objeleri immutable ozellige sahiptir...
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
}
