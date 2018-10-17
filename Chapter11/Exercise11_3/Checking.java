

public class Checking extends Account {
	public final double OVERDRAFT = 50.00;

	Checking() {

	}

	public void withdraw(double amount) {
		if ((amount - OVERDRAFT) <= this.getBalance()) {
			this.setBalance(this.getBalance() - amount);
		}
	}
}


