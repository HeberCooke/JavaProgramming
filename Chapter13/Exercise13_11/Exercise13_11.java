// Heber Cooke 		11/1/2018
// Exercise 13-11

class Exercise13_11 {
	public static void main(String[] args) {
		
		Octagon o1 = new Octagon(3,"white",true);
		
		Octagon o2 = new Octagon(4,"blue", true);
		
		Octagon o3 = new Octagon(2.2, "red", false);
		// octagon 1 test 
		System.out.println("Octagon #1 ");
		System.out.println(o1.toString()+ "\nArea :"+ o1.getArea()+ "\nParameter :"+o1.getPerimeter());
		System.out.println();
		// octagon 2 test
		System.out.println("Octagon #2 ");
		System.out.println(o2.toString()+ "\nArea :"+ o2.getArea()+ "\nParameter :"+o2.getPerimeter());
		System.out.println();
		// octagon with no color test
		System.out.println("Octagon #3 test no color");
		System.out.println(o3.toString()+ "\nArea :"+ o3.getArea()+ "\nParameter :"+o3.getPerimeter());
		System.out.println();
		// using the compare method 
		System.out.println("compareto method, test octagon 1 and octagon 2 ");
		if (o1.compareTo(o2) == 1){
			System.out.println("Octagon one is larger");
		}
		else {
			System.out.println("Octagon two is larger");
		}
		System.out.println();
		System.out.println("clone method test octagon #2 clone to #4");
		System.out.println("Octagon #4");
		// using the clone method 
		try {
			Octagon o4 = (Octagon)o1.clone();
			
			System.out.println(o4.toString()+ "\nArea :"+ o4.getArea()+ "\nParameter :"+o4.getPerimeter());
				System.out.println();
		}
		catch (CloneNotSupportedException x) {
			System.out.println(" clone exception");
		}
	
		
		
	}
} // end Exercise 13-11---------------------------------------


