import java.util.Scanner;
public class Circle{
	double radius;
	Circle()
	{
		radius=1.0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public void displayDetails()
	{
		System.out.println("Radius :"+radius);
		System.out.println("Area   :"+Math.PI*radius*radius);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Circle circle1=new Circle();
		circle1.displayDetails();
		System.out.print("Enter radius:");
		double radius=scanner.nextDouble();
		scanner.nextLine();
		Circle circle2=new Circle(radius);
		circle2.displayDetails();
	}
}
		