// Heber Cooke 
// Exercise19_3

import java.util.Scanner;

public class Exercise18_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter 2 numbers to find the greatest common divisor");
		System.out.println("Enter numerator ");
		int num = input.nextInt();
		System.out.println("Enter denominator");
		int num2 = input.nextInt();
		input.close();
		System.out.println("The gcd is " + gcd(num, num2));

	}

	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		} else
			return gcd(n, m % n);

	}
}


