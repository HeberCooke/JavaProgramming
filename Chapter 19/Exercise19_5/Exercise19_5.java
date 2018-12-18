// Heber Cooke 		12/14/2018
//Exercise 19_5

public class Exercise19_5 {

	public static void main(String[] args) {
		Double [] list1 = {55.0,25.,62.2,88.4,99.0}; // test double 
		String [] list2 = {"Apple","zero","Banana","Bacon","Zebra"};
	Integer [] list3 = {6,77,9,1,22,33,65};
		Character [] list4 = {'+','$','!','*'};
		
	System.out.println("Max double is: "+max(list1));
	System.out.println("Max String is: "+max(list2));
	System.out.println("Max Integer is:  " + max(list3));
	System.out.println("Max Character is: "+max(list4));
	
	}
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		
		for (int i = 0; i < list.length;i++) {
			if (max.compareTo(list[i]) < 0) {
				max = list[i];
			}
		}
	
		return max;
	}
}
