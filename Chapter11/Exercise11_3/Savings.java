

public class Savings extends Account {

	Savings() {

	}

	public void withdraw(double amount) {
		if (amount <= this.getBalance()) {
			this.setBalance(this.getBalance() - amount);
		}
	}

}


