package liveNotes;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		LgOldTv remote = new LgOldTv();
		remote.start();
		remote.changeChannel(); // old way
		
		LgSmartTv sremote1 = new LgSmartTv();
		sremote1.start();
		sremote1.changeChannel(); // smart way
		
		LgOldTv sremote = new LgSmartTv(); // super class ref child class obj
		sremote.start();
		sremote.changeChannel(); // smart way
		
		LgSmartTv sremote2 = (LgSmartTv)sremote; // object down casting
		sremote2.playGame();
		
		
	}
}
