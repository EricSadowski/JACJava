// Eric Sadowski 2338165
public class bottomRight {

	public static void main(String[] args) {
		

		bottomRight(7);
		bottomRight2(7);
		
	}
	
	
	public static void bottomRight(int num) {
		
		int counter2 = 0;
		
		for(int i = 0; i < num; i++) {
			

			
			
			for(int b = 1; b < num - i; b++) {

				System.out.print(" ");

			
			}
			
	
			for(int c = 0; c < counter2; c++) {
				System.out.print("*");
				
			}
			
			
			System.out.println("*");
			
				
			counter2++;
				
}
	
		

		
		
		
	}
	
	
public static void bottomRight2(int num) {
		
		for(int i = 0; i < num; i++) {
			

			System.out.print("*");
			
			for(int f = 1; f < num; f++) {
				
				if(f <= i) {
					System.out.print("*");
				}else
				System.out.print(" ");

				
			}
				System.out.println("");	
}
	
		
		
	}
	
	
	
	
	
	

}





