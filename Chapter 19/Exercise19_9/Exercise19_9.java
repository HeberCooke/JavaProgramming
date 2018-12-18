import java.util.ArrayList;

//Heber Cooke 		12/14/2018
//Exercise 19_9


public class Exercise19_9 {

	public static void main(String[] args) {
		ArrayList<Double> list1 = new ArrayList<Double>();
		list1.add(55.6);
		list1.add(62.3);
		list1.add(15.9);
		list1.add(75.99);
		list1.add(18.87);
		System.out.print("Unsorted Double list : ");
		printList(list1);
		sort(list1);
		System.out.print("Sorted Double list : ");
		printList(list1);
		System.out.println();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("soup");
		list2.add("bacon");
		list2.add("fish");
		list2.add("Hello");
		System.out.print("Unsorted String list : ");
		printList(list2);
		sort(list2);
		System.out.print("Sorted String list : ");
		printList(list2);
	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;
		for (int i = 0; i < list.size() -1; i++) {
			currentMin = list.get(i);
			currentMinIndex = i;
			for (int j = i; j < list.size(); j++) {
				if (currentMin.compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}	
	}
	public static <E> void printList(ArrayList<E> listX) {
		for (int i = 0; i < listX.size();i++) {
			System.out.print(listX.get(i)+ " ");
		}
		System.out.println();
	}
}
