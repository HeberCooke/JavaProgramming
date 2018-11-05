/*UML
	Octagon
	- side: double
	+ area: double	  
	  Octagon(side:double,color:String, filled :boolean)
	+ (italicized)getArea():double
	+ (italicized)getParamiter():double  	
	+ clone():Object
	+ compareTo(x:Object):int	
	
	
*/



class Octagon extends GeometricObject implements Comparable,Cloneable{
	
	private double side;
	public double  area;

	public Octagon(double side,String color,boolean filled){
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	// abstract methods from the geometric object
	public double getArea(){
		area = (2 + 4/Math.sqrt(2.0))* side * side;
		return area;
	}	
	public double getPerimeter(){
		return side * 8;
	}
	
	// cloan and compare methods
	@Override
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	@Override
	public int compareTo(Object x){
		if (area < this.getArea()){
			return 1;
		}
		return -1;
	}


}// end Octagon----------------------------------------------------

