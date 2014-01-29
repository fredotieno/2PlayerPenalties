
public class play {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player one = new Player("LLRRM", "MMRLL");
		Player two = new Player("MRLLM", "LRMMM");
		one.toThePenaltyBox(two);
		two.toThePenaltyBox(one);
		if(one.score > two.score){
			System.out.println("Player One has won");
		}
		else if(one.score < two.score){
			System.out.println("Player Two has won");
		}
		else
			System.out.println("Its a draw");
	}

}
