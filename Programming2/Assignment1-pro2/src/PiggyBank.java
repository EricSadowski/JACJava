// Eric Sadowski  2338165
public class PiggyBank {

	int penny; int nickel; int dime; int quarter; double total;


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public PiggyBank(int penny, int nickel, int dime, int quarter, double total) {
		super();
		this.penny = penny;
		this.nickel = nickel;
		this.dime = dime;
		this.quarter = quarter;
		this.total = total;
	}


	public int getPenny() {
		return penny;
	}


	public void setPenny(int penny) {
		this.penny = penny;
	}


	public int getNickel() {
		return nickel;
	}


	public void setNickel(int nickel) {
		this.nickel = nickel;
	}


	public int getDime() {
		return dime;
	}


	public void setDime(int dime) {
		this.dime = dime;
	}


	public int getQuarter() {
		return quarter;
	}


	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
	
	
}
