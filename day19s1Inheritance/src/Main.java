import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");
		int n= sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Enter length and breadth:");
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			Rectangle rec= new Rectangle(length, breadth);
			
			System.out.printf("Area of "+rec.getShapeName()+" is:%.2f",rec.calculateArea());
			break;
		case 2:
			System.out.println("Enter side:");
			int side=sc.nextInt();
			
			Square sq= new Square(side);
			System.out.printf("Area of "+sq.getShapeName()+" is:%.2f",sq.calculateArea());
			break;
		case 3:
			System.out.println("Enter Radius:");
			int radius=sc.nextInt();
			Circle c= new Circle(radius);
			
			System.out.printf("Area of "+c.getShapeName()+" is:%.2f",c.calculateArea());
		default:
			break;
		}
sc.close();
	}

}
