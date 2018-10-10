
// Heber Cooke 	10/9/2018
// Exercise 10_25

public class Exercise10_25 {

	public static void main(String[] args) {
		String[] s =Split.split("ab#12#453", "#"); // calling the static Split method with the string array
		// looping the string array to print out return string array
		for (int i = 0; i <s.length ; i++) {
			System.out.print(s[i]+",");
		}
	}
}

