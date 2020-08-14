package _01.lambda;

import java.lang.invoke.LambdaConversionException;

public class TestExample02 {

	public static void main(String[] args) {
		
		Message lambda1 = (String msg) -> System.out.println("Hello word lambda1");
		Message lambda2 = (msg) -> System.out.println("Hello word lambda2");
		
		Message lambda3 = (msg) -> {
			
			if(msg.contains("Hello"))
			{
				System.out.println("Hello word");
			}
			System.out.println("Hello word lambda3");
		};
		
		Message lambda4 = msg -> System.out.println("Hello word lambda4");
		
		
		
		lambda1.printMessage("Hello");
		lambda2.printMessage("Hello");
		lambda3.printMessage("Hello");
		lambda4.printMessage("Hello");
	}
}

// lambda gramerini fonksiyonel interface lerde kullanabiliriz.

@FunctionalInterface
interface Message
{
	public void printMessage(String msg);
}
