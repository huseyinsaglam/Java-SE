package _08.optional;

import java.util.Optional;

public class ExampleNot {
	
	public static void main(String[] args) {
		
		Optional<String> opt = Optional.empty();
		
		System.out.println(opt.map(String::length).orElse(-1));
	}

}


// Optional Class Null Pointer Exception kacinilmak amaciyla yazilmis bir Class dir..