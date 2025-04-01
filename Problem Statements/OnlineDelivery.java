abstract class FoodItem{
	private String itemName;
	private double price;
	private int quantity;
	public FoodItem(String itemName,double price,int quantity)
	{
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	public String getItemName()
	{
		return itemName;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getItemDetails()
	{
		return "Item:"+itemName+", Price:"+price+", Quantity:"+quantity;
	}
	public abstract double calculateTotalPrice();
}
interface Discountable{
	double applyDiscount();
	String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
	public VegItem(String itemName,double price,int quantity)
	{
		super(itemName,price,quantity);
	}
	@Override
	public double calculateTotalPrice()
	{
		return getPrice()*getQuantity();
	}
	@Override
	public double applyDiscount()
	{
		return calculateTotalPrice()*0.10;
	}
	@Override
	public String getDiscountDetails()
	{
		return "10% discount on veg items";
	}
}
class NonVegItem extends FoodItem implements Discountable{
	private static final double nonVegCharge=20.0;
	public NonVegItem(String itemName,double price,int quantity)
	{
		super(itemName,price,quantity);
	}
	@Override
	public double calculateTotalPrice()
	{
		return (getPrice()*getQuantity())+nonVegCharge;
	}
	@Override
	public double applyDiscount()
	{
		return calculateTotalPrice()*0.05;
	}
	@Override
	public String getDiscountDetails()
	{
		return "5% discount on Non-veg items+Rs.20 non-veg charge";
	}
}
public class OnlineDelivery{
	public static void main(String[] args)
	{
		FoodItem order[]={
			new VegItem("Panneer Butter Masala",180,2),
			new NonVegItem("Chicken Briyani",250,1)
		};
		for(int i=0;i<order.length;i++)
		{
			System.out.println(order[i].getItemDetails());
			System.out.println("Total Price     :Rs."+order[i].calculateTotalPrice());
			if(order[i] instanceof Discountable)
			{
				Discountable d=(Discountable) order[i];
				System.out.println("Discount Info   :"+d.getDiscountDetails());
				double discount=d.applyDiscount();
				System.out.println("Discount Applied:Rs."+discount);
				System.out.println("Final Price     :Rs."+(order[i].calculateTotalPrice()-discount));
			}
			System.out.println();
		}
	}
}