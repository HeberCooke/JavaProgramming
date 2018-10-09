
/* Heber Cooke 		10/8/2018
    Exersise 10_7
	UML
	--------
	Account
	- int id 
	- private double balance
	- private double annualInterestRate
	- private Date dateCreated
	----------------------
	+Account()
	+Account(int,double,)
	+getId():int
	+ setId(int ) :void
	+getBalance():double
	+setBalance(double):void
	+setAnnualInterestRate(double): void
	+getDateCreated()Date
	+Withdraw(double):void
	+Deposit(double):void
	+getMonthlyInterest():double
	+getMonthlyInterestRate():double
	+
*/
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
