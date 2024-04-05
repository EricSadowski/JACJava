
public class CountBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int countTo = 40; //args[0];
		int step = 3; //args[1];
		int noSteps = 0;
		
		for (int i = 1; i <= countTo; i+=step) {
			System.out.print(" " + i);
			noSteps++;
		}

		System.out.println();
		System.out.println("I am counting to " + countTo + " with a step size of " + step + ":");
		System.out.println(noSteps);
		
	}

}
