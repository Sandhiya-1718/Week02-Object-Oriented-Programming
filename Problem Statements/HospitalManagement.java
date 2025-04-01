abstract class Patient{
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId,String name,int age)
	{
		this.patientId=patientId;
		this.name=name;
		this.age=age;
	}
	public String getPatientDetails()
	{
		return "Patient ID:"+patientId+", Name:"+name+", Age:"+age;
	}
	public abstract double calculateBill();
}
interface MedicalRecord{
	void addRecord(String record);
	String []viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
	private int daysAdmitted;
	private double dailyRate;
	private String medicalHistory[]=new String[10];
	private int recordCount=0;
	public InPatient(int patientId,String name,int age,int daysAdmitted,double dailyRate)
	{
		super(patientId,name,age);
		this.daysAdmitted=daysAdmitted;
		this.dailyRate=dailyRate;
	}
	@Override
	public double calculateBill()
	{
		return daysAdmitted*dailyRate;
	}
	@Override
	public void addRecord(String record)
	{
		if(recordCount<medicalHistory.length)
			medicalHistory[recordCount++]=record;
		else
			System.out.println("Medical record storage full for InPatient.");
	}
	@Override
	public String[] viewRecords()
	{
		return medicalHistory;
	}
	public int getRecordCount()
	{
		return recordCount;
	}
}
class OutPatient extends Patient implements MedicalRecord{
	private double consultationFee;
	private String medicalHistory[]=new String[10];
	private int recordCount=0;
	public OutPatient(int patientId,String name,int age,double consultationFee)
	{
		super(patientId,name,age);
		this.consultationFee=consultationFee;
	}
	@Override
	public double calculateBill()
	{
		return consultationFee;
	}
	@Override
	public void addRecord(String record)
	{
		if(recordCount<medicalHistory.length)
			medicalHistory[recordCount++]=record;
		else
			System.out.println("Medical record storage full for InPatient.");
	}
	@Override
	public String[] viewRecords()
	{
		return medicalHistory;
	}
	public int getRecordCount()
	{
		return recordCount;
	}
}
public class HospitalManagement{
	public static void main(String[] args)
	{
		Patient patients[]={
			new InPatient(101,"Ravi",45,5,1500.0),
			new OutPatient(102,"Meena",30,500.0)
		};
		for(int i=0;i<patients.length;i++)
		{
			Patient p=patients[i];
			System.out.println(p.getPatientDetails());
			System.out.println("Bill Amount:Rs."+p.calculateBill());
			if(p instanceof MedicalRecord)
			{
				MedicalRecord record=(MedicalRecord) p;
				record.addRecord("Diagnosis   :Fever");
				record.addRecord("Prescription:Paracetomol");
				System.out.println("Medical Records:");
				String records[]=record.viewRecords();
				int count=0;
				if(p instanceof InPatient)
					count=((InPatient)p).getRecordCount();
				else if(p instanceof OutPatient)
					count=((OutPatient)p).getRecordCount();
				for(int j=0;j<count;j++)
					System.out.println("-"+records[j]);
			}
			System.out.println();
		}
	}
}