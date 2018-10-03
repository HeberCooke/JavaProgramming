/*
	Heber Cooke 		10/3/2018
	exersise 9-9
	UML
	- int n
	- double side
	- double x
	- double y
	+RegularPolygon()
	+RegularPolygon(int,double)
	+RegularPolygon(int,double,double,double)
	+GetParameter(int,double):double 
	+getArea():double
	+setN(int):void
	+getN():int
	+setSide(double):void
	+getSide():double
	+setX(double):void
	+getX():double
	+setY(double):void
	+getY():double
	
*/

class Exersise9_9 {
	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon(6,4);
		 System.out.print("Perimeter :"+ p1.getParameter()+ "\nArea :"+ p1.getArea() );
		
		
		System.out.println();
		RegularPolygon p2 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.print("Perimeter :"+ p2.getParameter()+ "\nArea :"+ p2.getArea() );
	}// end main -----------------------
}	// end class-----------------------