class BankAccount{
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	public BankAccount(int accountNumber,String accountHolder,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void displayDetails()
	{
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder:"+accountHolder);
		System.out.println("Balance       :Rs."+balance);
	}
	static class SavingsAccount extends BankAccount{
		SavingsAccount(int accountNumber,String accountHolder,double balance)
		{
			super(accountNumber,accountHolder,balance);
		}
		public void displaySavingsInfo()
		{
			System.out.println("Savings Account Number:"+accountNumber);
			System.out.println("Savings Account Holder:"+accountHolder);
		}
	}
	public static void main(String[] args)
	{
		BankAccount acc1=new BankAccount(101001,"Sweety",5000.00);
		acc1.displayDetails();
		acc1.setBalance(6500.00);
		System.out.println("\nUpdated Balance:Rs."+acc1.getBalance());
		System.out.println("\n---Savings Account Details---");
		SavingsAccount sa=new SavingsAccount(202002,"Riya",10000.50);
		sa.displaySavingsInfo();
		System.out.println("Balance via getter:Rs."+sa.getBalance());
	}
}
