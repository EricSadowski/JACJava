
public class RoomDimension {
double length;
double width;

public RoomDimension(double length, double width) {
	this.length = length;
	this.width = width;
}

public RoomDimension() {
	length = 0;
	width = 0;
}

public static double costCarpet(RoomDimension dimension, double cost) {
	return dimension.findArea() * cost;
}


public static double findArea(double length, double width) {
	return length * width;
}

public double findArea() {
	return length * width;
}
}
