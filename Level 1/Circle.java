import java.util.Scanner;
public class Circle{
	private double radius;
	Circle(double r)
	{
		this.radius=r;
	}
	public void displayDetails()
	{
		System.out.println("Area of circle:"+Math.PI*radius*radius);
		System.out.println("Circumference of circle:"+2*Math.PI*radius);
	}
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		double r=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		Circle circle=new Circle(r);
		circle.displayDetails();
	}
}
		