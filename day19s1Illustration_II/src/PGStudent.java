class PGStudent extends Student
{
	private String specialization;
	private int noOfPapersPublished;
	public PGStudent(String name, String id, int age, double grade,
			String address, String specialization, int noOfPapersPublished) {
		super(name, id, age, grade, address);
		this.specialization = specialization;
		this.noOfPapersPublished = noOfPapersPublished;
	}
	public void display() {
		super.display();
		System.out.println("Specialization : "+this.getSpecialization()+"\nNo. of papers published : "+this.getNoOfPapersPublished());
		
	}
	public boolean isPassed() {
		if(super.getGrade()>=70 && getNoOfPapersPublished()>=2)
			return true;
		else
			return false;
		
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getNoOfPapersPublished() {
		return noOfPapersPublished;
	}
	public void setNoOfPapersPublished(int noOfPapersPublished) {
		this.noOfPapersPublished = noOfPapersPublished;
	}
	
	
	
}
