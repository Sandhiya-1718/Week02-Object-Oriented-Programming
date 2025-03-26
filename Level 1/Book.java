public class Book{
	static String libraryName="Central Library";
	private final String isbn;
	private String title;
	private String author;
	public Book(String isbn,String title,String author)
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
	}
	public static void displayLibraryName()
	{
		System.out.println("Library Name:"+libraryName);
	}
	public void displayBookDetails()
	{
		if(this instanceof Book)
		{
			System.out.println("----------Book Details----------");
			System.out.println("Title  :"+title);
			System.out.println("Author :"+author);
			System.out.println("ISBN   :"+isbn);
		}
		else
			System.out.println("Not a valid Book object.");
	}
	public static void main(String[] args)
	{
		Book.displayLibraryName();
		Book b1=new Book("1345-2123-431","Thirukkural","Thiruvalluvar");
		Book b2=new Book("4324-1235-321","Ponniyin Selvan","Kalki");
		b1.displayBookDetails();
		System.out.println();
		b2.displayBookDetails();
		System.out.println();
	}
}
