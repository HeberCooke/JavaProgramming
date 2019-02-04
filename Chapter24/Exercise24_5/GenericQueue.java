
public class GenericQueue<E> extends java.util.LinkedList<E>{

	
	private java.util.LinkedList<E> list = new java.util.LinkedList<>();
	
	public void enqueue(E e) {
		list.addLast(e);
	}
	
	public E dequeue() {
		return list.removeFirst();
	}
	public int getSize() {
		return list.size();
	}
	
	public String toString() {
		return "Queue : "+ list.toString(); 
	}
}
