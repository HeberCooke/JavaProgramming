
public class Exercise25_3 {

	public static void main(String[] args) {
		BST<Integer> list = new BST<>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		
		System.out.println("In order without using recursion: ");
		list.inorderWoRecursion();
		BST<String> list2 = new BST<>();
		list2.insert("A");
		list2.insert("C");
		list2.insert("B");
		list2.insert("D");
		System.out.println();
		System.out.println("In order without using recursion: ");
		list2.inorderWoRecursion();
		
	}

}
