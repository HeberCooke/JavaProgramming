/*UML
 * (italicized)GeometricObject
 * - color:String 
 * - filled: boolean
 * - dateCreated:Date()
 * # GeometricObject(dateCreated: Date)
 * # GeometricObject(color:String,filled boolean)
 * + getColor():String
 * + setColor():void
 * + isFilled():boolean
 * + setFilled():void
 * + getDateCreated():Date
 * + toString():String 
 * (italicized) getArea():double
 * (italicized) getperimeter():double
 */
import java.util.Date;
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	protected GeometricObject() {
		dateCreated = new Date();
	}
	protected GeometricObject(String color,boolean filled) {
		dateCreated = new Date();
		this.color =color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;

	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
		if (filled == false){
			this.color = "--->no color<---";
		}
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	@Override
	public String toString() {
		return "Created on  "+ dateCreated + "\nColor "+ color + "\nFilled "+ filled ;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}//end GeometricObject ------------------------------------------------------------------------------------------------

