//Heber Cooke 		9/30/2018
//problem 9-1
/*
	UML
	 Name:
	 Rectangle 
	-----------
	- width
	- height
	-----------
	+Rectangle() 
	+Rectangle(double,double)
	+getRectangle():void
	+getArea(double,double):double
	+getParameter(double,double):double
*/



class Exersise9_1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		r1.getWidth();
		r1.getHeight();
		r1.getArea();
		r1.getParameter();
		System.out.println();
		r2.getWidth();
		r2.getHeight();
		r2.getArea();
		r2.getParameter();
	}

}// end main -------------------------------------------------
