
package _01.lambda;

public class TestExample {
	public static void main(String[] args) {
		
		Calculate lambda1 = (int m , int n) -> m+n;
		
		Calculate lambda2 = (x , y) -> x-y;
		
		Calculate lambda3 = (int i , int j) -> {
			
			if(i==10)
			{
				System.out.println("Test message");
			}
			
			return i*j;
			};
		
			
			System.out.println(lambda1.operation(10, 20));
			System.out.println(lambda2.operation(10, 20));
			System.out.println(lambda3.operation(10, 20));
	}

}

//lambda gramerini fonksiyonel interface lerde kullanabiliriz.
@FunctionalInterface
interface Calculate
{
	int operation(int a,int b);
}
