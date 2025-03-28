class Order{
	String orderId;
	String orderDate;
	Order(String orderId,String orderDate)
	{
		this.orderId=orderId;
		this.orderDate=orderDate;
	}
	public void getOrderStatus()
	{
		System.out.println("Order ID       :"+orderId);
		System.out.println("Order Date     :"+orderDate);
	}
}
class ShippedOrder extends Order{
	String trackingNumber;
	ShippedOrder(String orderId,String orderDate,String trackingNumber)
	{
		super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	}
	@Override
	public void getOrderStatus()
	{
		super.getOrderStatus();
		System.out.println("Tracking Number:"+trackingNumber);
	}
}
class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	DeliveredOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate)
	{
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	@Override
	public void getOrderStatus()
	{
		super.getOrderStatus();
		System.out.println("Delivery Date  :"+deliveryDate);
	}
}
public class OnlineRetailOrder{
	public static void main(String[] args)
	{
		Order order=new Order("ord101","2025-04-10");
		ShippedOrder shipped=new ShippedOrder("ord102","2025-10-17","trk345");
		DeliveredOrder delivered=new DeliveredOrder("ord103","2025-07-18","trk789","2025-07-25");
		order.getOrderStatus();
		System.out.println();
		shipped.getOrderStatus();
		System.out.println();
		delivered.getOrderStatus();
	}
}