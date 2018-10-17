import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // create a new arraylist
		System.out.println("Enter 10 Integers: ");
		for (int i = 0; i < 10; i++) { // for loop to initialize the array list
			System.out.println("enter number " + (i + 1));
			list1.add(input.nextInt());
		}
		RemDups.removeDuplicates(list1);  // calling the remove duplicates method 
		
		input.close();
	} 
}	// end class -----------------