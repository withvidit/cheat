import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		String make;
		String vehicleNumber;
		String fuelType="";
		int fuelCapacity;
		int cc;
		String audioSystem;
		int numberOfDoors;
		boolean kickStartAvailable = false;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" 1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		int n = scanner.nextInt();scanner.nextLine();
		switch (n) {
		case 1:
			
			System.out.println("Vehicle Make:");
			make=scanner.nextLine();
			System.out.println("Vehicle Number:");
			vehicleNumber=scanner.nextLine();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			switch (scanner.nextInt()) {
			case 1:
				fuelType="Petrol";
				break;
			case 2:
				fuelType="Diesel";
				break;
			default:
				break;
			}
			System.out.println("Fuel Capacity:");
			fuelCapacity=scanner.nextInt();
			System.out.println("Engine CC:");
			cc=scanner.nextInt();scanner.nextLine();
			System.out.println("Audio System:");
			audioSystem=scanner.nextLine();
			System.out.println("Number of Doors:");
			numberOfDoors=scanner.nextInt();
			FourWheeler fWheeler=new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			fWheeler.displayMake();
			
			fWheeler.displayBasicInfo();
			
			fWheeler.displayDetailInfo();
			break;
		case 2:
			System.out.println("Vehicle Make:");
			make=scanner.nextLine();
			System.out.println("Vehicle Number:");
			vehicleNumber=scanner.nextLine();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			switch (scanner.nextInt()) {
			case 1:
				fuelType="Petrol";
				break;
			case 2:
				fuelType="Diesel";
				break;
			default:
				break;
			}
			System.out.println("Fuel Capacity:");
			fuelCapacity=scanner.nextInt();
			System.out.println("Engine CC:");
			cc=scanner.nextInt();scanner.nextLine();
			
			System.out.println("Kick Start Available(yes/no):");
			switch (scanner.nextLine()) {
			case "yes":
				kickStartAvailable=true;
				break;
			case "no":
				kickStartAvailable=false;
				break;
			default:
				break;
			}
			TwoWheeler tWheeler=new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc,kickStartAvailable);
			tWheeler.displayMake();
			//System.out.println("---Basic Information---");
			tWheeler.displayBasicInfo();
			//System.out.println("---Detail Information---");
			tWheeler.displayDetailInfo();
			break;
		default:
			break;
		}
	}

}
