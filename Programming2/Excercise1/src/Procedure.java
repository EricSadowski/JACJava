
public class Procedure {

	String name;
	String date;
	String doctor;
	String charge;
	
	public Procedure(String name, String date, String doctor, String charge) {
		
		
		System.out.println(name);
		System.out.println(date);
		System.out.println(doctor);
		System.out.println(charge);
		System.out.println("--------");
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	public String getCharge() {
		return charge;
	}


	public void setCharge(String charge) {
		this.charge = charge;
	}


	public static void main(String[] args) {
		
		String[] xName = {"Tommy", "Hunter", "Douglas"};
		String[] xAddress = {"44 Beaconsfield", "Vancouver", "B.C.", "Vx6 1w2"};
		String xNumber = "514-678-9966";
		String[] xContact = {"Yoda", "5436678888"};
		
		
		
		
		Patient x = new Patient(xName, xAddress, xNumber, xContact);
		
		Procedure l = new Procedure("Lobotomy", "March 12", "Dr. Jekyl", "6.99$");
		Procedure o = new Procedure("Heart Surgery", "March 25", "Dr. Jekyl", "100000$");
		Procedure j = new Procedure("Cybernetic Transplant", "March 30", "Dr. Jekyl", "20000000$");
		

	}

}
