package example;

public class Player implements Comparable<Player> {
	
	private int id;
	private String name;
	
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public int compareTo(Player player) {
		
		if(this.getId() < player.getId()) {
	        return -1;
	    } else if (this.getId() > player.getId()) {
	        return 1;
	    } else {
	        return 0;
	    }
	}
	
	
//	@Override
//	public int compareTo(Player o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	

	
	

}
