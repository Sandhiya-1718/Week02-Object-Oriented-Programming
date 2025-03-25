public class Vehicle{
	String ownerName;
	String vehicleType;
	static double registrationFee=500.00;
	Vehicle(String ownerName,String vehicleType)
	{
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	void displayVehicleDetails()
	{
		System.out.println("Owner Name      :"+ownerName);
		System.out.println("Vehicle Type    :"+vehicleType);
		System.out.println("Registration Fee:Rs."+registrationFee);
	}
	static void updateRegistrationFee(double newFee)
	{
		registrationFee=newFee;
	}
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle("Sweety","Scooter");
		Vehicle v2=new Vehicle("Bharath","Car");
		v1.displayVehicleDetails();
		System.out.println();
		v2.displayVehicleDetails();
		System.out.println();
		Vehicle.updateRegistrationFee(750.75);
		v1.displayVehicleDetails();
		System.out.println();
		v2.displayVehicleDetails();
	}
}