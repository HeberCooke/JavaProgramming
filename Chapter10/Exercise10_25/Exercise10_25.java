
// Heber Cooke 		10/8/2018
// Exercise 10-25

public class Exercise10_25 {

	public static void main(String[] args) {
		String a = "ab#12#453"; 
		String remove = "#";
		String[] temp = Split.split(a, remove);
		for (int i = 0; i < temp.length; i++) {
			// if  is to remove the comma at the end of the string 
			if(i <temp.length -1) {
			System.out.print(temp[i]+ ","+remove+",");
			}
			else {
				System.out.print(temp[i]+ ","+remove);
			}
		}// end for loop
		
	}// end main-------------
}// end Split class -------------------
