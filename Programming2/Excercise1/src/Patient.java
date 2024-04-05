
import java.util.Arrays;

public class Patient {

	String[] name;
	String[] address;
	String number;
	String[] emergency;
	
	
	
	public String[] getName() {
		return name;
	}



	public void setName(String[] name) {
		this.name = name;
	}



	public String[] getAddress() {
		return address;
	}



	public void setAddress(String[] address) {
		this.address = address;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public String[] getEmergency() {
		return emergency;
	}



	public void setEmergency(String[] emergency) {
		this.emergency = emergency;
	}

	
	public Patient(String[] name, String[] address, String number, String[] emergency) {
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(address));
		System.out.println(number);
		System.out.println(Arrays.toString(emergency));
		System.out.println("--------");
	}
	
	
/*
	public static void main(String[] args) {
		
		
		//String[] xName = {"Tommy", "Hunter", "Douglas"};
		//String[] xAddress = {"44 Beaconsfield", "Vancouver", "B.C.", "Vx6 1w2"};
		//String xNumber = "514-678-9966";
		//String[] xContact = {"Yoda", "5436678888"};
		
		
		
		
		//Patient x = new Patient(xName, xAddress, xNumber, xContact);
		
		

	} */

}
