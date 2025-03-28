class Course{
	String courseName;
	int duration;
	Course(String courseName,int duration)
	{
		this.courseName=courseName;
		this.duration=duration;
	}
	public void showDetails()
	{
		System.out.println("Course Name:"+courseName);
		System.out.println("Duration   :"+duration+" months");
	}
}
class OnlineCourse extends Course{
	String platform;
	boolean isRecorded;
	OnlineCourse(String courseName,int duration,String platform,boolean isRecorded)
	{
		super(courseName,duration);
		this.platform=platform;
		this.isRecorded=isRecorded;
	}
	@Override
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Platform   :"+platform);
		System.out.println("Is Recorded:"+(isRecorded?"Yes":"No"));
	}
}
class PaidOnlineCourse extends OnlineCourse{
	double fee;
	int discount;
	PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,int discount)
	{
		super(courseName,duration,platform,isRecorded);
		this.fee=fee;
		this.discount=discount;
	}
	public double calculatePrice()
	{
		return fee-(fee*discount/100);
	}
	@Override
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Course Fee :Rs."+fee);
		System.out.println("Discount   :"+discount+"%");
		System.out.println("Final Price:Rs."+calculatePrice());
	}
}
public class EducationalCourse{
	public static void main(String[] args)
	{
		PaidOnlineCourse course1=new PaidOnlineCourse("Full Stack",6,"Udemy",true,4999.99,20);
		PaidOnlineCourse course2=new PaidOnlineCourse("Data Science",8,"Coursera",false,5999.99,25);
		course1.showDetails();
		System.out.println();
		course2.showDetails();
	}
}