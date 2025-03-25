class Employee{
	public int employeeID;
	protected String department;
	private double salary;
	public Employee(int employeeID,String department,double salary)
	{
		this.employeeID=employeeID;
		this.department=department;
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee ID:"+employeeID);
		System.out.println("Department :"+department);
		System.out.println("Salary     :Rs."+salary);
	}
	static class Manager extends Employee{
		Manager(int employeeID,String department,double salary)
		{
			super(employeeID,department,salary);
		}
		public void displayEmployeeInfo()
		{
			System.out.println("Employee ID:"+employeeID);
			System.out.println("Department :"+department);
		}
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(123,"IT",25000.00);
		e1.displayDetails();
		e1.setSalary(50000.00);
		System.out.println("\nUpdated salary:Rs."+e1.getSalary());
		System.out.println("\n---Employee Details---");
		Manager m=new Manager(234,"HR",70000);
		m.displayEmployeeInfo();
	}
}
