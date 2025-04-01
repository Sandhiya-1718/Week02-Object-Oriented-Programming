abstract class Vehicle{
	private String vehicleId;
	private String driverName;
	private double ratePerKm;
	public Vehicle(String vehicleId,String driverName,double ratePerKm)
	{
		this.vehicleId=vehicleId;
		this.driverName=driverName;
		this.ratePerKm=ratePerKm;
	}
	public String getVehicleId()
	{
		return vehicleId;
	}
	public String getDriverName()
	{
		return driverName;
	}
	public double getRatePerKm()
	{
		return ratePerKm;
	}
	public String getVehicleDetails()
	{
		return "Vehicle ID:"+vehicleId+", Driver:"+driverName+", Rate/km:Rs."+ratePerKm;
	}
	public abstract double calculateFare(double distance);
}
interface Gps{
	String getCurrentLocation();
	void updateLocation(String newLocation);
}
class Car extends Vehicle implements Gps{
	private String location;
	public Car(String vehicleId,String driverName,double ratePerKm)
	{
		super(vehicleId,driverName,ratePerKm);
		this.location="Unknown";
	}
	@Override
	public double calculateFare(double distance)
	{
		return distance*getRatePerKm()+50;
	}
	@Override
	public String getCurrentLocation()
	{
		return location;
	}
	public void updateLocation(String newLocation)
	{
		location=newLocation;
	}
}
class Bike extends Vehicle implements Gps{
	private String location;
	public Bike(String vehicleId,String driverName,double ratePerKm)
	{
		super(vehicleId,driverName,ratePerKm);
		this.location="Unknown";
	}
	@Override
	public double calculateFare(double distance)
	{
		return distance*getRatePerKm();
	}
	@Override
	public String getCurrentLocation()
	{
		return location;
	}
	public void updateLocation(String newLocation)
	{
		location=newLocation;
	}
}
class Auto extends Vehicle implements Gps{
	private String location;
	public Auto(String vehicleId,String driverName,double ratePerKm)
	{
		super(vehicleId,driverName,ratePerKm);
		this.location="Unknown";
	}
	@Override
	public double calculateFare(double distance)
	{
		return distance*getRatePerKm()+20;
	}
	@Override
	public String getCurrentLocation()
	{
		return location;
	}
	public void updateLocation(String newLocation)
	{
		location=newLocation;
	}
}
public class RideHailingApplication{
	public static void main(String[] args)
	{
		Vehicle rides[]={
			new Car("C101","Arun",15.0),
			new Bike("B202","Ravi",8.0),
			new Auto("A303","Kumar",10.0)
		};
		double distanceToTravel=12.5;
		for(int i=0;i<rides.length;i++)
		{
			System.out.println(rides[i].getVehicleDetails());
			double fare=rides[i].calculateFare(distanceToTravel);
			System.out.println("Distance  :"+distanceToTravel+"km");
			System.out.println("Total Fare:Rs."+fare);
			if(rides[i] instanceof Gps)
			{
				Gps g=(Gps) rides[i];
				g.updateLocation("Downtown");
				System.out.println("Current Location:"+g.getCurrentLocation());
			}
			System.out.println();
		}
	}
}
