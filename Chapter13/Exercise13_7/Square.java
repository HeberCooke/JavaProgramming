/*
	UML
	Square
	- sideLength:double
	  Square()
	  Square(side:double, color: String, filled : boolean)
	+ getArea():double
	+ getPerimeter():double
	(italicized)howToColor:void
*/

import java.util.Date; 
class Square extends GeometricObject implements Colorable{
	private double sideLength;
	
	Square(){
	}
	Square(double side,String color,boolean filled){
		this.sideLength = side;
		setColor(color);	
		if(filled == false){
			setColor("-->no Color<--");
		}
		else{
			setFilled(false);	
		}
	
	}
	
	

	
	// implements from Colorable
	public void howToColor(){
		System.out.print("Color all four sides ");
	}
	// extends from GeometricObject
	@Override
	public double getArea(){
		return sideLength * sideLength;
	}
	// extends from GeometricObject
	@Override
	public double getPerimeter(){
		return 4 * sideLength;
	}
}
	
