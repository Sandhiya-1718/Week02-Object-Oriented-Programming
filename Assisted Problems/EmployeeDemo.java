class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Name       :"+name);
		System.out.println("ID                  :"+id);
		System.out.println("Salary              :"+salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize)
	{
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Team size           :"+teamSize);
	}
}
class Developer extends Employee{
	String progLang;
	Developer(String name,int id,double salary,String progLang)
	{
		super(name,id,salary);
		this.progLang=progLang;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language:"+progLang);
	}
}
class Intern extends Employee{
	int duration;
	Intern(String name,int id,double salary,int duration)
	{
		super(name,id,salary);
		this.duration=duration;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Internship Duration :"+duration+"months");
	}
}
public class EmployeeDemo{
	public static void main(String[] args)
	{
		Manager manager=new Manager("Ram",12,100000.00,5);
		Developer developer=new Developer("Sam",56,80000.50,"Java");
		Intern intern=new Intern("Rim",102,20000.51,6);
		manager.displayDetails();
		System.out.println();
		developer.displayDetails();
		System.out.println();
		intern.displayDetails();
	}
}
		class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Name       :"+name);
		System.out.println("ID                  :"+id);
		System.out.println("Salary              :"+salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize)
	{
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Team size           :"+teamSize);
	}
}
class Developer extends Employee{
	String progLang;
	Developer(String name,int id,double salary,String progLang)
	{
		super(name,id,salary);
		this.progLang=progLang;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language:"+progLang);
	}
}
class Intern extends Employee{
	int duration;
	Intern(String name,int id,double salary,int duration)
	{
		super(name,id,salary);
		this.duration=duration;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Internship Duration :"+duration+"months");
	}
}
public class EmployeeDemo{
	public static void main(String[] args)
	{
		Manager manager=new Manager("Ram",12,100000.00,5);
		Developer developer=new Developer("Sam",56,80000.50,"Java");
		Intern intern=new Intern("Rim",102,20000.51,6);
		manager.displayDetails();
		System.out.println();
		developer.displayDetails();
		System.out.println();
		intern.displayDetails();
	}
}
		class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Name       :"+name);
		System.out.println("ID                  :"+id);
		System.out.println("Salary              :"+salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize)
	{
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Team size           :"+teamSize);
	}
}
class Developer extends Employee{
	String progLang;
	Developer(String name,int id,double salary,String progLang)
	{
		super(name,id,salary);
		this.progLang=progLang;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language:"+progLang);
	}
}
class Intern extends Employee{
	int duration;
	Intern(String name,int id,double salary,int duration)
	{
		super(name,id,salary);
		this.duration=duration;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Internship Duration :"+duration+"months");
	}
}
public class EmployeeDemo{
	public static void main(String[] args)
	{
		Manager manager=new Manager("Ram",12,100000.00,5);
		Developer developer=new Developer("Sam",56,80000.50,"Java");
		Intern intern=new Intern("Rim",102,20000.51,6);
		manager.displayDetails();
		System.out.println();
		developer.displayDetails();
		System.out.println();
		intern.displayDetails();
	}
}
		class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Name       :"+name);
		System.out.println("ID                  :"+id);
		System.out.println("Salary              :"+salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize)
	{
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Team size           :"+teamSize);
	}
}
class Developer extends Employee{
	String progLang;
	Developer(String name,int id,double salary,String progLang)
	{
		super(name,id,salary);
		this.progLang=progLang;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language:"+progLang);
	}
}
class Intern extends Employee{
	int duration;
	Intern(String name,int id,double salary,int duration)
	{
		super(name,id,salary);
		this.duration=duration;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Internship Duration :"+duration+"months");
	}
}
public class EmployeeDemo{
	public static void main(String[] args)
	{
		Manager manager=new Manager("Ram",12,100000.00,5);
		Developer developer=new Developer("Sam",56,80000.50,"Java");
		Intern intern=new Intern("Rim",102,20000.51,6);
		manager.displayDetails();
		System.out.println();
		developer.displayDetails();
		System.out.println();
		intern.displayDetails();
	}
}
		