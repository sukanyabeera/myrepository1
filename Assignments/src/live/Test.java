package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxaphone;

public class Test {

	public static void main(String []args) {
		
		Playable playable;
		playable=new Veena();
		playable.play();
		playable=new Saxaphone();
		playable.play();
		
		

	}
}

