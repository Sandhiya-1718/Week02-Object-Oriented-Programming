public class Employee{
	static String companyName="XYZ Company";
	private final int id;
	private String name;
	private String designation;
	private static int totalEmployees=0;
	public Employee(int id,String name,String designation)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		totalEmployees++;
	}
	public static void displayTotalEmployees()
	{
		System.out.println("Total Employees:"+totalEmployees);
	}
	public void displayEmployeeDetails()
	{
		if(this instanceof Employee)
		{
			System.out.println("----------Employee Details----------");
			System.out.println("Company Name:"+companyName);
			System.out.println("ID          :"+id);
			System.out.println("Name        :"+name);
			System.out.println("Designation :"+designation);
		}
		else
			System.out.println("Not a valid Employee object.");
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(12,"Sam","IT");
		Employee e2=new Employee(25,"James","HR");
		e1.displayEmployeeDetails();
		System.out.println();
		e2.displayEmployeeDetails();
		System.out.println();
		Employee.displayTotalEmployees();
	}
}
