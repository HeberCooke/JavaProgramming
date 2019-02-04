import java.util.AbstractSequentialList;


public class TwoWayLinkedList<E> extends AbstractSequentialList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public TwoWayLinkedList() {
		//Default constructor 
	}

	public TwoWayLinkedList(E[] obj) {
		for (int i = 0; i < obj.length; i++) {
			add(obj[i]);
		}
	}

	public E getFirst() {
		if (size == 0) {
			return null;
		} else {
			return head.element;
		}
	}

	public E getLast() {
		if (size == 0) {
			return null;
		} else {
			return tail.element;
		}
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e);
		Node<E> begin = new Node<E>(e);
		newNode.previous = begin;
		newNode.next = head;
		head = newNode;
		size++;
		if (tail == null) {
			tail = head;
		}
	}

	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);

		if (tail == null) {
			head = tail = newNode;
		} else {
			newNode.previous =tail;
			tail.next = newNode;

			tail = tail.next;
		}
		size++;
		
	}

	public void add(int index, E e) {
		
		if (index == 0) {
			addFirst(e);
		} else if (index >= size) {
			addLast(e);
		} else {
			
			Node<E> current = head;
			for (int i = 1; i < index; i++) {

				current = current.next;
			}
			Node<E> temp = current.next;
			current.next = new Node<E>(e);
			current.previous = current;
			(current.next).next = temp;
			size++;
			
		}
		
	}

	public E removeFirst() {
		if (size == 0) {
			return null;
		} else {
			Node<E> temp = head;
			head = head.next;
			size--;
			if (head == null) {
				tail = null;
			}
			return temp.element;
		}
	}

	public E removeLast() {
		if (size == 0) {
			return null;
		} else if (size == 1) {
			Node<E> temp = head;
			head = tail = null;
			size = 0;
			return temp.element;

		} else {
			Node<E> current = head;
			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}
			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}

	public E remove(int index) {

		if (index < 0 || index >= size) {
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index == size - 1) {
			return removeLast();
		} else {
			Node<E> previous = head;
			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}
			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder("[");

		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != null) {
				result.append(", ");
			} else {
				result.append("]");
			}
		}
		return result.toString();
	}

	public void clear() {
		size = 0;
		head = tail = null;
	}

	public boolean contains(Object e) {
		if (size == 0) {
			return false;
		}
		for (E obj : this) {
			if (e.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public E get(int index) {

		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			if (i == index) {
			}
			current = current.next;
		}
		return current.element;
	}

	public int indexOf(Object e) {
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			if (current.element.equals(e)) {
				return i;
			}
			current = current.next;
		}
		return -1;
	}

	public int lastIndexOf(Object e) {
		if (size == 0) {
			return -1;
		}
		Node<E> current = tail;
		for (int i = size - 1; i >= 0; i--) {
			if (e.equals(current.element)) {
				return i;
			}
			current = current.previous;
		}
		return -1;
	}

	public E set(int index, E e) {
		if (index < 0 || index >= size || size == 0) {
			throw new IndexOutOfBoundsException(index + " Out Of Bounds");
		} else {
			Node<E> current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			Node<E> temp = current;
			current.element = e;
			return temp.element;
		}
	}

	// Iterator below -------------------------------------
	public java.util.Iterator<E> iterator() {
		return new MyLinkedListIterator();
	}

	public class MyLinkedListIterator implements java.util.Iterator<E> {

		private Node<E> current = head;

		@Override
		public boolean hasNext() {

			return (current != null);
		}

		@Override
		public E next() {
			E e = current.element;
			current = current.next;

			return e;
		}

	}

	@Override
	public java.util.ListIterator<E> listIterator(int index) {

		return new TwoWayListIterator(index);
	}
	public class TwoWayListIterator implements java.util.ListIterator<E> {
		private Node<E> current = head;
		private int index = 0;

		public TwoWayListIterator(int index) {
			this.index = index;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
		}

		@Override
		public void add(E e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void set(E e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public boolean hasPrevious() {
			return current.previous != null;
		}

		@Override
		public E next() {
			E e = current.element;
			//current.previous = current;
			current = current.next;
			
			index++;
			return e;
		}

		@Override
		public E previous() {
			E e = current.element;
			current = current.previous;
			index --;
			return e;
		}

		@Override
		public int nextIndex() {
			return index;
		}

		@Override
		public int previousIndex() {
			if (hasPrevious()) {
				return index;
			}
			return -1;
		}
	}

	// Override method for AbstractSequentialList--------------------


	@Override
	public int size() {

		return size;
	}

	public   class Node<E> {
		E element;
		Node<E> next;
		Node<E> previous;

		public Node(E e) {
			this.element = e;
		}
	}

}


