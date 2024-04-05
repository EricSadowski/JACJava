import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Payroll {

	static ArrayList<Integer> employeeId = new ArrayList<>(Arrays.asList(5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489));
	static ArrayList<Integer> hours = new ArrayList<>();
	static ArrayList<Double> payRate = new ArrayList<>();
	static ArrayList<Double> wages = new ArrayList<>();
	
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		try {

		
		for (int i=0; i<employeeId.size(); i++) {
			
			System.out.println("Please enter hours for " + employeeId.get(i));
			
			int hourly = input.nextInt();
			if(hourly < 0) {
				throw new IllegalArgumentException("Cannot work negative hours");
			}else {
				hours.add(hourly);
			}
			//hours.add(input.nextInt());
			//System.out.println(hours.get(i));
			System.out.println("Please enter payrate for " + employeeId.get(i));
			
			double rate =  input.nextDouble();
			
			if(rate < 6) {
				throw new IllegalArgumentException("Cannot recieve less than 6$ hourly");
			}else {
				payRate.add(rate);
			}
			
			
			//payRate.add(input.nextDouble());
			//System.out.println(payRate.get(i));
			
			wages.add(hours.get(i) * payRate.get(i));
			System.out.println(wages.get(i));

		}
		
		input.close();
	
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		catch(Exception e){
		System.out.println(e);
		}
		
		System.out.println();
	}
	

}

