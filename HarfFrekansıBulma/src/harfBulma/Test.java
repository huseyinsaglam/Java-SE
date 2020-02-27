package harfBulma;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		Map < Character,Integer> frekans = new TreeMap<Character,Integer>();
		
		String ifade;
		System.out.println("ifade giriniz : ");
		ifade = giris.nextLine();
		
		for(int i=0;i<ifade.length();i++)
		{
			
				char c = ifade.charAt(i);
				if(frekans.containsKey(c))
				{
					int d =frekans.get(c);
					frekans.replace(c, d+1);
					
				}
				else
				{
				frekans.put(c, 1);
				}
			System.out.println(frekans);
				
		}
		
		 for (Map.Entry<Character,Integer> entry : frekans.entrySet()) {
	            System.out.println("Karakter : " + entry.getKey() + " " + entry.getValue() + " kadar geciyor...");
	            
	            
	        }
		
		
				

	}

}
