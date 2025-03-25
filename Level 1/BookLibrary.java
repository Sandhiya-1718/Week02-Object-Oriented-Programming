class BookLibrary{
	public String ISBN;
	protected String title;
	private String author;
	public BookLibrary(String ISBN,String title,String author)
	{
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void displayDetails()
	{
		System.out.println("ISBN   :"+ISBN);
		System.out.println("Title  :"+title);
		System.out.println("Author :"+author);
	}
	static class EBook extends Book{
		EBook(String ISBN,String title,String author)
		{
			super(ISBN,title,author);
		}
		public void displayEBookInfo()
		{
			System.out.println("EBook ISBN :"+ISBN);
			System.out.println("EBook Title:"+title);
		}
	}
	public static void main(String[] args)
	{
		BookLibrary b1=new BookLibrary("978-0134685991","Effective Java","Joshua Bloch");
		b1.displayDetails();
		b1.setAuthor("J.Bloch");
		System.out.println("\nUpdated Author:"+b1.getAuthor());
		System.out.println("\n---EBook Details---");
		EBook eb=new EBook("978-1491950357","Java-The Complete Reference","Herbert Schildt");
		eb.displayEBookInfo();
	}
}
