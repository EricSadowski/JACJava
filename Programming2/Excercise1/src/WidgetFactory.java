
public class WidgetFactory {
	
	double toMake;


	public WidgetFactory(double toMake) {
		
		this.toMake = toMake;
		
		
		
	}
	
	public double timeReq() {
		
		double totalDays = toMake / 160;
		System.out.println("It will take " + totalDays + " days to make that many widgets!");
		return totalDays;
	}
	

	public static void main(String[] args) {
		
		
		WidgetFactory t = new WidgetFactory(200000);
		t.timeReq();
		
		
		
		
	}

}
