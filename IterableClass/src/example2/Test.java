package example2;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		String kisiler[]= {"ali","ahmet","huseyin"};
		
		Person person = new Person(kisiler);
		System.out.println(person.kisiler_listesi);
		person.abc();
		
//		for(String s : person)
//		{
//			System.out.println(s);
//		}
		
//		Iterator<String> itr = person.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}

	}

}
