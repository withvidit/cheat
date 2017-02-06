
public class Square extends Shape {
    
    public Square(String name, Integer side) {
		super(name);
		this.side = side;
	}

	private Integer side;

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {
		
		return side*side;
	}

	
       
    
}
	
