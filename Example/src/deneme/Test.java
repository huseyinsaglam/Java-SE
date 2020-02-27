package deneme;

public class Test {

	public static void main(String[] args) {
		
		Model  model = new Model();
		
		System.out.println(model.getName());
		
		for(String p: model.getNames())
		{
			System.out.println(p);
		}
		
		String[] abc = {"bsauhjb","efýh"};
		model.setNames(abc);
		

		for(String p: model.getNames())
		{
			System.out.println(p);
		}
		
		
		
	}

}
