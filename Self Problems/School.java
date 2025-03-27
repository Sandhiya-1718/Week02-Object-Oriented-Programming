import java.util.ArrayList;
class Course{
	String courseName;
	ArrayList<Student> students;
	Course(String courseName)
	{
		this.courseName=courseName;
		students=new ArrayList<>();
	}
	public void enrollStudent(Student student)
	{
		students.add(student);
	}
	public void displayStudents()
	{
		System.out.println("Course:"+courseName);
		for(int i=0;i<students.size();i++)
			System.out.println((i+1)+". "+students.get(i).name);
	}
}
class Student{
	String name;
	int roll;
	ArrayList<Course> courses;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
		courses=new ArrayList<>();
	}
	public void enrollCourse(Course course)
	{
		courses.add(course);
		course.enrollStudent(this);
	}
	public void viewCourse()
	{
		System.out.println("Student:"+name+"(Roll: "+roll+")");
		for(int i=0;i<courses.size();i++)
			System.out.println((i+1)+". "+courses.get(i).courseName);
	}
}
public class School{
	String name;
	ArrayList<Student> students;
	School(String name)
	{
		this.name=name;
		students=new ArrayList<>();
	}
	public void addStudents(Student student)
	{
		students.add(student);
	}
	public void displayStudents()
	{
		System.out.println("School:"+name);
		for(int i=0;i<students.size();i++)
			System.out.println((i+1)+". "+students.get(i).name);
	}
	public static void main(String[] args)
	{
		School school=new School("National School");
		Student s1=new Student("Sweety",101);
		Student s2=new Student("Bharath",102);
		school.addStudents(s1);
		school.addStudents(s2);
		Course c1=new Course("Maths");
		Course c2=new Course("Science");
		Course c3=new Course("Social");
		s1.enrollCourse(c1);
		s1.enrollCourse(c2);
		s2.enrollCourse(c1);
		s2.enrollCourse(c3);
		school.displayStudents();
		System.out.println();
		s1.viewCourse();
		s2.viewCourse();
		System.out.println();
		c1.displayStudents();
		c2.displayStudents();
		c3.displayStudents();
	}
}