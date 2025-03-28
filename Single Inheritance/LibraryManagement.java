class Book{
	String title;
	int publicationYear;
	Book(String title,int publicationYear)
	{
		this.title=title;
		this.publicationYear=publicationYear;
	}
	public void displayInfo()
	{
		System.out.println("Book Title    :"+title);
		System.out.println("Published Year:"+publicationYear);
	}
}
class Author extends Book{
	String name;
	String bio;
	Author(String title,int publicationYear,String name,String bio)
	{
		super(title,publicationYear);
		this.name=name;
		this.bio=bio;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Author Name   :"+name);
		System.out.println("Author Bio    :"+bio);
	}
}
public class LibraryManagement{
	public static void main(String[] args)
	{
		Author book1=new Author("Thirukkural",1330,"Thiruvalluvar","A revered Tamil poet and philosopher whose exact birth and death dates are unknown, but he is considered to have lived sometime between the 3rd century BCE and 3rd century CE.");
		Author book2=new Author("Silappathikaram",1892,"Ilango Alikkar","A Tamil poet and scholar who is believed to have lived in the 2nd century CE.");
		book1.displayInfo();
		System.out.println();
		book2.displayInfo();
	}
}