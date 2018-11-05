import java.math.BigInteger;
import java.util.Scanner;

public class Exercise13_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a big integer for numerator ");
		BigInteger bi1 = input.nextBigInteger();
		System.out.println("Enter a big integer for  denominator ");
		BigInteger bi2 = input.nextBigInteger();
		System.out.println("Enter operator eg.(+ , - , * , / )");
		String operator = input.next();
		System.out.println("Enter a big integer for numerator ");
		BigInteger bi3 = input.nextBigInteger();
		System.out.println("Enter a big integer for  denominator ");
		BigInteger bi4 = input.nextBigInteger();
		input.close();
		Rational fraction1 = new Rational(bi1, bi2);
		Rational fraction2 = new Rational(bi3, bi4);
		switch (operator) {
		case "-":
			System.out.println(fraction1.subtract(fraction2));
			break;
		case "+":
			System.out.println(fraction1.add(fraction2));
			break;
		case "/":
			System.out.println(fraction1.divide(fraction2));
			break;
		case "*":
			System.out.println(fraction1.multiply(fraction2));
			break;
		}
	}

}


