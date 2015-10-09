import java.util.Scanner;
public class Prototype0VsRandomized {
	
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);	
	
	System.out.println("Welcome to ShReSh vs AI");
	
	for(;;) {
		System.out.println();
		System.out.println("Type 0 to begin; Type 1 to quit");
		int start = input.nextInt();
		
		if(start == 1) break;
		else if (start == 0){
		
			int playerammo = 0;
			int playerlife = 1;
			
			int aiammo = 0;
			int ailife = 1;
			
			int turncounter = 1;
			Prototype0Commentary comments = new Prototype0Commentary();
			
			while (playerlife > 0 && ailife > 0){
				System.out.println("Turn " + turncounter);
				System.out.println("Enter '2' to load, '1' to shield, and '0' to fire");
				boolean legalmove = false;
				
				int playermove = 1; //initial value
				int aimove = 1; //initial value
				
				
				while(!legalmove){
				playermove = input.nextInt();	
				if ((playermove == 0 && playerammo == 0) || (playermove < 0) || (playermove > 2)){
					System.out.println("Illegal Move, Try Again");
					}
				else legalmove = true;
					}
				playerammo = playerammo - 1 + playermove;
				comments.movecommentary("Player", playermove);

				
				Prototype0MoveGenerator forai = new Prototype0MoveGenerator();
				legalmove = false;
				while(!legalmove){
					aimove = forai.Move();	
					if ((aimove == 0 && aiammo == 0) || (aimove < 0) || (aimove > 2));
					else legalmove = true;
						}
				aiammo = aiammo - 1 + aimove;
				comments.movecommentary("Computer", aimove);
				
				
				if (playermove == 0 && aimove != 1){
					ailife--;
				}
				if (aimove == 0 && playermove != 1){
					playerlife--;
				}
				turncounter++;
				
			}
		comments.resultcommentary("Player", "Computer", playerlife, ailife);

		}
		
		}
			System.out.println("Thanks for playing");
		}
}
		

