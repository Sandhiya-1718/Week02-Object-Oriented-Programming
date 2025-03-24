import java.util.Scanner;
public class MobilePhone{
	private String brand;
	private String model;
	private double price;
	MobilePhone(String pbrand,String pmodel,double pprice)
	{
		this.brand=pbrand;
		this.model=pmodel;
		this.price=pprice;
	}
	public void displayDetails()
	{
		System.out.println("---------Book Details------------");
		System.out.println("Brand Name :"+brand);
		System.out.println("Model Name :"+model);
		System.out.println("Price      :Rs."+price);
	}
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter brand name:");
		String brand=scanner.nextLine();
		System.out.print("Enter model name:");
		String model=scanner.nextLine();
		System.out.print("Enter price:Rs.");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		MobilePhone mobilephone=new MobilePhone(brand,model,price);
		mobilephone.displayDetails();
	}
}
		