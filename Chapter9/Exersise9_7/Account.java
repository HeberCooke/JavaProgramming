package Exersise9_7;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	

	Account() {
		this.id = 0;
		this.balance = 0.0;
		this.dateCreated = new java.util.Date();
	}

	Account(int id, double balance) {
		this.balance = balance;
		this.id = id;
		this.dateCreated = new java.util.Date();

	}

	public int getId() {
		return this.id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDate() {
		return dateCreated.toString();
	}

	public void setAnnualIntrestRate(double AIR) {
		this.annualInterestRate = AIR / 100;

	}

	public double getMonthlyIntrestRate() {
		
		return (this.annualInterestRate/100) / 12;
	}

	public double getMonthlyIntrest() {
		return (this.annualInterestRate / 12)* balance;
	}

	public void withdraw(double draw) {
		this.balance -= draw;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}

}// end Account class ---------
