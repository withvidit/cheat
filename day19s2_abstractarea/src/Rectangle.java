
public class Rectangle extends Shape {
    
    private Integer length;
    private Integer breadth;
	
	public float calculateArea() {
		
		return length*breadth;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getBreadth() {
		return breadth;
	}
	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}
	public Rectangle(String name, Integer length, Integer breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

    
    
}
