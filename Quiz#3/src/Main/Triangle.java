package Main;

public class Triangle extends GeometricObject{

	// Create the 3 sides of the triangle
	private double side1;
	private double side2;
	private double side3;

	// No arg constructor for default triangle
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	// Constructor to create a triangle with specified sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Accessor methods for all 3 data values
	public double getside1() {
		return side1;
	}

	public double getside2() {
		return side2;
	}

	public double getside3() {
		return side3;
	}

	// Method that returns Area of the triangle
	public double getArea(){
		//Calculate area of the triangle using Heron's law
		double s = .5 * getPerimeter(); // You need 1/2 of the perimeter
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	// Method that returns the perimeter of the triangle
	public double getPerimeter(){
		double perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;	
	}
	
	// Method that returns string description for triangle
	public String toString(){
		return "The triangle has side1 =" + side1 + ", side2 =" + side2 + 
				" and side3 =" + side3 + ". The perimeter is" + getPerimeter() +
				" and the area is " + getArea() + ".";
		
	}
	
	
	
}
