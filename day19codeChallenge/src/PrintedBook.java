
public class PrintedBook extends Book{
    
private int numOfPages;
private String bindingType,paperType;
public PrintedBook() {
	// TODO Auto-generated constructor stub
}

public PrintedBook(String name, String author, double price,
		String publication, int numOfPages, String bindingType, String paperType) {
	super(name, author, price, publication);
	this.numOfPages = numOfPages;
	this.bindingType = bindingType;
	this.paperType = paperType;
}


public int getNumOfPages() {
	return numOfPages;
}


public void setNumOfPages(int numOfPages) {
	this.numOfPages = numOfPages;
}


public String getBindingType() {
	return bindingType;
}


public void setBindingType(String bindingType) {
	this.bindingType = bindingType;
}


public String getPaperType() {
	return paperType;
}


public void setPaperType(String paperType) {
	this.paperType = paperType;
}


void displayDetails()
{



super.displayDetails();
System.out.println("\nNumber of Pages:"+this.getNumOfPages()+"\nBinding type:"+this.getBindingType()+"\nPaper type:"+this.getPaperType());

}
}


