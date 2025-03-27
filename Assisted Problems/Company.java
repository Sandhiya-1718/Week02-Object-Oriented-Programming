import java.util.ArrayList;
class Employee{
	String name;
	int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void display()
	{
		System.out.println("Employee ID:"+id+", Name:"+name);
	}
}
class Department{
	String name;
	ArrayList<Employee> employees;
	Department(String name)
	{
		this.name=name;
		employees=new ArrayList<>();
	}
	public void addEmployees(String name,int id)
	{
		Employee e=new Employee(name,id);
		employees.add(e);
	}
	public void display()
	{	
		System.out.println();
		System.out.println("Department:"+name);
		for(int i=0;i<employees.size();i++)
			employees.get(i).display();
	}
}
public class Company
{
	String name;
	ArrayList<Department> departments;
	Company(String name)
	{
		this.name=name;
		departments=new ArrayList<>();
	}
	public void addDepartment(String deptName)
	{
		Department d=new Department(deptName);
		departments.add(d);
	}
	Department getDepartment(String deptName)
	{
		for(int i=0;i<departments.size();i++)
		{
			if(departments.get(i).name.equals(deptName))
				return departments.get(i);
		}
		return null;
	}
	public void display()
	{
		System.out.println("Company:"+name);
		for(int i=0;i<departments.size();i++)
			departments.get(i).display();
	}
	public static void main(String[] args)
	{
		Company company=new Company("TechWorld");
		company.addDepartment("IT");
		company.addDepartment("HR");
		Department it=company.getDepartment("IT");
		Department hr=company.getDepartment("HR");
		it.addEmployees("Sweety",1);
		it.addEmployees("Bharath",2);
		hr.addEmployees("Ravi",3);
		company.display();
	}
}