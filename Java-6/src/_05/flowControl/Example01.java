package _05.flowControl;

public class Example01 {
	
	public static void main(String[] args) {
		
		
		int x = 2;

		System.out.println("=========== Example1 ===========");
		switch (x) {
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		default:
			System.out.println("default");
			break;
		}

		// break yazmaya dikkat et..
		// break yazmaz isen hepsini yazar..
		System.out.println();
		
		System.out.println("=========== Example2 ===========");
		int y = 5;
		switch (y) {
		default:
			System.out.println("default");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");

		}
		
		System.out.println();
		System.out.println("=========== Example3 ===========");
		
		switch (x) {
		case 1:
			System.out.println("one"); break;
		case 2:
			System.out.println("two"); break;
		default:
			System.out.println("default");
			break;
		}
	}

}
