import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Main { 

public static void main(String args[]) throws IOException  { 


BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the book name");
String name=br.readLine();
System.out.println("Enter the author name");
String author=br.readLine();
System.out.println("Enter the price");
double price= Double.parseDouble(br.readLine());
System.out.println("Enter the publication name");
String publication= br.readLine();
System.out.println("Enter the type of book\n1.PrintedBook\n2.EBook");
int n= Integer.parseInt(br.readLine());

switch (n) {
case 1:
	System.out.println("Enter the number of pages of the book");
	int noOfPages= Integer.parseInt(br.readLine());
	System.out.println("Enter the binding type of the book");
	String bindingType=br.readLine();
	System.out.println("Enter the paper type of the book");
	String paperType=br.readLine();
	PrintedBook pbook= new PrintedBook(name, author, price, publication, noOfPages, bindingType, paperType);
	System.out.println("Printed Book Details");
	pbook.displayDetails();
	break;
case 2:
	System.out.println("Enter the disk type of the book");
	String diskType= br.readLine();
	System.out.println("Enter the size of the disk");
	double size=Double.parseDouble(br.readLine());
	Ebook ebook= new Ebook(name, author, price, publication, diskType, size);
	System.out.println("EBook Details");
	ebook.displayDetails();
	break;
default:
	break;
}

}

 
}

