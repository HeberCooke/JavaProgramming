//Heber Cooke 	1/7/2019
//Exercise 21_9

import java.util.*;

public class Exercise21_9 {
	public static void main(String[] args) {

		Map<String, String> list = new HashMap<>();
		list.put("alaska", "Juneau");
		list.put("california", "Sacramento");
		list.put("colorado", "Denver");
		list.put("hawaii", "Honolulu");
		list.put("idaho", "Boise");
		list.put("montana	", "Helena");
		list.put("nevada", "Carson City");
		list.put("oregon", "Salem");
		list.put("texas", "Austin");
		list.put("utah", "Salt Lake City");

		System.out.println("Enter Q to quit");
		System.out.println("Enter a State : ");
		Scanner input = new Scanner(System.in);
		String state = input.nextLine().toLowerCase(); // lower case the input  

		while (state != "Q") {
			// checking update value for quitting condition
			if (state.contains("Q") || state.contains("q")) {
				break;
			}

			// checking list for state value state is the key capitol is the value
			
			if (list.containsKey(state)) {

				System.out.println("Capitol is  --> " + list.get(state));
			} else {
				System.out.println("State is not in the list ");
			}

			System.out.println("Enter a State : ");
			state = input.nextLine().toLowerCase();
		}
		System.out.println("Thank you for playing ");

		input.close();

	}
}
