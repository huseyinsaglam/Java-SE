package kendiExceptionWrite;


public class InvalidAgeException extends Exception {

	@Override
	public void printStackTrace() {
		
		System.out.println("invalidAgeException hatasidir");
		System.out.println("Mekana 18 yas�ndaz kucukler giremez");
	}
	
	

}
