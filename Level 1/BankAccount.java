public class BankAccount{
	static String bankName="Indian Bank";
	private static int totalAccounts=0;
	private final int accountNumber;
	private String accountHolderName;
	public BankAccount(int accountNumber,String accountHolderName)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		totalAccounts++;
	}
	public static void getTotalAccounts()
	{
		System.out.println("Total Accounts Created:"+totalAccounts);
	}
	public void displayAccountDetails()
	{
		if(this instanceof BankAccount)
		{
			System.out.println("----------Account Details----------");
			System.out.println("Bank Name          :"+bankName);
			System.out.println("Account Number     :"+accountNumber);
			System.out.println("Account Holder Name:"+accountHolderName);
		}
		else
			System.out.println("Not a valid BankAccount object.");
	}
	public static void main(String[] args)
	{
		BankAccount acc1=new BankAccount(62221,"Sweety");
		BankAccount acc2=new BankAccount(16297,"Riya");
		acc1.displayAccountDetails();
		System.out.println();
		acc2.displayAccountDetails();
		System.out.println();
		BankAccount.getTotalAccounts();
	}
}
