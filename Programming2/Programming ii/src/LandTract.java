import java.util.Scanner;


public class LandTract {

	double width;
	double length;
	
	public static double findArea(LandTract a) {
		return a.length * a.width;
	}
	

	public LandTract(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public static boolean isEqual(LandTract a, LandTract b) {
		
		double one = findArea(a);
		double two = findArea(b);
		
		
		if(one == two) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public String toString() {
		return "LandTract [width=" + width + ", length=" + length + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		LandTract wow = new LandTract(0, 0);
		LandTract hmm = new LandTract(0, 0);
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter length for Tract a");
		wow.setLength(myScanner.nextDouble());
		System.out.println("Please enter width for Tract a");
		wow.setWidth(myScanner.nextDouble());
		System.out.println("Please enter length for Tract b");
		hmm.setLength(myScanner.nextDouble());
		System.out.println("Please enter width for Tract b");
		hmm.setWidth(myScanner.nextDouble());
		System.out.println("The area of Tract A is " + findArea(wow));
		System.out.println("The area of Tract B is " + findArea(hmm));
		
		System.out.println("Tract A and B are equal? : " + isEqual(wow, hmm));		
			
		
		
		


		//System.out.println(findArea(wow));
		//System.out.println(findArea(hmm));
		//System.out.println(isEqual(wow, hmm));
		
		
		
		
		
		
	}


	
	
	
}
