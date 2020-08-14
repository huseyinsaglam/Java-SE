package _04.operation;

public class Example01 {
	
	public static void main(String[] args) {
		
		
		System.out.println("=========== Example1 ===========");
		
		int a=10;
		System.out.println("reply : " + a+3); // 103
		System.out.println("reply : " + (a+3)); // 13
		
		System.out.println("=========== Example2 ===========");
		
		int i = 10;
		int j=10;
		System.out.println(i++); // postfix -> ilk once yazar sonra artirma islemi yapar
		System.out.println(++j); // prefix -> ilk once artirma islemi yapar sonra sonra yazar
		
		
		System.out.println("=========== Example3 ===========");	
		int point = 100;
		String condition = point >= 50 ? "sayi 50 den buyuk" : "sayi 50 den kucuk";
		System.out.println(condition);
		
		System.out.println("=========== Example4 ===========");	
		int p = 100;
		String cond = point >= 110 ? "sayi 110 den buyuk  " : point >= 50 ? "sayi 50 den buyuk  " : "sayi 50 den kucuk";
		System.out.println(cond);
		
		System.out.println("=========== Example5 ===========");	
		System.out.println("=========== Bitwise operator ===========");	
		// & = ve , | = veya 
		// 6 = 0110 , 8 = 1000
		System.out.println(6&8);
		System.out.println(6|8);
		
		
		System.out.println("=========== Example6 ===========");	
		System.out.println("=========== Logical operator ===========");	
		// &&  -> shorcut ve  => burada ilk operator true ise ikinci operatora bakar..
		// &&  -> shorcut ve  => ilk operator false ise ikinci operatora bakmaz
		// &   -> ve  => ilk operator true de olsa false de olsa ikinci operatora bakar
		int y=5;
		if(y>10 && 10 / 0 > 1)
		{
			// burada && operatoru ilk terim false oldugu icin ikinci terim e bakmaz..
			// Arithmetic Exception hatasý ikinci terime bakmadigi icin firlatmaz
		}
		if(y>10 & 10 / 0 > 1)
		{
			// burada & operatoru ilk terim true de olsa false de olsa iki operatoru de bakar
			// Arithmetic Exception hatasý ikinci terime bakdigi icin firlatir
		}
		
		
	}

}
