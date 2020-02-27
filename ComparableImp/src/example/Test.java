package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Player> list_player = new ArrayList<Player>();
		list_player.add(new Player(5, "Murat"));
		list_player.add(new Player(1, "Emre"));
		list_player.add(new Player(10, "Oguz"));
		list_player.add(new Player(4, "Yusuf"));
		
		 Collections.sort(list_player);
		
		for(Player s:list_player)
		{
			System.out.println(s);
		}

	}

}
