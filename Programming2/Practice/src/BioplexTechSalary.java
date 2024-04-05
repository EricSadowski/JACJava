
public class BioplexTechSalary {

	public static void main(String[] args) {
		// Eric Sadowski 2338165
		
		String payInput = args[0]; 
		String hoursInput = args[1]; 
		
		int hoursWorked = Integer.parseInt(hoursInput);
		double hourlyPay = Double.parseDouble(payInput); // converting input strings
		
		
		
		if(hourlyPay < 8) {
			if (hoursWorked > 75) {
			System.out.println("Bioplex Tech do not allow employees to work over 75 hours in a week");
			}
			System.out.println("Provincial Law requires a minimum salary of $8.00");
			System.out.println("Unable to calculate weekly earnings.");
		}else if(hoursWorked > 75) {
			System.out.println("Bioplex Tech do not allow employees to work over 75 hours in a week");
			System.out.println("Unable to calculate weekly earnings.");		// Stating valid response parameters
		}else if(hoursWorked > 35){
			int hoursOvertime = hoursWorked - 35;  // //  Calculations if the employee loves being at work (doing overtime)
			int regHours = hoursWorked - hoursOvertime;
			double payOut = (regHours * hourlyPay) + ((hoursOvertime * 1.5) * hourlyPay);
			System.out.printf("Base salary: $" + hourlyPay + "\n");
			System.out.printf("Total hours worked: " + hoursWorked + "\n");
			System.out.println("Overtime worked: " + hoursOvertime + " hours");
			System.out.println("==========");
			System.out.printf( "WEEKLY EARNINGS: $" + "%.2f%n", payOut);  // The printout
			
			
		}else {
			double payOut = (hoursWorked * hourlyPay); // Calculations if the employee values their life (not working overtime)
			System.out.printf("Base salary: $" + hourlyPay + "\n");
			System.out.println("Total hours worked: " + hoursWorked + " hours");
			System.out.println("Overtime worked: 0 hours");
			System.out.println("==========");
			System.out.printf("WEEKLY EARNINGS: $" + "%.2f%n", payOut);
		}
		
		
		
		
	}

}
