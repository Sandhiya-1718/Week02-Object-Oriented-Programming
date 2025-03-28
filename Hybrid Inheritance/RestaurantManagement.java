class Person{
	String name;
	int id;
	Person(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void displayInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("ID  :"+id);
	}
}
interface Worker{
	void performDuties();
}
class Chef extends Person implements Worker{
	String speciality;
	Chef(String name,int id,String speciality)
	{
		super(name,id);
		this.speciality=speciality;
	}
	@Override
	public void performDuties()
	{
		displayInfo();
		System.out.println("Preparing delicious meals.");
		System.out.println("Speciality:"+speciality);
	}
}
class Waiter extends Person implements Worker{
	String section;
	Waiter(String name,int id,String section)
	{
		super(name,id);
		this.section=section;
	}
	@Override
	public void performDuties()
	{
		displayInfo();
		System.out.println("Serving Customer.");
		System.out.println("Section:"+section);
	}
}
public class RestaurantManagement{
	public static void main(String[] args)
	{
		Chef chef=new Chef("Chef Vicky",101,"Italian Cuisine");
		Waiter waiter=new Waiter("Waiter Arjun",202,"Outdoor Seating");
		System.out.println("----Chef Info----");
		chef.performDuties();
		System.out.println();
		System.out.println("----Waiter Info----");
		waiter.performDuties();
	}
}