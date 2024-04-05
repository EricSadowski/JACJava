
public class OldEnough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ageInput = args[0];
		int age = Integer.parseInt(ageInput);
		
		
		if(age < 16) {
			System.out.println("You can't really do much!");}
			else if(age > 17){
			System.out.println("You are legal in Quebec");}
        
		if(age > 18){
			System.out.println("You are legal in Ontario");}
		
		if(age >= 18 && age <25) {
			System.out.println("It will be hard to rent a car at that age");}
		
		if(age >= 21){
			System.out.println("Let's go to Vegas!");}
			
		if(age > 25) {
			System.out.println("You can do anything!");
		}
		
		
			/*if(age >= 18 && age <25) {
						System.out.println("It will be hard to rent a car at that age");}
					}
					
			if(age >= 21){
						System.out.println("Let's go to Vegas!");}
						else{
							System.out.println("You can do anything");
				*/
			
		}
		
	}


