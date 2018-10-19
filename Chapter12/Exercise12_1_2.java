//Heber Cooke 	10/18/2018
//Exercise 12_1_2
//Program without using an exception handler 

import java.util.*;

class Exercise12_1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String num1 = "";
		String num2 = "";
		String op = "";
		double answer = 0.0;
		System.out.println("Enter operation :");
		num1 = input.next();
		op = input.next();
		num2 = input.next();
		
	//------------------------------------------------------------------------	
	//add
		if (op.charAt(0) == '+'){
			if (num1.charAt(0) >= 0 && num1.charAt(0) <= '9'){
				if (num2.charAt(0) >= 0 && num2.charAt(0) <= '9'){
					answer = Integer.parseInt(num1) + Integer.parseInt(num2);
				}
				else {
					System.out.println("Problem with num 2");
				}
			}
			else {
				System.out.println("Problem with num 1");
			}
		}
	//------------------------------------------------------------------------
	//Subtract	
		if (op.charAt(0) == '-'){
			if (num1.charAt(0) >= 0 && num1.charAt(0) <= '9'){
				if (num2.charAt(0) >= 0 && num2.charAt(0) <= '9'){
					answer = Integer.parseInt(num1) - Integer.parseInt(num2);
				}
				else {
					System.out.println("Problem with num 2");
				}
			}
			else {
				System.out.println("Problem with num 1");
			}
		}
	//------------------------------------------------------------------------
	//Multiply
		if (op.charAt(0) == '*'){
			if (num1.charAt(0) >= 0 && num1.charAt(0) <= '9'){
				if (num2.charAt(0) >= 0 && num2.charAt(0) <= '9'){
					answer = Integer.parseInt(num1) * Integer.parseInt(num2);
				}
				else {
					System.out.println("Problem with num 2");
				}
			}
			else {
				System.out.println("Problem with num 1");
			}
		}
	//------------------------------------------------------------------------
	//Divide	
		if (op.charAt(0) == '/'){
			if (num1.charAt(0) >= 0 && num1.charAt(0) <= '9'){
				if (num2.charAt(0) >= 0 && num2.charAt(0) <= '9'){
					answer = Integer.parseInt(num1) / Integer.parseInt(num2);
				}
				else {
					System.out.println("Problem with num 2");
				}
			}
			else {
				System.out.println("Problem with num 1");
			}
		}
	//------------------------------------------------------------------------
	
		System.out.println("Answer : "+ answer );
		
	}
}

