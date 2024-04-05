// Eric Sadowski  2338165
public class Ship {

	String name;
	String built;
	
	
	public Ship(String name, String built) {
		this.name = name;
		this.built = built;
	}

	@Override
	public String toString() {
		return "The Ship's name is " + name + ", it was built  in " + built;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuilt() {
		return built;
	}

	public void setBuilt(String built) {
		this.built = built;
	}

	
	
	public static void main(String[] args) {
		

	      Ship[] harbor = new Ship[3];


	      harbor[0] = new Ship("Queen Anne", "1980");

	      harbor[1] = new CruiseShip("Cruisin' 69", "1969", 8008);

	      harbor[2] = new CargoShip("Biggie", "2001", 500000);

	      // Display the grades.
	      for (int index = 0; index < harbor.length; index++)
	      {
	         System.out.println(harbor[index]);
	      }
		
		

	}

}
