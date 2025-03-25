import java.util.Scanner;
public class Book{
	String title;
	String author;
	double price;
	Book()
	{
		title="The Monk Who Sold His Ferrari";
		author="Robin Sharma";
		price=225;
	}
	Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.println("------Book Details------");
		System.out.println("Book title :"+title);
		System.out.println("Book author:"+author);
		System.out.println("Book price :"+price);
		System.out.println();
	}
	public static void main(String[] args)
	{
		Book book1=new Book();
		book1.displayDetails();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter book title:");
		String title=scanner.nextLine();
		System.out.print("Enter author name:");
		String author=scanner.nextLine();
		System.out.print("Enter the price:Rs.");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		Book book2=new Book(title,author,price);
		book2.displayDetails();
	}
}
		
		