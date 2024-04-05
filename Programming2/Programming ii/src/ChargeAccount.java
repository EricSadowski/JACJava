import java.util.Scanner;

public class ChargeAccount {
	
	
	static int[] valid = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085,
			7576651, 7881200, 4581002};
	
	
	public static boolean check(int item) {
		
		for (int i = 0; i < valid.length; i++) {
			
			if(item == valid[i]) {
				System.out.println("Valid Number");
				return true;
			}

		}
		System.out.println("invalid Number");
		return false;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int wine = 8765677;
		int magic = 8777541;
		
		//System.out.println(check(wine));
		//System.out.println(check(magic));
		
		try {
			
			int toCheck = input.nextInt();
			int size = String.valueOf(toCheck).length();
			if(size > 7 || size < 7) {
				throw new IncorrectSizeInt();
			}
			check(toCheck);
			
			
			
		}catch(IncorrectSizeInt e) {
			System.out.println("YOOOOOOOOO WRONG SIZE INT SUCKA");
		}catch(Exception InputMismatchException) {
			System.out.println("YOOOOOOOOO NOT AN INT SUCKA");
		}
		
	}

}

//5658845 4520125 7895122 8777541 8451277 1302850
//8080152 4562555 5552012 5050552 7825877 1250255
//1005231 6545231 3852085 7576651 7881200 4581002