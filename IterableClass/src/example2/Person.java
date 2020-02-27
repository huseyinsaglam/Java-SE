package example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Person implements Iterable<String>{
	
	public List<String> kisiler_listesi = new ArrayList<String>();
	
	public Person(String[] kisiler)
	{
		
		for(String kisi : kisiler)
		{
			kisiler_listesi.add(kisi);
			
		}
		//abc();
	}
	
	

//	for(List<String> kisi : kisiler_listesi)
//	{
//		System.out.println(kisi);
//		
//	}
	public void abc(){
//	for(String kisiler : kisiler_listesi)
//	{
//		System.out.println(kisiler);
//		
//	}
		ListIterator<String> itr = kisiler_listesi.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	

	@Override
	public Iterator<String> iterator() {
		
		return kisiler_listesi.iterator();
	}
	
	
	
	
	

	
}

