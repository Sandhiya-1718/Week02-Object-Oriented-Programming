class Bank{
	String accountNumber;
	double balance;
	Bank(String accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void displayAccountType()
	{
		System.out.println("Account Number  :"+accountNumber);
		System.out.println("Balance         :Rs."+balance);
	}
}
class SavingsAccount extends Bank{
	double interestRate;
	SavingsAccount(String accountNumber,double balance,double interestRate)
	{
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	@Override
	public void displayAccountType()
	{
		System.out.println("Account Type    :Savings Account");
		super.displayAccountType();
		System.out.println("Interest Rate   :"+interestRate+"%");
	}
}
class CheckingAccount extends Bank{
	double withdrawalLimit;
	CheckingAccount(String accountNumber,double balance,double withdrawalLimit)
	{
		super(accountNumber,balance);
		this.withdrawalLimit=withdrawalLimit;
	}
	@Override
	public void displayAccountType()
	{
		System.out.println("Account Type    :Checking Account");
		super.displayAccountType();
		System.out.println("Withdrawal Limit:Rs."+withdrawalLimit);
	}
}
class FixedDepositAccount extends Bank{
	int lockInPeriod;
	FixedDepositAccount(String accountNumber,double balance,int lockInPeriod)
	{
		super(accountNumber,balance);
		this.lockInPeriod=lockInPeriod;
	}
	@Override
	public void displayAccountType()
	{
		System.out.println("Account Type    :Fixed Deposit Account");
		super.displayAccountType();
		System.out.println("Lock-in Period  :"+lockInPeriod+" months");
	}
}
public class BankAccount{
	public static void main(String[] args)
	{
		SavingsAccount savings=new SavingsAccount("SA1001",5000.00,4.5);
		CheckingAccount checking=new CheckingAccount("CA1002",3000.00,1000);
		FixedDepositAccount fixed=new FixedDepositAccount("FDA1003",10000.00,12);
		savings.displayAccountType();
		System.out.println();
		checking.displayAccountType();
		System.out.println();
		fixed.displayAccountType();
	}
}