import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise29_11 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println("----Test setToList Integers----");
		ArrayList<?> list = setToList(set);
		System.out.println(list);

		System.out.println( setToList(set));
		System.out.println("\n----Test setToList Strings----");
		Set<String> set2 = new HashSet<>();
		set2.add("1");
		set2.add("2");
		set2.add("3");
		ArrayList<?> list2 = setToList(set2);
		System.out.println(list2);

		System.out.println(setToList(set2));

	}

	public static <E> ArrayList<E> setToList(Set<E> s) {
		ArrayList<E> list = new ArrayList<>();
		for (E e : s) {
			list.add(e);
		}
		return list;
	}
}
