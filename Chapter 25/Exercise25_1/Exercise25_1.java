//Heber Cooke 		2/8/2019
//Exercise 25_1
public class Exercise25_1 {

	public static void main(String[] args) {
		BST<String> tree = new BST<>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		System.out.println("Pre order : ");
		tree.preorder();
		System.out.println();
		System.out.println();
		System.out.println("Breadth First Traversal : ");
		tree.breadthFirstTraversal();

		System.out.println("\nHeight  Of Tree : " + tree.height());

	}

}
