//Heber Cooke		1/17/2019
//Exercise 23_7

public class Exercise23_7 {

	public static void main(String[] args) {
		Integer[] list = { 1, 5, 4, 6, 5, 8, 6, 3, 2, 1, 4, 5, 8, 9, 4, 56, 65, 357, 3 };

		heapSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}

	public static <E extends Comparable<E>> void heapSort(E[] list) {
		Heap<E> heap = new Heap<>();

		for (int i = list.length - 1; i >= 0; i--) {
			heap.add(list[i]);
		}
		for (int i = 0; i < list.length; i++) {
			list[i] = heap.remove();
		}
	}
}
