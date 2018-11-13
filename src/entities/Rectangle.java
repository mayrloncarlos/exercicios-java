package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return (width * height)/2;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
