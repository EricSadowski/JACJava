
public class Circle {

	double radius;
	final double pi = 3.14159;
	
	

	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getArea() {
		double area = pi * radius * radius;
		return area;
	}

	public double getDiameter() {
		double diameter = radius * 2;
		return diameter;
	}


	public double getCircumference() {
		
		double circumference = 2 * pi * radius;
		return circumference;
	}


	public Circle(double input) {

		
		radius = input;
			
			
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter radius of circle");
		Circle a = new Circle(25);
		System.out.println(a.getRadius());
		System.out.println(a.getArea());
	}

}
