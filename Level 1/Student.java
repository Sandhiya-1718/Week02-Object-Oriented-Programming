public class Student{
	static String universityName="State University";
	private static int totalStudents=0;
	private final int rollNumber;
	private String name;
	private String grade;
	public Student(int rollNumber,String name,String grade)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.grade=grade;
		totalStudents++;
	}
	public static void displayTotalStudents()
	{
		System.out.println("Total Students:"+totalStudents);
	}
	public void displayDetails()
	{
		if(this instanceof Student)
		{
			System.out.println("----------Account Details----------");
			System.out.println("University Name    :"+universityName);
			System.out.println("Student Roll Number:"+rollNumber);
			System.out.println("Student Name       :"+name);
			System.out.println("Grade              :"+grade);
		}
		else
			System.out.println("Not a valid Student object.");
	}
	public void upgradeGrade(String newGrade)
	{
		if(this instanceof Student)
		{
			this.grade=newGrade;
			System.out.println("Grade updated for "+name);
		}
		else
			System.out.println("Operation not allowed.Not a student.");
	}
	public static void main(String[] args)
	{
		Student s1=new Student(1101,"Sweety","A");
		Student s2=new Student(1102,"Riya","C");
		s1.displayDetails();
		System.out.println();
		s2.displayDetails();
		System.out.println();
		s2.upgradeGrade("B");
		s2.displayDetails();
		System.out.println();
		Student.displayTotalStudents();
	}
}
