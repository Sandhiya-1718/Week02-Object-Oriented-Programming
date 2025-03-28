class Vehicle{
	int maxSpeed;
	String fuelType;
	Vehicle(int maxSpeed,String fuelType)
	{
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	public void displayInfo()
	{
		System.out.println("Max Speed    :"+maxSpeed);
		System.out.println("Fuel Type    :"+fuelType);
	}
}
class Car extends Vehicle{
	int seatCapacity;
	Car(int maxSpeed,String fuelType,int seatCapacity)
	{
		super(maxSpeed,fuelType);
		this.seatCapacity=seatCapacity;
	}
	@Override
	public void displayInfo()
	{
		System.out.println("Vehicle Type :Car");
		super.displayInfo();
		System.out.println("Seat Capacity:"+seatCapacity);
	}
}
class Truck extends Vehicle{
	int loadCapacity;
	Truck(int maxSpeed,String fuelType,int loadCapacity)
	{
		super(maxSpeed,fuelType);
		this.loadCapacity=loadCapacity;
	}
	@Override
	public void displayInfo()
	{
		System.out.println("Vehicle Type :Truck");
		super.displayInfo();
		System.out.println("Load Capacity:"+loadCapacity+"kg");
	}
}
class MotorCycle extends Vehicle{
	String brand;
	MotorCycle(int maxSpeed,String fuelType,String brand)
	{
		super(maxSpeed,fuelType);
		this.brand=brand;
	}
	@Override
	public void displayInfo()
	{
		System.out.println("Vehicle Type :MotorCycle");
		super.displayInfo();
		System.out.println("Brand        :"+brand);
	}
}
public class VehicleDemo{
	public static void main(String[] args)
	{
		Car car=new Car(180,"Petrol",5);
		Truck truck=new Truck(150,"Diesel",100);
		MotorCycle motorCycle=new MotorCycle(100,"Petrol","Honda");
		car.displayInfo();
		System.out.println();
		truck.displayInfo();
		System.out.println();
		motorCycle.displayInfo();
	}
}
