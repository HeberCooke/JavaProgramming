

import java.io.*;

public class Exercise17_7 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Loan loan = new Loan(2.9, 3, 10000);
		Loan loan2 = new Loan();
		File file = new File("Exercise17_7.dat");
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));) {
			output.writeObject(loan);
			output.writeObject(loan2);
		}

		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));) {
			try {
				while (true) {
					Loan tempLoan = (Loan) input.readObject();
					System.out.println("Annual intrest rate " + tempLoan.getAnnualInterestRate() + "\nNumber of years "
							+ tempLoan.getNumberOfYears() + "\nLoan amout $" + tempLoan.getLoanAmount()
							+ "\nMonthly pament $" + tempLoan.getMonthlyPayment() + "\nTotal payment $"
							+ tempLoan.getTotalPayment());
					System.out.println();
				}

			} catch (EOFException e) {
				System.out.println("end of file ");
			}
		}
	}
}
