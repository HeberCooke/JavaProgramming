//Heber Cooke	1/11/2019
//Exercise 22_1
//O(n^2) time complexity

import java.util.*;

public class Exercise22_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.nextLine();
		input.close();

		LinkedList<Character> max = new LinkedList<>();

		// Find the maximum increasingly ordered substring

		for (int i = 0; i < string.length(); i++) {
			LinkedList<Character> list = new LinkedList<>();
			list.add(string.charAt(i));
			for (int j = i + 1; j < string.length(); j++) {

				if (string.charAt(j) > list.getLast()) {
					list.add(string.charAt(j));

				} else {
					break;
				}
			}//end for 

			if (list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
			list.clear();
		} // end for

		for (Character ch : max) {
			System.out.print(ch);
		}

	}

}
