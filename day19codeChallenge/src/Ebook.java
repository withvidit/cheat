  
public class Ebook extends Book{

private String diskType;
private double size;




public Ebook(String name, String author, double price, String publication,
		String diskType, double size) {
	super(name, author, price, publication);
	this.diskType = diskType;
	this.size = size;
}




public Ebook(String diskType, double size) {
	super();
	this.diskType = diskType;
	this.size = size;
}




public String getDiskType() {
	return diskType;
}




public void setDiskType(String diskType) {
	this.diskType = diskType;
}




public double getSize() {
	return size;
}




public void setSize(double size) {
	this.size = size;
}




void displayDetails()
{
	
	super.displayDetails();
	System.out.printf("\nDisk type:"+this.getDiskType()+"\nSize:%.2f",this.getSize());

}


}


