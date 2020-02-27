package array;

import java.lang.reflect.Array;

public class Example {

	public static void main(String[] args) {
		boolean durum = true;
		String[] array = new String[8];
		
		array[0]="hasim";
		if(durum)
		{
			array[0]="ali";
			array[1]="ahmet";
			array[2]="mehmet";
			array[3]="huseyin";
			
			
		}
		System.out.println("*****isimler*****");
		for(String s :array)
		{
			System.out.println(s);
		}
		
		
		if(durum)
		{
			array[4]="saglam";
			array[5]="tekin";
			array[6]="yilmaz";
			array[7]="koc";
			
		}
		
		System.out.println("*****soyisimler*****");
		for(String se :array)
		{
			System.out.println(se);
		}

	}

}
