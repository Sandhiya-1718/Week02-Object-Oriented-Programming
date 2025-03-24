import java.util.Scanner;
public class Student{
	private String name;
	private int rollNumber;
	private double marks;
	Student(String sname,int srollno,double smarks)
	{
		this.name=sname;
		this.rollNumber=srollno;
		this.marks=smarks;
	}
	public char getGrade()
	{
		if(marks>=90)
			return 'A';
		else if(marks>=80)
			return 'B';
		else if(marks>=70)
			return 'C';
		else if(marks>=60)
			return 'D';
		else if(marks>=50)
			return 'E';
		else
			return 'F';
	}
	public void displayDetails()
	{
		System.out.println("-------Student Details-------");
		System.out.println("Student Name:"+name);
		System.out.println("Roll Number :"+rollNumber);
		System.out.println("Marks       :"+marks);
		System.out.println("Grade       :"+getGrade());
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter student name:");
		String name=scanner.nextLine();
		System.out.print("Enter roll number:");
		int rollNumber=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter marks:");
		double marks=scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
		Student student=new Student(name,rollNumber,marks);
		student.displayDetails();
	}
}