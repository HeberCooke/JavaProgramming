/*UML
 * Triangle
 * + Triangle()
 * - side1: double
 * - side2: double
 * - side3: double
 * + Triangle()
 * # Triangle(s1:double,s2:double,s3:double,color:String,filled:boolean)
 * + getArea():double
 * + getPerimeter():double
 */


import java.util.Date;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {

	}
	
protected Triangle(double s1, double s2, double s3, String color, boolean filled) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		setColor(color);
		setFilled(filled);
	}

	@Override
	public double getArea() {

		double s = 0.5 * (side1 + side2 + side3);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

}//end Triangle-------------------------------------------------------------------------------
