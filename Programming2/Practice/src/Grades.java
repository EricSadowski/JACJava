import java.util.Arrays;

public class Grades {

	public static void main(String[] args) {
	
		
		// store grades in array of double
		double[] grades = new double[5];
		grades[0] = 85;
		grades[1] = 78.5;
		grades[2] = 90;
		grades[3] = 75;
		grades[4] = 100;
		// calculate the average

		
		
		double sum = 0;
		for (int i = 0; i < grades.length; i++){
		sum += grades[i];
		}
		double avg = sum/grades.length;
		
		System.out.println(avg);
		
		
		String str = Arrays.toString(grades);
		System.out.print(str);
		
		

	}

}
