
public class Player {

	public char[] penaltyTaken;
	public char[] keeperMoves;
	public int score=0;
	
	public Player(String kick, String save){
		penaltyTaken = kick.toCharArray();
		keeperMoves = save.toCharArray();
	}
	
	public void toThePenaltyBox(Player opponent){
		
		for(int c = 0; c<penaltyTaken.length; c++){
			if(penaltyTaken[c] != opponent.keeperMoves[c]){
				score++;
			}
		}
	}
	
	public int getScore(){
		return score;
	}

}
