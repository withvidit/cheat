
public class Rectangle extends Shape {
	
	private int length,breadth;
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	public double  calculateArea() {
		
		double area=length*breadth;
		
		return area;
}
	}
