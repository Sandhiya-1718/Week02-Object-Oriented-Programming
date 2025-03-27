import java.util.ArrayList;
class Patient{
	String name;
	int age;
	ArrayList<Doctor> consultedDoctors;
	Patient(String name,int age)
	{
		this.name=name;
		this.age=age;
		consultedDoctors=new ArrayList<>();
	}
	public void addDoctors(Doctor doctor)
	{
		consultedDoctors.add(doctor);
	}
	public void veiwConsultedDoctors()
	{
		System.out.println("Patient:"+name+" has consulted:");
		for(int i=0;i<consultedDoctors.size();i++)
			System.out.println("Dr. "+consultedDoctors.get(i).name);
	}
}
class Doctor{
	String name;
	String specialization;
	ArrayList<Patient> patients;
	Doctor(String name,String specialization)
	{
		this.name=name;
		this.specialization=specialization;
		patients=new ArrayList<>();
	}
	public void consult(Patient p)
	{
		patients.add(p);
		p.addDoctors(this);
		System.out.println("Dr. "+name+" is consulting"+p.name);
	}
	public void viewPatient()
	{
		System.out.println("Dr. "+name+" has the following patients:");
		for(int i=0;i<patients.size();i++)
			System.out.println((i+1)+". "+patients.get(i).name);
	}
}
public class Hospital{
	public static void main(String[] args)
	{
		Doctor d1=new Doctor("Sweetha","Cardiologist");
		Doctor d2=new Doctor("Bharath","Neurologist");
		Patient p1=new Patient("Aryan",30);
		Patient p2=new Patient("Priya",12);
		d1.consult(p1);
		d1.consult(p2);
		d2.consult(p1);
		System.out.println();
		d1.viewPatient();
		d2.viewPatient();
		System.out.println();
		p1.veiwConsultedDoctors();
		p2.veiwConsultedDoctors();
	}
}