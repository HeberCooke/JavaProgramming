// Heber Cooke 		10/15/2018
//Exercise 11_1




import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle t1 = new Triangle();
		System.out.println("Enter Side1 : ");
		t1.setSide1(input.nextDouble());
		System.out.println("Enter Side2 :");
		t1.setSide2(input.nextDouble());
		System.out.println("Enter Side3 :");
		t1.setSide3(input.nextDouble());
		System.out.println("Enter True/False is color filled :");
		t1.setIsFilled(input.nextBoolean());
		if (t1.getIsFilled() == true) {
			System.out.println("Enter  a Color :");
			t1.setColor(input.next());
		}

		System.out.println(t1.toString());
		System.out.println("Area :" + t1.getArea() + "\nParameter :" + t1.getParameter() + "\nColor :" + t1.getColor()
				+ "\nIs Filled :" + t1.getIsFilled());

		input.close();
	}

}


