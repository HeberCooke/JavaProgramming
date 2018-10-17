/*
UML
GeometricObject
GeometricObject()
GeometricObject(String,Boolean)
+ setColor(String):void
+ setIsFilled(boolean):void
+ getColor():String
+ getIsFilled():boolean
*/


public class GeometricObject {
	private String color;
	private boolean isFilled;

	GeometricObject() {
	}

	GeometricObject(String c, boolean isF) {
		this.color = c;
		this.isFilled = isF;
	}

	public void setColor(String c) {
		this.color = c;

	}

	public void setIsFilled(boolean f) {
		this.isFilled = f;
	}

	public String getColor() {
		return color;
	}

	public boolean getIsFilled() {
		return isFilled;
	}
}

