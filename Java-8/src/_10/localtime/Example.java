package _10.localtime;

import java.time.LocalTime;

public class Example {
	
	public static void main(String[] args) {
		
		
		// final class LocalTime  ( This class is immutable and thread-safe. )
		// LocalTime objeleri immutable ozelliktedir !
		
		LocalTime localTime1 = LocalTime.now();
		System.out.println(localTime1);
		
		LocalTime localTime2 = LocalTime.of(12, 50);
		System.out.println(localTime2);
	}

}
