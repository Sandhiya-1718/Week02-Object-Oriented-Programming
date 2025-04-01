abstract class Product{
	private int productId;
	private String name;
	private double price;
	public Product(int productId,String name,double price)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public int getProductId()
	{
		return productId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public abstract double calculateDiscount();
}
interface Taxable{
	double calculateTax();
	String getTaxDetails();
}
class Electronics extends Product implements Taxable{
	public Electronics(int productId,String name,double price)
	{
		super(productId,name,price);
	}
	@Override
	public double calculateDiscount()
	{
		return getPrice()*0.10;
	}
	public double calculateTax()
	{
		return getPrice()*0.18;
	}
	@Override
	public String getTaxDetails()
	{
		return "Electronic Tax:18%";
	}
}
class Clothing extends Product implements Taxable{
	public Clothing(int productId,String name,double price)
	{
		super(productId,name,price);
	}
	@Override
	public double calculateDiscount()
	{
		return getPrice()*0.15;
	}
	public double calculateTax()
	{
		return getPrice()*0.12;
	}
	@Override
	public String getTaxDetails()
	{
		return "Clothing Tax:12%";
	}
}
class Groceries extends Product{
	public Groceries(int productId,String name,double price)
	{
		super(productId,name,price);
	}
	public double calculateDiscount()
	{
		return getPrice()*0.05;
	}
}
public class ECommerceSystem{
	public static void calculateFinalPrices(Product[] products)
	{
		for(int i=0;i<products.length;i++)
		{
			Product product=products[i];
			double price=product.getPrice();
			double discount=product.calculateDiscount();
			double tax=0.0;
			if(product instanceof Taxable)
			{
				tax=((Taxable)product).calculateTax();
				System.out.println(((Taxable)product).getTaxDetails());
			}
			else
				System.out.println("No Tax Applicable");
			double finalPrice=price+tax-discount;
			System.out.println("Product    :"+product.getName());
			System.out.println("Base Price :Rs."+price);
			System.out.println("Discount   :Rs."+discount);
			System.out.println("Tax        :Rs."+tax);
			System.out.println("Final Price:Rs."+finalPrice);
		}
	}
	public static void main(String[] args)
	{
		Product products[]=new Product[3];
		products[0]=new Electronics(101,"Smartphone",50000);
		products[1]=new Clothing(102,"T-Shirt",1500);
		products[2]=new Groceries(103,"Rice",2000);
		calculateFinalPrices(products);
	}
}
