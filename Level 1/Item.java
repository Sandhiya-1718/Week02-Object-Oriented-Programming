import java.util.Scanner;
public class Item{
	private int itemCode;
	private String itemName;
	private double itemPrice;
	Item(int code,String name,double price)
	{
		this.itemCode=code;
		this.itemName=name;
		this.itemPrice=price;
	}
	public void displayDetails()
	{
		System.out.println("---------Item Details------------");
		System.out.println("Item Code  :"+itemCode);
		System.out.println("Item Name  :"+itemName);
		System.out.println("Item Price :"+itemPrice);
	}
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter item code:");
		int code=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter item name:");
		String name=scanner.nextLine();
		System.out.print("Enter item price:Rs.");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		Item item=new Item(code,name,price);
		item.displayDetails();
	}
}
		