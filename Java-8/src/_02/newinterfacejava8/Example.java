package _02.newinterfacejava8;

public class Example implements Calculater {

	@Override
	public void printMessage(int msg) {
		System.out.println("implement messages");
		
	}

}


interface Calculater
{
	public void printMessage(int msg);
	// DEFAULT AND STATIC METOTLAR implement edilmez.
	public default void printMessages(int msg)
	{
		System.out.println("default messages");
	}
	
	public static void printMessagess(int msg)
	{
		System.out.println("static messages");
	}
}
