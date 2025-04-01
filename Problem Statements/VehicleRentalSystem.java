abstract class Vehicle{
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	public Vehicle(String vehicleNumber,String type,double rentalRate)
	{
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
	}
	public String getVehicleNumber()
	{
		return vehicleNumber;
	}
	public String getType()
	{
		return type;
	}
	public double getRentalRate()
	{
		return rentalRate;
	}
	public abstract double calculateRentalCost(int days);
}
interface Insurable{
	double calculateInsurance();
	String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	public Car(String vehicleNumber,double rentalRate,String insurancePolicyNumber)
	{
		super(vehicleNumber,"Car",rentalRate);
		this.insurancePolicyNumber=insurancePolicyNumber;
	}
	@Override 
	public double calculateRentalCost(int days)
	{
		return getRentalRate()*days;
	}
	@Override
	public double calculateInsurance()
	{
		return getRentalRate()*0.05;
	}
	@Override
	public String getInsuranceDetails()
	{
		return "Car Insurance Policy Number:"+insurancePolicyNumber;
	}
}
class Bike extends Vehicle{
	public Bike(String vehicleNumber,double rentalRate)
	{
		super(vehicleNumber,"Bike",rentalRate);
	}
	@Override 
	public double calculateRentalCost(int days)
	{
		return getRentalRate()*days;
	}
}
class Truck extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	public Truck(String vehicleNumber,double rentalRate,String insurancePolicyNumber)
	{
		super(vehicleNumber,"Truck",rentalRate);
		this.insurancePolicyNumber=insurancePolicyNumber;
	}
	@Override
	public double calculateRentalCost(int days)
	{
		return getRentalRate()*days;
	}
	@Override
	public double calculateInsurance()
	{
		return getRentalRate()*0.1;
	}
	@Override
	public String getInsuranceDetails()
	{
		return "Truck Insurance Policy Number:"+insurancePolicyNumber;
	}
}
public class VehicleRentalSystem{
	public static void main(String[] args)
	{
		Vehicle vehicles[]=new Vehicle[3];
		vehicles[0]=new Car("CAR123",500,"INS12345");
		vehicles[1]=new Bike("BIKE456",200);
		vehicles[2]=new Truck("TRUCK789",1000,"INS67890");
		int rentalDays=5;
		for(int i=0;i<vehicles.length;i++)
		{
			Vehicle vehicle=vehicles[i];
			System.out.println("Vehicle Number:"+vehicle.getVehicleNumber());
			System.out.println("Vehicle Type  :"+vehicle.getType());
			System.out.println("Rental Cost for "+rentalDays+" days:Rs."+vehicle.calculateRentalCost(rentalDays));
			if(vehicle instanceof Insurable)
			{
				Insurable insurableVehicle=(Insurable) vehicle;
				System.out.println(insurableVehicle.getInsuranceDetails());
				System.out.println("Insurance Cost:Rs."+insurableVehicle.calculateInsurance());
			}
			else
				System.out.println("No Insurance Applicable");
		}
	}
}