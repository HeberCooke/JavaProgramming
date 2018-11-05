public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double r) {
		this.radius = r;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public void printCircle() {
		System.out.println("The Circle is created  on " + getDateCreated() + "\nThe Radius is : " + radius);

	}
}// end
	// Circle---------------------------------------------------------------------------------------
