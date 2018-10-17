import java.util.ArrayList;
class RemDups {
	public static void removeDuplicates(ArrayList<Integer> list) { // <-- the method for use 11_13
		// loopint thru the list taking out the duplicates
		for (int i = 0; i < list.size(); i++) { 
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}// end if 
			}// end for 
		}// end for 

		System.out.print("Number list without duplicates ");
		for (int k : list) { // print out arraylist without duplicates
			System.out.print(k + " ");
		}// end for 
	}// end remove duplicates

}