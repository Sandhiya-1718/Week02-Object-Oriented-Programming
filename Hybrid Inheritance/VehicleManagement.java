class Vehicle{
	String model;
	int maxSpeed;
	Vehicle(String model,int maxSpeed)
	{
		this.model=model;
		this.maxSpeed=maxSpeed;
	}
	public void displayInfo()
	{
		System.out.println("Model    :"+model);
		System.out.println("Max Speed:"+maxSpeed);
	}
}
interface Refuelable{
	void refuel();
}
class PetrolVehicle extends Vehicle implements Refuelable{
	int fuelCapacity;
	PetrolVehicle(String model,int maxSpeed,int fuelCapacity)
	{
		super(model,maxSpeed);
		this.fuelCapacity=fuelCapacity;
	}
	@Override
	public void refuel()
	{
		displayInfo();
		System.out.println("Refuelling Vehicle.");
		System.out.println("Fuel Capacity:"+fuelCapacity);
	}
}
class ElectricVehicle extends Vehicle implements Refuelable{
	int batteryCapacity;
	ElectricVehicle(String model,int maxSpeed,int batteryCapacity)
	{
		super(model,maxSpeed);
		this.batteryCapacity=batteryCapacity;
	}
	public void charge()
	{
		System.out.println("Charging electric vehicle.");
		System.out.println("Battery Capacity:"+batteryCapacity);
	}
	@Override
	public void refuel()
	{
		displayInfo();
		System.out.println("Electric vehicles does not require fuel.");
		this.charge();
	}
}
public class VehicleManagement{
	public static void main(String[] args)
	{
		PetrolVehicle petrol=new PetrolVehicle("Hyundai i20",160,40);
		ElectricVehicle electric=new ElectricVehicle("MG ZS EV",180,50);
		System.out.println("----Petrol Vehicle Info----");
		petrol.refuel();
		System.out.println();
		System.out.println("----Electric Vehicle Info----");
		electric.refuel();
	}
}