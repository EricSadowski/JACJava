// Eric Sadowski  2338165
public class Customer extends Person {

	int cNumber;
	boolean mail;
	
	public Customer(String name, String address, String teleNum, int cNumber, boolean mail) {
		super(name, address, teleNum);
		this.cNumber = cNumber;
		this.mail = mail;
		
	}


	@Override
	public String toString() {
		return  name + " has customer number " + cNumber + ", mailing list ? " + mail + ", lives at " + address
				+ ", and their number is " + teleNum;
	}


	public int getcNumber() {
		return cNumber;
	}

	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}

	public boolean isMail() {
		return mail;
	}

	public void setMail(boolean mail) {
		this.mail = mail;
	}
	
	
	
	
	
}
