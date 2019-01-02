// Heber Cooke 		12/17/2018
//Exercise 20_3
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise20_3 {
	static int score = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> list1 = new ArrayList<>(); // list for states
		list1.add("Alaska");
		list1.add("California");
		list1.add("Colorado");
		list1.add("Hawaii");
		list1.add("Idaho");
		list1.add("Montana");
		list1.add("Nevada");
		list1.add("Oregon");
		list1.add("Texas");
		list1.add("Utah");
		ArrayList<String> list2 = new ArrayList<>(); // list for capitols
		list2.add("Juneau");
		list2.add("Sacramento");
		list2.add("Denver");
		list2.add("Honolulu");
		list2.add("Boise");
		list2.add("Helena");
		list2.add("Carson City");
		list2.add("Salem");
		list2.add("Austin");
		list2.add("Salt Lake City");
		System.out.println("Enter Q to quit: ");
		
		int temp = (int)(Math.random() * list1.size());
		System.out.println("What is the Capitol of "+ list1.get(temp)+ "?");
		String guess = input.nextLine();
		
			
		
		while (guess.compareToIgnoreCase("Q") != 0) {
	
			if (guess.compareToIgnoreCase( list2.get(temp)) == 0) {
				System.out.println("-->Correct");
				score++;
			} else {
				System.out.println("-->Incorrect ");
				System.out.println("It is :"+ list2.get(temp));
				score--;
			}
			
			System.out.println("Score : " + score); // display score
			
			System.out.println("Enter Q to quit: ");		
			 temp = (int)(Math.random() * list1.size());
			System.out.println("What is the Capitol of "+ list1.get(temp)+ "?");
			guess = input.nextLine();
			if(guess.compareToIgnoreCase("Q") ==0 ) {
				break;
			}
				
			
		}
		// end greeting
		System.out.println("Thank you for using State and Capital program");	
input.close();
	}

}


