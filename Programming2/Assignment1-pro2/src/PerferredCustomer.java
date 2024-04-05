// Eric Sadowski  2338165
public class PerferredCustomer extends Customer {

	double totalPurchase;
	int discount;
	
	
	public PerferredCustomer(String name, String address, String teleNum, int cNumber, boolean mail,
			double totalPurchase) {
		super(name, address, teleNum, cNumber, mail);
		this.totalPurchase = totalPurchase;
		

		if(totalPurchase < 500) {
			discount = 0;
		}
		else if(totalPurchase >= 500 && totalPurchase < 1000) {
			discount = 5;
		}else if(totalPurchase >= 1000 && totalPurchase < 1500) {
			discount = 6;
		}else if(totalPurchase >= 1500 && totalPurchase < 2000) {
			discount = 7;
		}else if(totalPurchase >= 2000) {
			discount = 10;
		}
		
	}




	@Override
	public String toString() {
		return "Perferred Customer " + name + " has bought " + totalPurchase + "$ worth of items, currently has a " + discount + "% discount, customer number is " + cNumber
				+ ", mailing list? " + mail + ", address is " + address + ", and phone number is " + teleNum;
	}




	public double getTotalPurchase() {
		return totalPurchase;
	}


	public void setTotalPurchase(double totalPurchase) {
		this.totalPurchase = totalPurchase;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}

	
}
