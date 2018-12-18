// Heber Cooke 		12/14/2018
//Exercise19_3

import java.util.ArrayList;

public class Exercise19_3 {

	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //   Integer Test
		list1.add( 1);
		list1.add(1);
		list1.add(4);
		list1.add(1);
		list1.add(4);
		ArrayList<String> list2 = new ArrayList<String>(); //String Test
		list2.add("Harry");
		list2.add("Bob");
		list2.add("Bob");
		list2.add("Bill");
		list2.add("Nancy");
		list2.add("Bob");
		list2.add("Bob");
		System.out.println(removeDuplicates(list1));    
		System.out.println(removeDuplicates(list2));

	}
	// Remove Duplicates method 
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		
		ArrayList<E> arrayList = new ArrayList<E>();
		
		for (int i = 0; i < list.size(); i++) {
			if (! arrayList.contains(list.get(i))) {
				arrayList.add(list.get(i));
			}
		}
		return arrayList;
	}

}
