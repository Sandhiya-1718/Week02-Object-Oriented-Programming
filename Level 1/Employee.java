import java.util.Scanner;
public class Employee{
	private String name;
	private int id;
	private int salary;
	Employee(String ename,int eid,int esalary)
	{
		this.name=ename;
		this.id=eid;
		this.salary=esalary;
	}
	public void displayDetails()
	{
		System.out.println("---------Employee Details------------");
		System.out.println("Name   :"+name);
		System.out.println("Id     :"+id);
		System.out.println("Salary :Rs."+salary);
	}
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter employee name:");
		String name=scanner.nextLine();
		System.out.print("Enter employee id:");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter employee salary:Rs.");
		int salary=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		Employee employee=new Employee(name,id,salary);
		employee.displayDetails();
	}
}
		