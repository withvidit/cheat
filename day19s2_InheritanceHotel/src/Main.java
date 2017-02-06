import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n;
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV,hasWifi;
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		n=sc.nextInt();
		sc.nextLine();
		switch(n){
		case 1:
			System.out.println("Hotel Name:");
			hotelName=sc.nextLine();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			sc.nextLine();
			System.out.println("Room has TV (yes/no):");
			String tv=sc.nextLine();
			if(tv.equals("yes")){
				hasTV=true;
			}
			else{
				hasTV=false;
			}
			System.out.println("Room has Wifi (yes/no):");
			String wi=sc.nextLine();
			if(wi.equals("yes")){
				hasWifi=true;
			}
			else{
				hasWifi=false;
			}
			DeluxeRoom d=new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is:"+d.calculateTariff());
		break;
		case 2:
			System.out.println("Hotel Name:");
			hotelName=sc.nextLine();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			sc.nextLine();
			System.out.println("Room has TV (yes/no):");
			String tvd=sc.nextLine();
			if(tvd.equals("yes")){
				hasTV=true;
			}
			else{
				hasTV=false;
			}
			System.out.println("Room has Wifi (yes/no):");
			String wid=sc.nextLine();
			if(wid.equals("yes")){
				hasWifi=true;
			}
			else{
				hasWifi=false;
			}
			DeluxeACRoom da=new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is:"+da.calculateTariff());
		break;
		case 3:
			System.out.println("Hotel Name:");
			hotelName=sc.nextLine();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			sc.nextLine();
			System.out.println("Room has TV (yes/no):");
			String tvs=sc.nextLine();
			if(tvs.equals("yes")){
				hasTV=true;
			}
			else{
				hasTV=false;
			}
			System.out.println("Room has Wifi (yes/no):");
			String wis=sc.nextLine();
			if(wis.equals("yes")){
				hasWifi=true;
			}
			else{
				hasWifi=false;
			}
			SuiteACRoom su=new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is:"+su.calculateTariff());
		break;
		}
		
	}
}
