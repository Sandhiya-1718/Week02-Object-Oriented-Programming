import java.util.Scanner;
public class Product{
	String productName;
	double price;
	static int totalProducts=0;
	Product(String name,double price)
	{
		this.productName=name;
		this.price=price;
		totalProducts++;
	}
	void displayProductDetails()
	{
		System.out.println("Product Name:"+productName);
		System.out.println("Price       :Rs."+price);
	}
	static void displayTotalProducts()
	{
		System.out.println("Total Products:"+totalProducts);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter product name:");
		String product=scanner.nextLine();
		System.out.print("Enter the price:");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		Product p1=new Product(product,price);
		p1.displayProductDetails();
		Product.displayTotalProducts();
	}
}