// Eric Sadowski  2338165
public class CruiseShip extends Ship {

	int passengerCap;

	public CruiseShip(String name, String built, int passengerCap) {
		super(name, built);
		this.passengerCap = passengerCap;
	}

	
	
	
	@Override
	public String toString() {
		return "The Cruise Ship " + name + " has a capacity of " + passengerCap;
	}




	public int getPassengerCap() {
		return passengerCap;
	}

	public void setPassengerCap(int passengerCap) {
		this.passengerCap = passengerCap;
	}
	
	
	
}
