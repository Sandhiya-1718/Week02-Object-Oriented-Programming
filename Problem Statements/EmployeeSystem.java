abstract class Employee {
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;
	public int getEmployeeId()
	{ 
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public abstract double calculateSalary();
	public void displayDetails()
	{
		System.out.println("Employee ID    :"+employeeId);
		System.out.println("Name           :"+name);
		System.out.println("Base Salary    :Rs."+baseSalary);
	}
}
interface Department{
	void assignDepartment(String departmentName);
	void getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department{
	@Override 
	public double calculateSalary()
	{
		return getBaseSalary();
	}
	@Override
	public void assignDepartment(String departmentName)
	{
		setDepartment(departmentName);
	}
	@Override
	public void getDepartmentDetails()
	{
		System.out.println("Department     :"+getDepartment());
	}
}
class PartTimeEmployee extends Employee implements Department{
	private int hoursWorked;
	private double hourlyRate;
	public void setHoursWorked(int hoursWorked)
	{
		this.hoursWorked=hoursWorked;
	}
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate=hourlyRate;
	}
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	@Override
	public double calculateSalary()
	{
		return hoursWorked*hourlyRate;
	}
	@Override 
	public void assignDepartment(String departmentName)
	{
		setDepartment(departmentName);
	}
	public void getDepartmentDetails()
	{
		System.out.println("Department     :"+getDepartment());
	}
}
public class EmployeeSystem{
	public static void main(String[] args)
	{
		Employee employees[]=new Employee[2];
		FullTimeEmployee full=new FullTimeEmployee();
		full.setEmployeeId(1);
		full.setName("Kili");
		full.setBaseSalary(15000);
		full.assignDepartment("Development");
		PartTimeEmployee part=new PartTimeEmployee();
		part.setEmployeeId(2);
		part.setName("Gala");
		part.setBaseSalary(0);
		part.setHoursWorked(78);
		part.setHourlyRate(20.5);
		part.assignDepartment("Support");
		employees[0]=full;
		employees[1]=part;
		for(int i=0;i<employees.length;i++)
		{
			Employee emp=employees[i];
			emp.displayDetails();
			System.out.println("Employee Salary:Rs."+emp.calculateSalary());
			Department dept=(Department) emp;
			dept.getDepartmentDetails();
			System.out.println();
		}
	}
}
