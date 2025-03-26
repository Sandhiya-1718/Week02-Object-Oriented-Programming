public class Product{
	static double discount=10.0;
	private final int productId;
	private String productName;
	private double price;
	private int quantity;
	public Product(int productId,String productName,double price,int quantity)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	public static void updateDiscount(double newDiscount)
	{
		discount=newDiscount;
	}
	public void displayProductDetails()
	{
		if(this instanceof Product)
		{
			System.out.println("----------Product Details----------");
			System.out.println("Product Id:"+productId);
			System.out.println("Name      :"+productName);
			System.out.println("Price     :Rs."+price);
			System.out.println("Quantity  :"+quantity);
			System.out.println("Discount  :"+discount+"%");
		}
		else
			System.out.println("Invalid product.");
	}
	public static void main(String[] args)
	{
		System.out.println("Current Discount:"+Product.discount);
		Product p1=new Product(12,"Milk",25,2);
		Product p2=new Product(13,"Curd",30,1);
		p1.displayProductDetails();
		System.out.println();
		p2.displayProductDetails();
		System.out.println();
		System.out.println("Updated Discount:");
		Product.updateDiscount(12.5);
		p1.displayProductDetails();
		System.out.println();
		p2.displayProductDetails();
		System.out.println();
	}
}
