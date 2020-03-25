package com.hashCodeAndEquals;


class Player
{
	String name;
	int age;
	
	
	
	
	
	public Player(String name, int id) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class Example {

	public static void main(String[] args) {
		
		
		Player player1 = new Player("Huseyin", 20);
		Player player2 = new Player("Ali", 21);
		Player player3 = new Player("Ahmet", 22);
		Player player4 = new Player("Huseyin", 20);
		
		if(player1.equals(player4))
		{
			System.out.println("player1 ve player2 referanslarýn degerleri aynidir ");
		}
		else
		{
			System.out.println("player1 ve player2 referanslarýn degerleri farklidir ");
		}

	}

}
