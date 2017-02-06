class UGStudent extends Student
{
	private String degree;
	private String stream;
	public UGStudent(String name, String id, int age, double grade,
			String address, String degree, String stream) {
		super(name, id, age, grade, address);
		this.degree = degree;
		this.stream = stream;
	}
	
	public void display() {
		super.display();
		System.out.println("Degree : "+this.getDegree()+"\nStream : "+this.getStream());
		
	}
	
	public boolean isPassed() {
		if(super.getGrade()>=70)
			return true;
		else
			return false;
		
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
}
	
