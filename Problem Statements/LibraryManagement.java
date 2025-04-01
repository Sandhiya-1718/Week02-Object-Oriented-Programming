abstract class LibraryItem{
	private int itemId;
	private String title;
	private String author;
	public LibraryItem(int itemId,String title,String author)
	{
		this.itemId=itemId;
		this.title=title;
		this.author=author;
	}
	public int getItemId()
	{
		return itemId;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getItemDetails()
	{
		return "ID:"+itemId+", Title:"+title+", Author:"+author;
	}
	public abstract int getLoanDuration();
}
interface Reservable{
	boolean reserveItem(String name);
	boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
	private boolean reserved;
	public Book(int itemId,String title,String author)
	{
		super(itemId,title,author);
		this.reserved=false;
	}
	@Override
	public int getLoanDuration()
	{
		return 14;
	}
	@Override
	public boolean reserveItem(String name)
	{
		if(!reserved)
		{
			reserved=true;
			System.out.println("Book reserved by "+name);
			return true;
		}
		return false;
	}
	@Override
	public boolean checkAvailability()
	{
		return !reserved;
	}
}
class Magazine extends LibraryItem implements Reservable{
	private boolean reserved;
	public Magazine(int itemId,String title,String author)
	{
		super(itemId,title,author);
		this.reserved=false;
	}
	@Override
	public int getLoanDuration()
	{
		return 7;
	}
	@Override
	public boolean reserveItem(String name)
	{
		if(!reserved)
		{
			reserved=true;
			System.out.println("Magazine reserved by "+name);
			return true;
		}
		return false;
	}
	@Override
	public boolean checkAvailability()
	{
		return !reserved;
	}
}
class Dvd extends LibraryItem implements Reservable{
	private boolean reserved;
	public Dvd(int itemId,String title,String author)
	{
		super(itemId,title,author);
		this.reserved=false;
	}
	@Override
	public int getLoanDuration()
	{
		return 3;
	}
	@Override
	public boolean reserveItem(String name)
	{
		if(!reserved)
		{
			reserved=true;
			System.out.println("DVD reserved by "+name);
			return true;
		}
		return false;
	}
	@Override
	public boolean checkAvailability()
	{
		return !reserved;
	}
}
public class LibraryManagement{
	public static void main(String[] args)
	{
		LibraryItem items[]={
			new Book(1,"The Alchemist","Paulo Coelho"),
			new Magazine(2,"National Geographic","Various"),
			new Dvd(3,"Inception","Christopher Nolan")
		};
		for(int i=0;i<items.length;i++)
		{
			String details=items[i].getItemDetails();
			int duration=items[i].getLoanDuration();
			System.out.println("Details      :"+details);
			System.out.println("Loan Duration:"+duration+"days");
			if(items[i] instanceof Reservable)
			{
				Reservable r=(Reservable) items[i];
				boolean availableBefore=r.checkAvailability();
				boolean reservedStatus=r.reserveItem("User");
				boolean availableAfter=r.checkAvailability();
				System.out.println("Available    :"+availableBefore);
				System.out.println("Reserved     :"+reservedStatus);
				System.out.println("Available now:"+availableAfter);
			}
			System.out.println();
		}
	}
}