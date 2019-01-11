
//Heber Cooke 		1/8/2019
//Exercise 22_3
// O(n) time complexity
import java.util.Scanner;

public class Exercise22_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string");
		String s1 = input.nextLine();
		System.out.println("Enter another string");
		String s2 = input.nextLine();

		int count = 1;
		if (s1.contains(s2)) { // if s1 contains substring 
			for (int i = 0; i < s1.length(); i++) {// one for loop to check where the substring is at
				if (s2.charAt(0) == s1.charAt(i) ) {
					count = i;
				}

			}
			System.out.println(s2 + " is matched at  index " + count);
		} else {
			System.out.println("the string is not a substring of string 1");
		}

		input.close();
	}

}
