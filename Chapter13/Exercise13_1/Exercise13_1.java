import java.util.*;

public class Exercise13_1 {

	public static void main(String[] args) {
		Circle obj1 = new Circle(5.0, "red", true);
		Rectangle obj2 = new Rectangle(5, 3, "blue", true);
		System.out.println(obj1.toString());
		System.out.println();
		System.out.println(obj2.toString());

		Triangle t1 = new Triangle(3, 4, 5, "green", true);

		System.out.println(t1.toString());
		System.out.println(t1.getArea());
		// tests above
		// ------------------------------------------------------------------------------
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Triangle ");
		System.out.println("Enter side 1");
		double side1 = input.nextDouble();
		System.out.println("Enter side 2");
		double side2 = input.nextDouble();
		System.out.println("Enter side 3");
		double side3 = input.nextDouble();
		System.out.println("Enter a color ");
		String color = input.next();
		System.out.println("Enter is filled true or false");
		boolean filled = input.nextBoolean();
		Triangle tri1 = new Triangle(side1, side2, side3, color, filled);
		System.out.println();
		System.out.println("Created : " + tri1.getDateCreated());
		System.out.println("The triangle area is : " + tri1.getArea() + "\nThe triangle perimeter is : "
				+ tri1.getPerimeter() + "\nThe triangle color  is : " + tri1.getColor()
				+ "\nThe triangle is filled  is :" + tri1.isFilled());

	}// end main -------
}// end class Exercise13_1
	// ----------------------------------------------------------------------------------------
