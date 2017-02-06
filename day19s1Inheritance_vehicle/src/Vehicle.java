
public class Vehicle
{
	String make;
	String vehicleNumber;
	String fuelType;
	int fuelCapacity;
	int cc;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public Vehicle() {}
	
	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
		setMake(make);
		setVehicleNumber(vehicleNumber);
		setFuelType(fuelType);
		setFuelCapacity(fuelCapacity);
		setCc(cc);
	}
	
	public void	displayMake(){
		System.out.println("***"+getMake()+"***");
	}
	
	public void displayBasicInfo() {
		System.out.println("---Basic Information---");
		 System.out.println("Vehicle Number:"+getVehicleNumber());
		 System.out.println("Fuel Capacity:"+getFuelCapacity());
		 System.out.println("Fuel Type:"+getFuelType());
		 System.out.println("CC:"+getCc());
	}
	public void displayDetailInfo(){}

}
