
public class randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(randomNumber());
		System.out.println(randomNumber(100));
		System.out.println(randomNumber(100, 50));
		
	}
	
	public static int randomNumber(int a) {
		
		int max = a;
		int min = 1;
	    
		double r = Math.random();
		
		
		int e = (int) (min + (r * (max-min + 1)));
		return e;
		
		
	}
	
	public static int randomNumber(int a, int b) {
		
		int max = a;
		int min = b;
	    
		double r = Math.random();
		
		
		int e = (int) (min + (r * (max-min + 1)));
		return e;
		
		
	}

	public static int randomNumber() {
		final int min = 1;
	    final int max = 10;
	    
		double r = Math.random();
		
		
		int e = (int) (min + (r * (max-min + 1)));
		return e;
	}
	
	
}
