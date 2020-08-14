package _14.path.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example {
	
	public static void main(String[] args) throws IOException {
	
		System.out.println("============ Example1 ===========");
			Stream<Path> enStream = Files.list(Paths.get(".")); // nokta burada current directory dir.
			enStream.forEach(System.out::println);
			
		System.out.println("============ Example2 ===========");
		try {
			Stream<String> stream = Files.lines(Paths.get("file/streamListExample.txt"));
			// stream.forEach(System.out::println);
			stream.filter(str -> str.startsWith("h")).forEach(System.out::println);;
		} catch (Exception e) {
			System.out.println("error");
		}
		
			
		
	}

}


// java.nio.file.Path;