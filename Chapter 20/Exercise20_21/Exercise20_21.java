//Heber Cooke 	12/26/2018
//Exercise 20_21


import java.util.Comparator;

public class Exercise20_21 {
	public static void main(String[] args) {

		GeometricObject[] list = { new Circle(5), new Rectangle(4, 5), // list to be sorted
				new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), new Rectangle(4, 65), new Circle(4.5),
				new Rectangle(4.4, 1), new Circle(6.5), new Rectangle(4, 5) };

		Circle[] list1 = { new Circle(2), new Circle(3), new Circle(2), new Circle(5), new Circle(6), new Circle(1),
				new Circle(2), new Circle(3), new Circle(14), new Circle(12) };

		selectionSort(list1, new GeometricObjectComparator()); // calling sort method
		System.out.println("-->Ordered Circle Objects<--");
		for (GeometricObject i : list1) { // print out the ordered Circle Objects
			System.out.print(i.getArea());
			System.out.println();
		}

		selectionSort(list, new GeometricObjectComparator()); // calling sort method
		System.out.println("\n-->Ordered Geometric  Objects<--");
		for (GeometricObject e : list) { // print out the ordered Geometric Objects
			System.out.print(e.getArea());
			System.out.println();
		}

	}// end main

	// selection Sort method ----------------
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list
			E currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (comparator.compare(currentMin, list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				} // end if
			} // end for

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			} // end if

		} // end for
	}// end selectionSort
} // End Exercise 20_21 class


