public class Rectangle{
		private double width;
		private double height;
		Rectangle(){
			this.width = 1;
			this.height =1;
		}
		Rectangle (double w,double h){
			this.width = w;
			this.height = h;
		
		
		
		}
		public void getWidth() {
			System.out.println("Width :"+ this.width);
		}
		public void getHeight() {
			System.out.println("Height :"+ this.height);
		}
		public  void getArea () {
		
			System.out.println("Area :"+ this.width * this.height);
		}
		public void  getParameter () {
		
		System.out.println("Parameter : "+ ((this.width * 2) + (this.height *2)) );
		}

		
		
		
}// end class --------------------------------


