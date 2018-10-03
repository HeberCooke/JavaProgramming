
// Heber Cooke  		10/1/2018
//Exersise 9-3


import java.util.Date;

public class Exersise9_3 {

	public static void main(String[] args) {
		Date date = new Date(10000);
		System.out.println(date.toString());
		date.setTime(100000);
		System.out.println(date.toString());
		date.setTime(1000000);
		System.out.println(date.toString());
		date.setTime(10000000);
		System.out.println(date.toString());
		date.setTime(100000000);
		System.out.println(date.toString());
		date.setTime(1000000000);
		System.out.println(date.toString());
		date.setTime(10000000000L);
		System.out.println(date.toString());
	}

}
