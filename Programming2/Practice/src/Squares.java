
public class Squares {

	public static void main(String[] args) {
		// Eric Sadowski 2338165
		


		
		String input = args[0];
		
		
		int square = Integer.parseInt(input);
		
		
		
		
		for(int i = 0; i < square; i++) {
			
			System.out.print("*");			//for each iteration of the loop print 1 star
			for(int f = 2; f < square; f++) {
				if(1 == (i % 2)) {				//if the master loop is odd print a space ( * input total - 2)
					System.out.print(" ");		
				}else {
					System.out.print("*");		//else print a star ( * input total - 2)
				}
			}

			System.out.println("*");  //finish with a * and start a new line
			
		

	}
	
	

	}

}
