//Heber Cooke 	1/28/2019
//Exercise 24_1

public class Exercise24_1 {

	public static void main(String[] args) {

		MyArrayList<String> list1 = new MyArrayList<>();

		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");

		MyArrayList<String> list2 = new MyArrayList<>();
		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		// print out for list one add All list 2
		System.out.println("List (1) " + list1);
		System.out.println("List (2) " + list2);
		list1.addAll(list2);
		System.out.println("(List1) addAll (list2) ");
		System.out.println("List (1) " + list1);
		System.out.println("List (2) " + list2);
		System.out.println();
		list1.clear(); // clearing the lists
		list2.clear();

		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");

		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		// List 1 Remove All list 2
		System.out.println("List (1) " + list1);
		System.out.println("List (2) " + list2);
		list1.removeAll(list2);
		System.out.println("(List1) removeAll (list2) ");
		System.out.println("List (1) " + list1);
		System.out.println("List (2) " + list2);
		System.out.println();
		list1.clear(); // clearing the lists
		list2.clear();

		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");

		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		// List 1 Retain All list 2
		System.out.println("List (1) " + list1);
		System.out.println("List (2) " + list2);
		list1.retainAll(list2);
		System.out.println("(List1) retainAll (list2) ");
		System.out.println("List (1) " + list1);
		System.out.println("List (2) " + list2);
		System.out.println();
	}

}
