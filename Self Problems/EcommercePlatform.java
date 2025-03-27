import java.util.ArrayList;
class Product{
	String name;
	double price;
	Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Product:"+name+", Price:Rs."+price);
	}
}
class Order{
	int orderId;
	ArrayList<Product> products;
	Order(int orderId)
	{
		this.orderId=orderId;
		products=new ArrayList<>();
	}
	public void addProduct(Product p)
	{
		products.add(p);
	}
	public void viewOrderDetails()
	{
		System.out.println("Order ID:"+orderId);
		for(int i=0;i<products.size();i++)
			products.get(i).display();
	}
}
class Customer{
	String name;
	ArrayList<Order>orders;
	Customer(String name)
	{
		this.name=name;
		orders=new ArrayList<>();
	}
	public void placeOrder(Order order)
	{
		orders.add(order);
		System.out.println(name+" placed an order (ID:"+order.orderId+")");
	}
	public void viewAllOrders()
	{
		System.out.println("Orders for customer:"+name);
		for(int i=0;i<orders.size();i++)
			orders.get(i).viewOrderDetails();
	}
}
public class EcommercePlatform{
	public static void main(String[] args)
	{
		Product p1=new Product("Laptop",55000.00);
		Product p2=new Product("Mouse",20000.00);
		Product p3=new Product("Headphones",3000.00);
		Customer c1=new Customer("Sweety");
		Order o1=new Order(1001);
		o1.addProduct(p1);
		o1.addProduct(p2);
		c1.placeOrder(o1);
		Order o2=new Order(1002);
		o2.addProduct(p3);
		c1.placeOrder(o2);
		c1.viewAllOrders();
	}
}