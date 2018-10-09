import java.util.Scanner;

public class Exercise10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		Account[] account = new Account[10]; // array of object variables
		for (int i = 0; i < 10; i++) { // loop to give 100 for initial values
			account[i] = new Account(); // 10 new objects
			account[i].setBalance(100);
		}
	
		System.out.println("WELCOME TO ATM");
		System.out.print("Enter ID: ");
		int id = input.nextInt(); // priming input
		while (true) {
			
			if (id < 0 || id > 9) {
				System.out.println("Enter the correct ID:");
			} 

			System.out.println("Main Menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("BALANCE $" + account[id].getBalance());
			}
			if (choice == 2) {

				System.out.println("How much do you want to withdraw ? :");
				double amount = input.nextDouble();
				double newBalance = account[id].getBalance() - amount;
				account[id].setBalance(newBalance);
			}
			if (choice == 3) {
				System.out.println("How much do you want to deposit ? :");
				double amount = input.nextDouble();
				double newBalance = account[id].getBalance() + amount;
				account[id].setBalance(newBalance);
			}

			if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
				System.out.println("Enter Correct choice ");
			}
			
			System.out.println("WELCOME TO ATM");
			System.out.print("Enter ID: "); // update input
			id = input.nextInt();

		} // end while

	} // end main

} // end class
