// Eric Sadowski 2338165
public class Employee {

	String name;
	int number;
	String hireDate;
	
	
	


	public Employee(String name, int number, String hireDate) {
		
		this.name = name;
		this.number = number;
		this.hireDate = hireDate;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getNumber() {
		return number;
	}





	public void setNumber(int number) {
		this.number = number;
	}





	public String getHireDate() {
		return hireDate;
	}





	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}





	public static void main(String[] args) {
		
		
		ProductionWorker charlie = new ProductionWorker("Charlie", 122, "03/05/1997", 1, 30.0);
		System.out.println(charlie);

		
		
		
	}

}
