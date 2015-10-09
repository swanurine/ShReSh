import java.util.Random;
public class Prototype0MoveGenerator {
	
	public int Move(){
		Random randomGenerator = new Random();
		//mess with probability and chance some other time
		int move = randomGenerator.nextInt(3);
		return move;
	}
	
	public int Move(int ammo){
		
		return 0;
	}
	public int Move(int ammo, int opponentpreviousmove){
		
		return 0;
	}
}
