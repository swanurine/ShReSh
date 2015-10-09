public class Prototype0Commentary {
	
	public void movecommentary(String player, int move){
		String comments = "";
		if (move == 0) comments = " fired a shot";
		else if (move == 1) comments = " shielded itself";
		else if (move == 2) comments = " reloaded its gun";
		System.out.println(player + comments);
	}
	
	public void resultcommentary(String player1, String player2,
								int player1life, int player2life){
		if (player1life == player2life)System.out.println("Draw");
		else if (player1life > player2life) System.out.println(player1+" wins");
		else if (player1life < player2life) System.out.println(player2+" wins");
	}
}
