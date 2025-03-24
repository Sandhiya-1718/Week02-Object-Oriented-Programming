import java.util.Scanner;
public class Book{
	private String title;
	private String author;
	private double price;
	Book(String btitle,String bauthor,double bprice)
	{
		this.title=btitle;
		this.author=bauthor;
		this.price=bprice;
	}
	public void displayDetails()
	{
		System.out.println("---------Book Details------------");
		System.out.println("Title       :"+title);
		System.out.println("Author Name :"+author);
		System.out.println("Price       :Rs."+price);
	}
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter title:");
		String title=scanner.nextLine();
		System.out.print("Enter author name:");
		String author=scanner.nextLine();
		System.out.print("Enter price:Rs.");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		Book book=new Book(title,author,price);
		book.displayDetails();
	}
}
		