import java.util.ArrayList;
class Faculty{
	String name;
	String subject;
	Faculty(String name,String subject)
	{
		this.name=name;
		this.subject=subject;
	}
	public void display()
	{
		System.out.println("Faculty Name:"+name+", Subject:"+subject);
	}
}
class Department{
	String deptName;
	Department(String deptName)
	{
		this.deptName=deptName;
	}
	public void display()
	{
		System.out.println("Department:"+deptName);
	}
}
public class University{
	String name;
	ArrayList<Department> departments;
	ArrayList<Faculty> faculties;
	University(String name)
	{
		this.name=name;
		departments=new ArrayList<>();
		faculties=new ArrayList<>();
	}
	public void addDepartment(String departName)
	{
		departments.add(new Department(departName));
	}
	public void addFaculty(Faculty faculty)
	{
		faculties.add(faculty);
	}
	public void display()
	{
		System.out.println("University:"+name);
		System.out.println("Departments:");
		for(int i=0;i<departments.size();i++)
			departments.get(i).display();
		System.out.println();
		System.out.println("Faculty Members:");
		for(int i=0;i<faculties.size();i++)
			faculties.get(i).display();
	}
	public static void main(String[] args)
	{
		Faculty f1=new Faculty("Riya","DSA");
		Faculty f2=new Faculty("Ram","AI");
		University u1=new University("Central Unversity");
		u1.addDepartment("Computer Science");
		u1.addDepartment("Mechanical Engineering");
		u1.addFaculty(f1);
		u1.addFaculty(f2);
		u1.display();
		u1=null;
		System.out.println("University deleted.");
		System.out.println("Faculty still exists:");
		f1.display();
		f2.display();
	}
}