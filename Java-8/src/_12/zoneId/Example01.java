package _12.zoneId;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example01 {
	
	public static void main(String[] args) {
		
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		
		ZonedDateTime  dateTime = ZonedDateTime.now();
		System.out.println(dateTime);
	
	}

}
