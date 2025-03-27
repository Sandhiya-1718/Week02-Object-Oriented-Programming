import java.util.ArrayList;
class Book{
	String title;
	String author;
	Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	public void display()
	{
		System.out.println("Title:"+title+"   Author:"+author);
	}
}
public class Library{
	String name;
	ArrayList<Book> books;
	Library(String name)
	{
		this.name=name;
		books=new ArrayList<>();
	}
	public void addBook(Book book)
	{
		books.add(book);
	}
	public void showBook()
	{
		System.out.println("Library:" +name);
		for(int i=0;i<books.size();i++)
			books.get(i).display();
		System.out.println();
	}
	public static void main(String[] args)
	{
		Book b1=new Book("The Alchemist","Paulo Coelho");
		Book b2=new Book("1984","George Orwell");
		Book b3=new Book("To kill a Mockingbird","Harper Lee");
		Library l1=new Library("City Library");
		Library l2=new Library("School Library");
		l1.addBook(b1);
		l1.addBook(b2);
		l2.addBook(b1);
		l2.addBook(b3);
		l1.showBook();
		l2.showBook();
	}
}