import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {

	protected TreeNode<E> root;
	protected int size = 0;

	public BST() {
		// Default constructor
	}

	public BST(E[] obj) {
		for (int i = 0; i < obj.length; i++) {
			insert(obj[i]);
		}
	}

	// Exercise 1 methods
	// ---------------------------------------------------------------------------------------
	// Displays the nodes in a breadth-first traversal
	public void breadthFirstTraversal() {
		breadthFirstTraversal(root);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void breadthFirstTraversal(TreeNode<E> root) {
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode<E> node = queue.remove();
			System.out.print(node.element + " ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}

	}

	// Returns the height of this tree
	public int height() {
		if (size == 1) {
			return 0;
		}
		return height(root);
	}

	public int height(TreeNode<E> r) {
		if (r == null) {
			return -1;
		}
		return ( Math.max(height(r.left), height(r.right)) + 1);
	}
	// -------------------------------------------------------------------------------------

	@Override // Returns true if the element is in the tree
	public boolean search(E e) {
		TreeNode<E> current = root; // start from the root

		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else { // element matches current element
				return true; // Element is found
			}
		}
		return false;
	}

	@Override // Insert element e into the binary search tree
	// Returns true if the element was inserted successfully
	public boolean insert(E e) {

		if (root == null) {
			root = createNewNode(e);// create new node
		} else {
			// Locate the parent node
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else {
					return false; // duplicate node not inserted
				}
			}
			// Create new Node and attach it to the parent
			if (e.compareTo(parent.element) < 0) {
				parent.left = createNewNode(e);
			} else {
				parent.right = createNewNode(e);
			}

		}
		size++;
		return true; // Element inserted successfully
	}

	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}

	@Override // In order traversal from the root
	public void inorder() {
		inorder(root);
	}

	// in order traversal from a subtree
	protected void inorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}

	@Override // post order traversal from a subtree
	public void postorder() {
		postorder(root);
	}

	// Post order traversal from the root
	protected void postorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}

	@Override // Pre order traversal from the root
	public void preorder() {
		preorder(root);
	}

	// Pre order traversal from a subtree
	protected void preorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);

	}

	@Override // gets the number of nodes in the tree
	public int getSize() {

		return size;
	}

	// Returns the root of the tree
	public TreeNode<E> getRoot() {
		return root;
	}

	// Returns a path from the root leading to the specified element
	public java.util.ArrayList<TreeNode<E>> path(E e) {
		java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
		TreeNode<E> current = root; // start from the root

		while (current != null) {
			list.add(current);// add the node to the list
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else {
				break;
			}
		}
		return list; // Return an array list of nodes
	}

	@Override // Delete an element from the binary search tree
	// Return true if the element is deleted successfully
	// Returns false if the element is not in the tree
	public boolean delete(E e) {
		// Locate the node to be deleted and also locate its parent node
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			} else {
				break; // element is in the tree pointed at by current
			}
		}
		if (current == null) {
			return false; // element is not in the tree
		}
		// case 1 current has no left child
		if (current.left == null) {// connect the parent with the right child of the current node
			if (parent == null) {
				root = current.right;
			} else {
				if (e.compareTo(parent.element) < 0) {
					parent.left = current.right;
				} else {
					parent.right = current.right;
				}
			}

		} else {
			// case 2 the current node has a left child
			// Locate the rightmost node in the left subtree of
			// the current node and also its parent
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;

			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right; // keep going to the right
			}

			// Replace the element in the current by the element in the right
			current.element = rightMost.element;

			// Eliminate rightMost node
			if (parentOfRightMost.right == rightMost) {
				parentOfRightMost.right = rightMost.left;
			} else {
				// Special case: parent of right most == current
				parentOfRightMost.left = rightMost.left;
			}

		}

		size--;
		return true;
	}

	@Override // Obtain an iterator Use inorder
	public Iterator<E> iterator() {

		return new InorderIterator();
	}

	// Inner class InorderIterator
	private class InorderIterator implements Iterator<E> {
		// store elements in a list
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		private int current = 0; // point to the current element in the list

		public InorderIterator() {
			inorder(); // traverse binary tree and store elements in a list
		}

		// Inorder traversal from the root
		private void inorder() {
			inorder(root);
		}

		// Inorder traversal from a subtree
		private void inorder(TreeNode<E> root) {
			if (root == null) {
				return;
			}
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		@Override // More elements for traversing
		public boolean hasNext() {
			if (current < list.size()) {
				return true;
			}
			return false;
		}

		@Override // Get the current element and move to the next
		public E next() {

			return list.get(current++);
		}

		@Override // Remove the current element
		public void remove() {
			delete(list.get(current));
			list.clear();
			inorder();
		}

	}

	// removing all elements from the tree
	public void clear() {
		root = null;
		size = 0;
	}

	// This inner class is static ,because it does not access any instance
	// members defined in its outer class
	public static class TreeNode<E extends Comparable<E>> {

		protected E element;
		protected TreeNode<E> left;
		protected TreeNode<E> right;

		public TreeNode(E e) {
			element = e;
		}

	}// end TreeNode class
}// end BST class
