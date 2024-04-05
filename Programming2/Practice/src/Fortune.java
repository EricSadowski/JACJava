
public class Fortune {

	public static void main(String[] args) {
		// Eric's Magic 8 Ball
		
		
		// max & min declarations
		int max = 31;
		int min = 12;
		
		//double r = Math.random();
		//int randomNum = (int) (min + (r * (max-min + 1)));

		double getRandom = Math.floor(Math.random() * (max-min + 1)) + min;  
		/* It is 20 because (max - min + 1) .. 12 is the minimum .. 31 is maximum .. 20 slots in the index
		   Math.random makes a number between 0-1.. it is multiplied by 20 then rounded down by floor ..then minimum value is added to
		   place between 12-31 instead of 0-20
		 */
		int randomNum = (int) getRandom; // convert float to int (typecast)
		//System.out.println(randomNum);
		
		if(randomNum == 12) {		//statement chain with error terminator
			System.out.println("It is certain");
		}
		else if(randomNum == 13) {
			System.out.println("It is decidedly so");
		}
		else if(randomNum == 14) {
			System.out.println("Most likely");
		}
		else if(randomNum == 15) {
			System.out.println("Outlook good");
		}
		else if(randomNum == 16) {
			System.out.println("Without a doubt");
		}
		else if(randomNum == 17) {
			System.out.println("Yes - definitely");
		}
		else if(randomNum == 18) {
			System.out.println("Don't count on it");
		}
		else if(randomNum == 19) {
			System.out.println("Very doubtful");
		}
		else if(randomNum == 20) {
			System.out.println("You may rely on it");
		}
		else if(randomNum == 21) {
			System.out.println("As I see it, yes");
		}
		else if(randomNum == 22) {
			System.out.println("Signs point to yes");
		}
		else if(randomNum == 23) {
			System.out.println("Yes");
		}
		else if(randomNum == 24) {
			System.out.println("My sources say no");
		}
		else if(randomNum == 25) {
			System.out.println("Reply hazy, try again");
		}
		else if(randomNum == 26) {
			System.out.println("My reply is no");
		}
		else if(randomNum == 27) {
			System.out.println("Ask again later");
		}
		else if(randomNum == 28) {
			System.out.println("Better not tell you now");
		}
		else if(randomNum == 29) {
			System.out.println("Outlook not so good");
		}
		else if(randomNum == 30) {
			System.out.println("Cannot predict now");
		}
		else if(randomNum == 31) {
			System.out.println("Concentrate and ask again");
		}
		else {
			System.out.println("An Error has occurred");
		}

	
		
		
		
		
	}

}
