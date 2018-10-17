
/*UML
 * Triangle
 * - side1:double
 * -side2:double 
 * -side3:double
 * Triangle()
 * + setSide1(double):void
 * + setSide2(double):void
 * + setSide3(double):void
 * + setIsFilled(boolean):void
 * + setColor(String):void
 * + getArea():double
 * + getPerimeter():double 
 * + toString():String
 */


public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	Triangle() {

	}

	public void setSide1(double s1) {
		this.side1 = s1;
	}

	public void setSide2(double s2) {
		this.side2 = s2;
	}

	public void setSide3(double s3) {
		this.side3 = s3;
	}

	public void setIsFilled(boolean isF) {
		super.setIsFilled(isF);
		// sets no color for false fill
		if (isF == false) {
			super.setColor("No Color");
		}
	}

	public void setColor(String c) {
		super.setColor(c);

	}

	double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}

	double getParameter() {
		double parameter = side1 + side2 + side3;
		return parameter;
	}

	public String toString() {
		return "Triangle : side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

