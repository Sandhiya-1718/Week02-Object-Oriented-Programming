class Device{
	String deviceId;
	String status;
	Device(String deviceId,String status)
	{
		this.deviceId=deviceId;
		this.status=status;
	}
	public void displayStatus()
	{
		System.out.println("Device ID         :"+deviceId);
		System.out.println("Status            :"+status);
	}
}
class Thermostat extends Device{
	double temperatureSetting;
	Thermostat(String deviceId,String status,double temperatureSetting)
	{
		super(deviceId,status);
		this.temperatureSetting=temperatureSetting;
	}
	@Override
	public void displayStatus()
	{
		super.displayStatus();
		System.out.println("Temperature Setting:"+temperatureSetting);
	}
}
public class SmartHomeDevices{
	public static void main(String[] args)
	{
		Thermostat t1=new Thermostat("TH-001","ON",22.5);
		Thermostat t2=new Thermostat("TH=002","OFF",27.8);
		t1.displayStatus();
		System.out.println();
		t2.displayStatus();
	}
}
	