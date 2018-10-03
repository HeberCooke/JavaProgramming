/* Heber Cooke 		10/3/2018
    Exersise 9_7
	UML
	--------
	Account
	- int id 
	- private double balance
	- private double annualInterestRate
	- private Date dateCreated
	----------------------
	+Account()
	+Account(int,double)
	+getId():int
	+setId(int ) :void
	+getBalance():double
	+setBalance(double):void
	+setAnnualInterestRate(double): void
	+getDateCreated()Date
	+Withdraw(double):void
	+Deposit(double):void
	+getMonthlyInterest():double
	+getMonthlyInterestRate():double
	
*/
package Exersise9_7;
class Exersise9_7 {
	public static void main(String[] args) {

		Account a = new Account(1122, 20000.00);
		a.setAnnualIntrestRate(4.5);
		a.withdraw(2500.00);
		a.deposit(3000.00);

		System.out.println("Ballance $"+a.getBalance());
		System.out.println("Monthly Interest  $" +a.getMonthlyIntrest());
		System.out.println("Date/Time Created   :"+a.getDate());


	}// end main ---------------
}