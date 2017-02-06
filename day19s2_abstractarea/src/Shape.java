
public abstract class Shape {
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}
	public abstract float calculateArea();
    
}
