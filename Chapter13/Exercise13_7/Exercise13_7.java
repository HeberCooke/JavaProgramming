// Heber Cooke 		10/31/2018
// Exercise 13-7

import java.util.ArrayList;


class Exercise13_7 {
	public static void main(String[] args) {


	Square [] list = new Square[5];
	
	list[0] = new Square(10, "black", true);
	list[1] = new Square(3.2, "red", true);
	list[2] = new Square(5.2, "white", false);
	list[3] = new Square(2.9, "white", true);
	list[4] = new Square(6.7, "blue", true);
	
	for (int i = 0; i < list.length; i++){
		System.out.println("Square #"+(i+1));
		System.out.println("Area is :"+list[i].getArea());
		
		list[i].howToColor();
	
		System.out.println("\nColor :"+ list[i].getColor());
		System.out.println("Perimeter :"+ list[i].getPerimeter());
		System.out.println();
	}
		

		
		
	}
}// end Exercise 13 - 7----------------------------------
