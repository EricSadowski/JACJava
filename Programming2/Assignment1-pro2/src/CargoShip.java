// Eric Sadowski  2338165
public class CargoShip extends Ship {

	int tons;

	public CargoShip(String name, String built, int tons) {
		super(name, built);
		this.tons = tons;
		
	}

	@Override
	public String toString() {
		return "This Cargo ships name is " + name + " is can carry a max tonnage of " + tons;
	}


	public int getTons() {
		return tons;
	}

	public void setTons(int tons) {
		this.tons = tons;
	}
	
	
	
}
