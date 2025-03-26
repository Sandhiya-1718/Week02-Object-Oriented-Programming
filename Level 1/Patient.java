public class Patient{
	static String hospitalName="Global Hospital";
	private final int patientId;
	private String name;
	private int age;
	private String ailment;
	private static int totalPatients=0;
	public Patient(int patientId,String name,int age,String ailment)
	{
		this.patientId=patientId;
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		totalPatients++;
	}
	public static void getTotalPatients()
	{
		System.out.println("Total Patients:"+totalPatients);
	}
	public void displayPatientDetails()
	{
		if(this instanceof Patient)
		{
			System.out.println("----------Patient Details----------");
			System.out.println("Hospital Name:"+hospitalName);
			System.out.println("Patient ID   :"+patientId);
			System.out.println("Patient Name :"+name);
			System.out.println("Patient Age  :"+age);
			System.out.println("Ailment      :"+ailment);
		}
		else
			System.out.println("Not a valid Patient object.");
	}
	public static void main(String[] args)
	{
		Patient p1=new Patient(12,"Sam",25,"Fever");
		Patient p2=new Patient(25,"James",14,"Cold");
		p1.displayPatientDetails();
		System.out.println();
		p2.displayPatientDetails();
		System.out.println();
		Patient.getTotalPatients();
	}
}
