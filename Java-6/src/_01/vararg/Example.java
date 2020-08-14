package _01.vararg;

public class Example {
	
	public void method(int ... numbers)
	{
		System.out.println(numbers.length);
	}
	
	public void method(String ... words)
	{
		System.out.println(words.length);
	}
	
	public static void main(String[] args) {
		
		Example example = new Example();
		example.method(1);
		example.method(1,2);
		example.method(1,2,3);
		
		
		example.method("ali");
		example.method("ali","ahmet");
		example.method("ali","ahmet","huseyin");
	}

}
