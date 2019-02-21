//Heber Cooke 	2/21/2019
//Exercise 27_9


public class Exercise27_9 {

	public static void main(String[] args) {
		System.out.println("HelloWorld ---> "+hashCodeForString("HelloWorld"));
		System.out.println("Hello World--->"+hashCodeForString("Hello World"));
		System.out.println("Hello--->"+hashCodeForString("Hello"));
		System.out.println("bat--->"+hashCodeForString("bat"));
		System.out.println("tab--->"+hashCodeForString("tab"));
		System.out.println("A --->"+hashCodeForString("A"));
		System.out.println("A--->"+hashCodeForString("B"));
		System.out.println("AA--->"+ hashCodeForString("AA"));
	}
	public static int hashCodeForString(String s) {
		int i ; //counter 
		int r = 0; //hash code 
		for(i =0; i < s.length(); i++ ) {
			char c = s.charAt(i);
			r =(int)c + 31 * (r -1); 
			
		}
		
		return r  ;
		
	}
}
