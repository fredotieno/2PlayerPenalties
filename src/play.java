import java.util.Scanner;


public class play {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continua;
		System.out.println("Welcome to the 2 Player Penalties Game");
		System.out.println("For this game L = Left, R = Right and M = Middle");
		do{
		System.out.println("Welcome Player one");
		System.out.println("Enter the way you want to kick your penalties ");
		System.out.println("You can enter the command L/R/M ENTER FIVE COMMANDS ONLY");
		Scanner scan = new Scanner(System.in);
		String kicks = scan.nextLine();
		System.out.println("Enter the way you want your goalkeeper to dive");
		System.out.println("You can enter the command L/R/M ENTER FIVE COMMANDS ONLY");
		String dives = scan.nextLine();
		Player one = new Player(kicks, dives);
		System.out.println("Thank you Player One you can now allow Player Two to enter his choices");
		System.out.println("Enter the way you want to kick your penalties ");
		System.out.println("You can enter the command L/R/M ENTER FIVE COMMANDS ONLY");
		kicks = scan.nextLine();
		System.out.println("Enter the way you want to kick your penalties ");
		System.out.println("You can enter the command L/R/M ENTER FIVE COMMANDS ONLY");
		dives = scan.nextLine();
		Player two = new Player(kicks, dives);
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
		System.out.println("Enter 0 to continue playing");
		continua = scan.nextInt();
		}while(continua == 0);
	}

}
