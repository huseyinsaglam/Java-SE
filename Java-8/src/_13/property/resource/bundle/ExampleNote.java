package _13.property.resource.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ExampleNote {
	
	public static void main(String[] args) {
		
		System.out.println("=========== Example1 ==========="); 
		ResourceBundle resourceBundle = ResourceBundle.getBundle("config", new Locale("tr"));
		String msg = resourceBundle.getString("message");
		System.out.println(msg);
		
		System.out.println("=========== Example2 ===========");
		ResourceBundle resourceBundleEN = ResourceBundle.getBundle("config", new Locale("en"));
		String msg2 = resourceBundleEN.getString("message");
		System.out.println(msg2);
		
		System.out.println("=========== Example3 ===========");
		ResourceBundle resourceBundle3 = ResourceBundle.getBundle("_13.property.resource.bundle.file", new Locale("tr"));
		String msg3 = resourceBundle3.getString("property.key");
		System.out.println(msg3);
	}

}

//- dosyalarin uzantisi properties olacak!
//dosya isminin genel formati  dosyaIsmi_locale bilgisi.properties