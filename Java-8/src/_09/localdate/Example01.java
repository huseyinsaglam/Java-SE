package _09.localdate;

import java.time.LocalDate;

public class Example01 {

	
	public static void main(String[] args) {
		
		// LocalDate immutable objelerdir !! ( This class is immutable and thread-safe. )
		//  final class LocalDate
		
		LocalDate local1 = LocalDate.now();
		System.out.println(local1);
		
		LocalDate local2 = LocalDate.of(2020, 8, 17);
		System.out.println(local2);
	}
}
