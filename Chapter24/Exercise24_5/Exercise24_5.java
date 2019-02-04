//Heber Cooke 		2/4/2019
//Exercise 24_5

public class Exercise24_5 {

	public static void main(String[] args) {
		
		GenericQueue<String> list = new GenericQueue<>();
System.out.println("List.enqueue One");
		list.enqueue("One");
		System.out.println("List.enqueue: Two");
		list.enqueue("two");
		System.out.println("List.enqueue Three");
		list.enqueue("Three");
		System.out.println( "Size is : "+ list.getSize());
		System.out.println("List.dequeue : "+ list.dequeue());
		System.out.println("List.dequeue : "+ list.dequeue());
		System.out.println("List.dequeue : "+ list.dequeue());
		

	}

}
