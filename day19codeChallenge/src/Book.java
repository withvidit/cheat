
public class Book {
	protected String name,author,publication;
	protected double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
    

public Book(String name, String author, double price, String publication) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}




//fill the code

public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getPublication() {
		return publication;
	}




	public void setPublication(String publication) {
		this.publication = publication;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




void displayDetails()
{
System.out.printf("Name of the book :"+this.getName()+"\nAuthor:"+this.getAuthor()+"\nPrice:%.2f\nPublication:"+this.getPublication(),this.getPrice());
      
}
}


