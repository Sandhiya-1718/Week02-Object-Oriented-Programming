import java.util.Scanner;
public class LibraryBook{
	String title;
	String author;
	double price;
	boolean isAvailable;
	LibraryBook(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.isAvailable=true;
	}
	public void borrowBook()
	{
		if(isAvailable)
		{
			isAvailable=false;
			System.out.println("You have borrowed the book successfully.!!");
		}
		else
			System.out.println("Sorry, the book is not available");
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.println("------Book Details------");
		System.out.println("Book title :"+title);
		System.out.println("Book author:"+author);
		System.out.println("Book price :"+price);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter book title:");
		String title=scanner.nextLine();
		System.out.print("Enter author name:");
		String author=scanner.nextLine();
		System.out.print("Enter the price:Rs.");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		LibraryBook book=new LibraryBook(title,author,price);
		book.displayDetails();
		book.borrowBook();
		book.borrowBook();
	}
}