import java.util.ArrayList;

public class EvensAndOdds {

	static ArrayList<Integer> odds = new ArrayList<>();
	static ArrayList<Integer> evens = new ArrayList<>();

	
	
	
	public static int getRandom() {
		
		double r = Math.random();
		
		int min = 0;
		int max = 99;
		
		
		int e = (int) (min + (r * (max-min + 1)));
		
		return e;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
//		ArrayList<Integer> odds = new ArrayList<>();
//		ArrayList<Integer> evens = new ArrayList<>();
		
		for(int i = 0; i <25; i++) {
			
			int num = getRandom();
			if(num % 2 == 0) {
				evens.add(num);
			}else {
				odds.add(num);
			}
		}
		
		System.out.println(odds);
		System.out.println(evens);
		

	}

}
