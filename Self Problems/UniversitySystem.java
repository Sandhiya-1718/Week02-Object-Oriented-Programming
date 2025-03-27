import java.util.ArrayList;
class Student{
	String name;
	ArrayList<Course> enrolledCourses;
	Student(String name)
	{
		this.name=name;
		enrolledCourses=new ArrayList<>();
	}
	public void enrollCourse(Course course)
	{
		enrolledCourses.add(course);
		course.addStudent(this);
		System.out.println(name+" enrolled in "+course.courseName);
	}
	public void viewCourses()
	{
		System.out.println("Courses enrolled by "+name+":");
		for(int i=0;i<enrolledCourses.size();i++)
			System.out.println((i+1)+". "+enrolledCourses.get(i).courseName);
	}
}
class Professor{
	String name;
	String department;
	Professor(String name,String department)
	{
		this.name=name;
		this.department=department;
	}
	public void display()
	{
		System.out.println("Professor:"+name+"("+department+")");
	}
}
class Course{
	String courseName;
	Professor professor;
	ArrayList<Student> student;
	Course(String courseName)
	{
		this.courseName=courseName;
		student=new ArrayList<>();
	}
	public void assignProfessor(Professor prof)
	{
		this.professor=prof;
		System.out.println("Professor "+prof.name+" assigned to "+courseName);
	}
	public void addStudent(Student s)
	{
		student.add(s);
	}
	public void viewDetails()
	{
		System.out.println("Courses:"+courseName);
		if(professor!=null)
		{
			System.out.println("Taught by:");
			professor.display();
		}
		else
			System.out.println("No professor assigned.");
		System.out.println("Enrolled Students:");
		for(int i=0;i<student.size();i++)
			System.out.println((i+1)+". "+student.get(i).name);
	}
}
public class UniversitySystem{
	public static void main(String[] args)
	{
		Professor prof1=new Professor("Dr. Sheela","Computer Science");
		Professor prof2=new Professor("Dr. Ravi","Mathematics");
		Course c1=new Course("Data Structures");
		Course c2=new Course("Calculus");
		c1.assignProfessor(prof1);
		c2.assignProfessor(prof2);
		Student s1=new Student("Aryan");
		Student s2=new Student("Riya");
		s1.enrollCourse(c1);
		s1.enrollCourse(c2);
		s2.enrollCourse(c2);
		System.out.println();
		c1.viewDetails();
		System.out.println();
		c2.viewDetails();
		System.out.println();
		s1.viewCourses();
		s2.viewCourses();
	}
}