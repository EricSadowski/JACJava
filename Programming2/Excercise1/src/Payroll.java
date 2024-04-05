
public class Payroll {

	private String empName;
	private int idNum;
	private double hourlyPay;
	private double hoursWorked;
	
	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getIdNum() {
		return idNum;
	}


	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}


	public double getHourlyPay() {
		return hourlyPay;
	}


	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double grossPay() {
		
		double grossPay = hoursWorked * hourlyPay;
		System.out.printf("The gross pay of " + empName + " is $" + "%.2f%n", grossPay);
		return grossPay;
	}


	public Payroll(String name, int id) {
		
		empName = name;
		idNum = id;
		
		
		if(hourlyPay == 0 && hoursWorked == 0) {
			
			System.out.println("Please enter payroll data");
		}

			
		
		
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		
		Payroll e = new Payroll("Eric", 110);
		e.setHourlyPay(20);
		e.setHoursWorked(40);
		e.grossPay();
		
		
	

	}

}
