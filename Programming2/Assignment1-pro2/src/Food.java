// Eric Sadowski  2338165
public class Food {

	double price;
	int fat;
	int carbs;
	int fiber;
	
	
	
	public Food(double price, int fat, int carbs, int fiber) {
		
		this.price = price;
		this.fat = fat;
		this.carbs = carbs;
		this.fiber = fiber;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getFiber() {
		return fiber;
	}

	public void setFiber(int fiber) {
		this.fiber = fiber;
	}

	

	@Override
	public String toString() {
		return " costs $" + String.format("%.2f", price) + ", has " + fat + "g of fat, has " + carbs + "g of carbs and " + fiber + "g of fiber";
	}
	
	
	
}
