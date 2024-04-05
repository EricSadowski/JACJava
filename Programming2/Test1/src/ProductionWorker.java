// Eric Sadowski 2338165
public class ProductionWorker extends Employee {

	int shift;
	double payRate;
	
	
	
	public int getShift() {
		return shift;
	}



	@Override
	public String toString() {
		return "Production Worker " + name + " works shift " + shift + ", his pay rate is " + payRate +  "$, his number is " + number
				+ ", and he was hired on " + hireDate;
	}



	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}



	public ProductionWorker(String name, int number, String hireDate, int shift, double payRate) {
		super(name, number, hireDate);
		this.shift = shift;
		this.payRate = payRate;
	}
	
	
}
