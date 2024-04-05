// Eric Sadowski  2338165
public class Person {

	String name;
	String address;
	String teleNum;
	

	
	
	public Person(String name, String address, String teleNum) {
		
		this.name = name;
		this.address = address;
		this.teleNum = teleNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTeleNum() {
		return teleNum;
	}

	public void setTeleNum(String teleNum) {
		this.teleNum = teleNum;
	}

	@Override
	public String toString() {
		return name + " lives at " + address + ", their number is " + teleNum;
	}


	public static void main(String[] args) {
		

		Customer donnie = new Customer("Donnie", "42 Bing Pl.", "514-888-4444", 53535, true);
		
		donnie.setAddress("22 Nowhere plaza");
		
		System.out.println(donnie);
		
		PerferredCustomer yoda = new PerferredCustomer("Yoda", "46 bing pl.", "543-885-3332", 523523, true, 1001);
		
		System.out.println(yoda);
		
		
		
		
	}


}
