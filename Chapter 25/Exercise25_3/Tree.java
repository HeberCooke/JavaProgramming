
public interface Tree<E> extends Iterable<E> {
	
	//Returns true if the element is in the tree
	public boolean search(E e);
	
	//Insert element e into the binary search tree
	//returns true if the element is inserted successfully
	public boolean insert(E e);
	
	// Delete the specified element from the tree
	//Returns true if the element was deleted successfully
	public boolean delete(E e);
	
	//In order traversal from the root
	public void inorder();
	
	//Post order traversal from the root
	public void postorder();
	
	//Pre order traversal from root
	public void preorder();
	
	//Get the number of Nodes on the tree
	public int getSize();
	
	//Returns true if the tree is empty
	public boolean isEmpty();
	

}
