package deneme;

public class Model {
	
	private int id;
	private String name ="huseyin";
	private String[] names = {"turkcell","sony","ericson"};
	
	
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
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

}
