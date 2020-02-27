package serialization;

import java.io.Serializable;

public class Ogrenci implements Serializable  {
	
	private int id ;
	private transient String name=null;
	private String surname;
	private static String bolum;
	

	public static String getBolum() {
		return bolum;
	}

	public static void setBolum(String bolum) {
		Ogrenci.bolum = bolum;
	}

	public Ogrenci(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		  String bilgiler =  "Ogrenci id :" + id +
                  " Ogrenci name : " + name +
                  " Ogrenci surname : " + surname;

          return bilgiler;
	}
	
	
	
	
	

}
