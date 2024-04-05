
public class Seasons {

	public static void main(String[] args) {
		// Eric Sadowski 2338165

		
		String strDay = args[0];   // getting the day
		String strMonth = args[1]; // the month
		String strYear = args[2];  // the year
		
		int day = Integer.parseInt(strDay);
		int month = Integer.parseInt(strMonth);
		int year = Integer.parseInt(strYear); // Parsing integers from strings
		
		if(month == 4 || month == 5) {
			System.out.println("Spring");
		}if(month == 3 && day >= 20 && day <= 31){
			System.out.println("Spring");
		}if(month == 6 && day <= 20) {
			System.out.println("Spring");
		} 
		
		/* Just a boatload of "if" statements checking the args
		 * Started with putting upper thresholds on days in a month
		 * But did not want to over complicate if it was outside of scope
		 */
		
		if(month == 7 || month == 8) {
			System.out.println("Summer");
		}if(month == 6 && day >= 21 && day <= 30){
			System.out.println("Summer");
		}if(month == 9 && day <= 22) {
			System.out.println("Summer");
		}
		
		if(month == 10 || month == 11) {
			System.out.println("Fall");
		}if(month == 9 && day >= 23 && day <= 30){
			System.out.println("Fall");
		}if(month == 12 && day <= 20) {
			System.out.println("Fall");
		}
		
		if(month == 1 || month == 2) {
			System.out.println("Winter");
		}if(month == 12 && day >= 21 && day <= 31){
			System.out.println("Winter");
		}if(month == 3 && day <= 19) {
			System.out.println("Winter");
		}
		if(year % 4 == 0) {  // Only time the year Arg is ever checked
			System.out.println("It is also a leap year!"); 
		}
		
		
		
	}

}
