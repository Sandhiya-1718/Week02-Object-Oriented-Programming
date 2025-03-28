class Person{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayRole()
	{
		System.out.println("Name      :"+name);
		System.out.println("Age       :"+age);
	}
}
class Teacher extends Person{
	String subject;
	Teacher(String name,int age,String subject)
	{
		super(name,age);
		this.subject=subject;
	}
	@Override
	public void displayRole()
	{
		System.out.println("Role      :Teacher");
		super.displayRole();
		System.out.println("Subject   :"+subject);
	}
}
class Student extends Person{
	int grade;
	Student(String name,int age,int grade)
	{
		super(name,age);
		this.grade=grade;
	}
	@Override
	public void displayRole()
	{
		System.out.println("Role      :Student");
		super.displayRole();
		System.out.println("Grade     :"+grade);
	}
}
class Staff extends Person{
	String department;
	Staff(String name,int age,String department)
	{
		super(name,age);
		this.department=department;
	}
	@Override
	public void displayRole()
	{
		System.out.println("Role      :Staff");
		super.displayRole();
		System.out.println("Department:"+department);
	}
}
public class SchoolSystem{
	public static void main(String[] args)
	{
		Teacher teacher=new Teacher("Mrs.Akhil",40,"Mathematics");
		Student student=new Student("Bharath",16,10);
		Staff staff=new Staff("Mr.Rakesh",35,"Administration");
		System.out.println("----Teacher Info----");
		teacher.displayRole();
		System.out.println();
		System.out.println("----Student Info----");
		student.displayRole();
		System.out.println();
		System.out.println("----Staff Info----");
		staff.displayRole();
	}
}
