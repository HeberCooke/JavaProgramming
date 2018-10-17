/*
 * UML
 * Account
 * ---------------
 * Account()
 * Account(int ,double,double)
 * - setId(int):void
 * + getId():int
 * - setBalance(double):void
 * + getBalance():double
 * -  setAnnualIntrestRate(double):void
 * + getAnnualInterestRate():double
 * + getDate():Date
 * + getMonthlyIntrestRate():double
 * + getMonthlyIntrest():double
 * + withdraw (double):void
 * + deposit(double):void
 * + toString():String
 */



public class Account {
	private int id;
	private double balance;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date();

	// constructors
	public Account() {
	}

	public Account(int id, double balance, double annualInterestRate) {
		id = this.id;
		balance = this.balance;
		annualInterestRate = this.annualInterestRate;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// methods
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = getAnnualInterestRate() / 12;
		return monthlyInterestRate;
	}

	public double getMonthlyInterest() {
		double monthlyInterest = getBalance() * (getMonthlyInterestRate() / 100);
		return monthlyInterest;
	}

	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	}

	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}

	public String toString() {

		return "Account number : " + this.id + "\nBalance $ " + this.balance + "\nAnnual Intrest rate :"
				+ this.annualInterestRate + "\nMonthly Intrest rate : " + this.getMonthlyInterestRate()
				+ "\nMonthly interest $ " + this.getMonthlyInterest() + "\nDate created : " + this.dateCreated;
	}
}


