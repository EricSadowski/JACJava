// Eric Sadowski  2338165
class Pins{
	
	int hit;
	int hit2;
	
	public Pins(){
		hit = (int) (Math.random() * 11);
		
		
		if(hit != 10) {
			hit2 = (int) (Math.random() * (11-hit));
			
			
		}
	}
}



public class Bowling {

	int score;
	int players;
	
	
	
	public Bowling(int score, int players) {
		
		this.score = score;
		this.players = players;
	}



	public static void main(String[] args) {
		
		Bowling game = new Bowling(0, 0);
		//Bowling p2 = new Bowling(0, 0);
		
		
		for(int i = 0; i < 10; i++) {
			
			
			
			Pins throw1 = new Pins();
			System.out.println("Round: " + (i+1));
			if(throw1.hit == 10) {
				System.out.println("Strike!");
				game.score += 20;
			}else if((throw1.hit + throw1.hit2) == 10 ){
				System.out.println("Spare!");
				game.score += 15;	
			}else {
				game.score += (throw1.hit + throw1.hit2);
			}
			
			System.out.println(game.score);	
			
			
			
		}
		

		
		
		
		
		
	}

}
