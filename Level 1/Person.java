import java.util.Scanner;
public class Person{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	Person(Person other)
	{
		this.name=other.name;
		this.age=other.age;
	}
	public void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
	}
	public static void main(String[] args)
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter name:");
		String name=scanner.nextLine();
		System.out.print("Enter age:");
		int age=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		Person original=new Person(name,age);
		original.displayDetails();
		Person clone=new Person(original);
		clone.displayDetails();
	}
}