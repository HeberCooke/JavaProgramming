import java.util.Date;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	private Date dateCreated;

	protected Rectangle() {
		this.dateCreated = new Date();
	}

	protected Rectangle(double width, double height) {
		this.dateCreated = new Date();
		this.height = height;
		this.width = width;
	}

	protected Rectangle(double width, double height, String color, boolean filled) {
		this.dateCreated = new Date();
		this.height = height;
		this.width = width;
		setColor(color);
		setFilled(filled);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}// end Rectangle -------------------------------------------------------------------------------
