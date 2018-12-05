//Heber Cooke 		12/4/2018
// Exercise18_9

import java.util.Scanner;

public class Exercise18_9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s1 = "";
		System.out.println("Enter a string");
		s1 = input.nextLine();
		reverseDisplay(s1);
		input.close();
	}

	public static void reverseDisplay(String value) {

		if (value.length() == 0) {
			System.out.println(value);
		} else {
			System.out.print(value.substring(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}


