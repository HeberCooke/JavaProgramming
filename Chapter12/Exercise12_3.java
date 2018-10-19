// Heber Cooke 		10/18/2018

//Exercise 12_3

import java.util.Scanner;

public class Exercise12_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list = new int[100];
		int num;
		// filling the array with random integers
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100 + 1);
		} // end for

		System.out.println("Enter the index of the array : ");
		num = input.nextInt();

		try {
			System.out.println("Element Value is  " + (list[num]));
			// printout to check element to index
			for (int x = 0; x < list.length; x++) {
				System.out.println("#" + x + "     " + list[x]);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds " + ex);
		}

	}// end main
}// end class


