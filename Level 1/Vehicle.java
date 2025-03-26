public class Vehicle{
	static double registrationFee=100.00;
	private final int registrationNumber;
	private String ownerName;
	private String vehicleType;
	public Vehicle(int registrationNumber,String ownerName,String vehicleType)
	{
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	public void displayDetails()
	{
		if(this instanceof Vehicle)
		{
			System.out.println("-----Vehicle Regisstration Details-----");
			System.out.println("Owner Name         :"+ownerName);
			System.out.println("Vehicle Type       :"+vehicleType);
			System.out.println("Registration Number:"+registrationNumber);
			System.out.println("Registration Fees  :"+registrationFee);
		}
		else
			System.out.println("Not a object of vehicle.");
	}
	public void updateRegistrationFee(double newRegistrationFee)
	{
		if(this instanceof Vehicle)
		{
			this.registrationFee=newRegistrationFee;
			System.out.println("Registration Fees updated for "+ownerName);
		}
		else
			System.out.println("Operation not allowed.Not a owner.");
	}
	public static void main(String[] args)
	{
		Vehicle v1=new Vehicle(8881,"Sweety","Scooter");
		Vehicle v2=new Vehicle(8689,"Ravi","Car");
		v1.displayDetails();
		System.out.println();
		v2.displayDetails();
		System.out.println();
		v2.updateRegistrationFee(150.50);
		v2.displayDetails();
		System.out.println();
	}
}