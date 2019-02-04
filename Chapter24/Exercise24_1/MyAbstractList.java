
public abstract class MyAbstractList<E> implements MyList<E> {

	protected int size = 0;

	protected MyAbstractList() {

	}

	// create a list from an array of objects
	protected MyAbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}

	// Adds the elements in otherList to this list
	// Returns true if this list changed as a result
	@Override
	public boolean addAll(MyList<E> otherList) {
		int i;
		for (i = 0; i < otherList.size(); i++) {
			this.add(otherList.get(i));
		}
		if (i > 0) {
			return true;
		}
		return false;
	}

	// Removes the elements in otherList from this list
	// Returns true if this list changed as a result
	@Override
	public boolean removeAll(MyList<E> otherList) {

		int i;
		for (i = 0; i < otherList.size(); i++) {
			if (this.contains(otherList.get(i))) {
				this.remove(otherList.get(i));
			}

		}
		if (i > 0) {
			return true;
		}
		return false;
	}

	// Retains the elements in this list that are also in the otherList
	// Returns true if this list changed as a result
	@Override
	public boolean retainAll(MyList<E> otherList) {
		boolean changed = false;
		for (int i = size - 1; i >= 0; i--) {
			E e = get(i);
			if (!otherList.contains(e)) {
				remove(i);
				changed = true;
			}
		}
		return changed;

	}

	@Override // Add a new element at the end if this list
	public void add(E e) {
		add(size, e);
	}

	@Override // Return true if this list doesn't contain any elements
	public boolean isEmpty() {
		return size == 0;
	}

	@Override // Return the number of elements in the list
	public int size() {
		return size;
	}

	@Override // Remove the first occurrence of the element e from the list.
	// Shift any subsequent elements to the left.
	// Return true if the element is removed
	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		} else
			return false;
	}
}
