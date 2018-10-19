// Heber Cooke 		10/19/2018
// Exercise 12_19

import java.util.Scanner;
class Exercise12_19 {
	public static void main(String[] args) {
	int count = 0;
	try{
		java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/Lincoln.txt");
		Scanner input = new Scanner (url.openStream());
		while (input.hasNext()){
			String line = input.nextLine();
			count +=line.length(); 
		}
		System.out.println("the file has "+ count );
	}
	catch (java.net.MalformedURLException ex){
		System.out.println("Invalid URL ");
	}
	catch (java.io.IOException ex ){
		System.out.println(" I/O Errors : no such file");
	}	
		
	}
}