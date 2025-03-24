import java.util.Scanner;
class CartItem{
	private String itemName;
	private double price;
	private int quantity;
	CartItem(String item,double price,int quantity)
	{
		this.itemName=item;
		this.price=price;
		this.quantity=quantity;
	}
	public String getItemName()
	{
		return itemName;
	}
	public double getItemTotal()
	{
		return price*quantity;
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.printf("%20s %10s %10s %10s\n",itemName,price,quantity,getItemTotal());
		
	}
}
public class ShoppingCart{
	CartItem cart[];
	int count;
	public ShoppingCart(int size)
	{
		cart=new CartItem[size];
		count=0;
	}
	public void addItem(String name,double price,int quantity)
	{
		if(count<cart.length)
		{
			cart[count]=new CartItem(name,price,quantity);
			count++;
			System.out.println("Item added successfully;");
			
		}
		else
			System.out.println("Cart is full!");
	}
	public void removeItem(String name)
	{
		boolean found=false;
		for(int i=0;i<count;i++)
		{
			if(cart[i].getItemName().equalsIgnoreCase(name))
			{
				for(int j=i;j<count-1;j++)
					cart[j]=cart[j+1];
				cart[count-1]=null;
				count--;
				found=true;
				System.out.println("Item removed successfully.");
				break;
			}
		}
		if(!found)
			System.out.println("Item not found in cart.");
	}
	public void displayCart()
	{
		if(count==0)
			System.out.println("Cart is empty.");
		else
		{
			double total=0;
			System.out.println("------------------------Cart Items----------------------------");
		System.out.printf("%20s %10s %10s %10s\n","Item Name","Price","Quantity","Total");
			for(int i=0;i<count;i++)
			{
				cart[i].displayDetails();
				total+=cart[i].getItemTotal();
			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("Total Cost :Rs."+total);
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		ShoppingCart myCart=new ShoppingCart(100);
		int choice;
		do
		{
			System.out.println("\n------Shopping Cart Menu------");
			System.out.println("1.Add Item");
			System.out.println("2.Remove Item");
			System.out.println("3.Display Cart");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			choice=scanner.nextInt();
			scanner.nextLine(); 
			switch(choice)
			{
			case 1:
				System.out.print("Enter item name:");
				String item=scanner.nextLine();
				System.out.print("Enter price:Rs.");
				double price=scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Enter quantity:");
				int quantity=scanner.nextInt();
				scanner.nextLine();
				myCart.addItem(item,price,quantity);
				break;
			case 2:
				System.out.print("Enter item name to remove:");
				String remove=scanner.nextLine();
				myCart.removeItem(remove);
				break;
			case 3:
				myCart.displayCart();
				break;
			case 4:
				System.out.println("Thank you for shopping.!!");
				break;
			default:
				System.out.println("Invalid choice.Please try again.!");
			}
		}while(choice!=4);
		scanner.close();
	}
}