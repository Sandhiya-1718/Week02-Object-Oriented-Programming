import java.util.Scanner;
public class CarRental{
	String customerName;
	String carModel;
	int rentalDays;
	final double costPerDay=50.0;
	CarRental(String customerName,String carModel,int rentalDays)
	{
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	public double calculateTotalCost()
	{
		return costPerDay*rentalDays;
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.println("------Room Details------");
		System.out.println("Customer Name:"+customerName);
		System.out.println("Car Model    :"+carModel);
		System.out.println("Rental Days  :"+rentalDays);
		System.out.println("Total Cost   :Rs."+calculateTotalCost());
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter customer name:");
		String customer=scanner.nextLine();
		System.out.print("Enter car model:");
		String car=scanner.nextLine();
		System.out.print("Enter rental days:");
		int days=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		CarRental carRental=new CarRental(customer,car,days);
		carRental.displayDetails();
	}
}
		
		
		
		
