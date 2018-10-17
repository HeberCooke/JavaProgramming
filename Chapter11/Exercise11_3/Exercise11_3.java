

public class Exercise11_3 {

	public static void main(String[] args) {
		System.out.println("---------Test savings account and set balance, account number,Annual Interest Rate");
		// Test savings account and set balance, account number,Annual Interest Rate
		Savings save1 = new Savings();
		save1.setBalance(100.00);
		save1.setId(600006);
		save1.setAnnualInterestRate(3.9);
		// Test to string method
		System.out.println(save1.toString());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
				System.out.println("---------Test for overdraft");
		// Test for overdraft
		save1.withdraw(101.00);
		System.out.println(save1.toString());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
				System.out.println("--------Test Withdraw ");
		save1.withdraw(10.00);
		System.out.println(save1.toString());
		System.out.println();
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
				System.out.println("---------Test Checking account and set balance, account number,Annual Interest Rate");
		// Test Checking account and set balance, account number,Annual Interest Rate
		Checking check1 = new Checking();
		check1.setBalance(1000.00);
		check1.setId(400004);
		check1.setAnnualInterestRate(3.0);
		// Test to string method
		System.out.println(check1.toString());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
			System.out.println("-----Test for overdraft");
		// Test for overdraft
		check1.withdraw(1051.00);
		System.out.println(check1.toString());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
				System.out.println("--------Test withdraw");
		check1.withdraw(1049.00);
		System.out.println(check1.toString());
	}

}


