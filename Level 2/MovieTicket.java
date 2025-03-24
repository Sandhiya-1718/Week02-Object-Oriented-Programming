import java.util.Scanner;
public class MovieTicket{
	private String movieName;
	private int seatNumber;
	private double price;
	MovieTicket(String movie,int seat,double price)
	{
		this.movieName=movie;
		this.seatNumber=seat;
		this.price=price;
		System.out.println("Ticket successfully booked!");
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.println("------Ticket Details------");
		System.out.println("Movie Name :"+movieName);
		System.out.println("Seat Number:"+seatNumber);
		System.out.println("Price      :Rs."+price);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter movie name:");
		String movie=scanner.nextLine();
		System.out.print("Enter seat number:");
		int seat=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter price:Rs.");
		double price=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		MovieTicket ticket=new MovieTicket(movie,seat,price);
		ticket.displayDetails();
	}
}