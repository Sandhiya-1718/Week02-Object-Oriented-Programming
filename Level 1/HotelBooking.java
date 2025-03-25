import java.util.Scanner;
public class HotelBooking{
	String guestName;
	String roomType;
	int nights;
	HotelBooking()
	{
		this.guestName="Guest";
		this.roomType="single";
		this.nights=1;
	}
	HotelBooking(String guestName,String roomType,int nights)
	{
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	HotelBooking(HotelBooking other)
	{
		this.guestName=other.guestName;
		this.roomType=other.roomType;
		this.nights=other.nights;
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.println("------Room Details------");
		System.out.println("Guest Name:"+guestName);
		System.out.println("Room Type :"+roomType);
		System.out.println("Nights    :"+nights);
		System.out.println();
	}
	public static void main(String[] args)
	{
		HotelBooking room1=new HotelBooking();
		room1.displayDetails();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter guest name:");
		String guest=scanner.nextLine();
		System.out.print("Enter room type:");
		String room=scanner.nextLine();
		System.out.print("Enter nights to stay:");
		int night=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		HotelBooking room2=new HotelBooking(guest,room,night);
		room2.displayDetails();
		HotelBooking room3=new HotelBooking(room2);
		room3.displayDetails();
	}
}
		
		
		
		
