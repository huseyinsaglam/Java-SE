package serialization;

import java.io.Serializable;

public class Ogrenci implements Serializable  {
	
	private int id ;
	private String name;
	private String surname;
	
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
