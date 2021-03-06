
class RegularPolygon {
	
		private int n;
		private double side;
		private double x;
		private double y;
		
		RegularPolygon(){
			this.n = 3;
			this.side = 1;
			this.x = 0;
			this.y = 0;
		}
		RegularPolygon(int n,double side){
			this.n = n;
			this.side = side;
			this.x = 0;
			this.x = 0;
		}
		RegularPolygon(int n ,double side,double x, double y){
			this.n = n;
			this.side = side;
			this.x = x;
			this.x = y;
		}
		 public double getParameter(){
			return  n * side;
		}
		// getters and setters
		public double getArea(){
	 
			return (n * side *side)/(4 * Math.tan(Math.PI/n)); 
		}
		public void setN(int n){
			this.n = n;
		}
		public int getN(){
			return n;
		}
		public void setSide(double side){
			this.side = side; 
		}
		public double getSide(){
			return side;
		}
		public void setX(double x){
			this.x = x;
		}
		public double getX(){
			return x;
		}
		public void setY(double y){
			this.y = y;
		}
		public double getY(){
			return y;
		}
	
} // end RegularPolygon class ---------------

