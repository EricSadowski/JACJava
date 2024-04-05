// Eric Sadowski  2338165
import java.util.Scanner;

public class Nim2 {

	private static int getRandom;
	int stones;

	public void genStones() {

		int getRandom = (int) (Math.random() * (30 - 15 + 1) + 15);
		setStones(getRandom);

	}


	public static int cpuTake() {
		
		
		int getRandom = (int) (Math.random() * 3) + 1;
		return getRandom;
	}

	public static int cpuTake2(int current) {
		
		
		if(current == 4) {
			return 3;
		}
		else if(current == 3) {
			return 2;
		}
		else if(current == 2) {
			return 1;
		}
		else if(current == 1) {
			return 1;
		}else
		//return 0;
		getRandom = (int) (Math.random() * 2) + 1;
		return getRandom;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Nim2 game = new Nim2(0);
		game.genStones();


		while (game.stones > 0) {

			
			if(game.stones == 1) {
				System.out.println("There is " + game.stones + " left");
				System.out.println("Take it");
				int ch = input.nextInt();
				if (ch != 1) {
					System.out.println("Illegal move!");
					continue;}
				game.stones -= ch;
				continue;
			}
			
			else if(game.stones <= 3) {
			  
					System.out.println("There are " + game.stones + " left");
					System.out.println("How many Stones do you want to take?");
					int ch = input.nextInt();
					if (ch > 2 || ch < 1) {
						System.out.println("Illegal move!");
						continue;}
					game.stones -= ch;
					if(game.stones == 0) {
						continue;
					}
					int cpuTurn = cpuTake2(game.stones);
					System.out.println("Cpu takes:" + cpuTurn);
					game.stones -= cpuTurn;
					continue;
			  }
			  
			  
			  
			  
			  else
			
			System.out.println("There are " + game.stones + " left");
			System.out.println("How many Stones do you want to take?");
			int ch = input.nextInt();
			if (ch > 3 || ch < 1) {
				System.out.println("Illegal move!");
				continue;
			}
			game.stones -= ch;
			if(game.stones == 0) {
				continue;
			}
			int cpuTurn = cpuTake2(game.stones);
			System.out.println("Cpu takes:" + cpuTurn);
			game.stones -= cpuTurn;

		}System.out.println("Game over!");
		input.close();

	}

	public int getStones() {
		return stones;
	}

	public void setStones(int stones) {
		this.stones = stones;
	}


	public Nim2(int stones) {

		this.stones = stones;
	}

}
