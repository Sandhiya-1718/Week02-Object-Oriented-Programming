public class Student{
	public int rollNumber;
	protected String name;
	private double CGPA;
	public Student(int rollNumber,String name,double CGPA)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.CGPA=CGPA;
	}
	public double getCGPA()
	{
		return CGPA;
	}
	public void setCGPA(double CGPA)
	{
		if(CGPA>=0.0&&CGPA<=10.0)
			this.CGPA=CGPA;
		else
			System.out.println("Invalid CGPA.Please enter a value between 0 and 10");
	}
	public void displayDetails()
	{
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Name       :"+name);
		System.out.println("CGPA       :"+CGPA);
	}
	static class PostGraduateStudent extends Student{
		PostGraduateStudent(int rollNumber,String name,double CGPA)
		{
			super(rollNumber,name,CGPA);
		}
		public void displayPgInfo()
		{
			System.out.println("Postgraduate Student Details:");
		}
	}
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Sweety",8.9);
		s1.displayDetails();
		s1.setCGPA(9.3);
		System.out.println("\nUpdated CGPA:"+s1.getCGPA());
		System.out.println("\n---Postgraduate Student---");
		PostGraduateStudent pg=new PostGraduateStudent(202,"Riya",9.5);
		pg.displayPgInfo();
		pg.displayDetails();
	}
}