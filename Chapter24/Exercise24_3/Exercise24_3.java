import java.util.ListIterator;

public class Exercise24_3 {

	public static void main(String[] args) {
		TwoWayLinkedList<String> list = new TwoWayLinkedList<>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println("List -->" + list);
		System.out.println();
		ListIterator<String> L1 = list.listIterator();

		L1.next();
		L1.next();
		System.out.println("After calling next : this is the while hasPrevious method");

		while (L1.hasPrevious()) {
			System.out.print(L1.previous() + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("This is the while hasNext method");
		ListIterator<String> L2= list.listIterator();

		while(L2.hasNext()) {
			System.out.print(L2.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("GetFirst method -->" + list.getFirst());
		System.out.println("GetLast method --> " + list.getLast());
		list.addFirst("Zero");
		System.out.println("After AddFirst(Zero) method--> " + list);
		list.addLast("Four");
		System.out.println("After AddLast(Four) method --> " + list);
		list.add(2, "Middle");
		System.out.println("After add( 2 , middle)  method  --> " + list);
		list.removeFirst();
		System.out.println("After removeFirst method --> " + list);
		list.removeLast();
		System.out.println("After removeLast method --> " + list);
		list.remove(1);
		System.out.println("After remove (index 1 ) method --> " + list);
		System.out.println("ToString method --> " + list.toString());
		System.out.println("Contains(Four)  method --> " + list.contains("Four"));
		System.out.println("Get (2) method --> " + list.get(2));
		System.out.println("IndexOf (one) method --> " + list.indexOf("One"));
		list.add("two");
		System.out.println("After adding another two  Lastindex of (two) --> " + list.lastIndexOf("two"));
		list.set(0, "Zero");
		System.out.println("After set(0,Zero)  method --> " + list);

		System.out.println("DONE");
	}

}
