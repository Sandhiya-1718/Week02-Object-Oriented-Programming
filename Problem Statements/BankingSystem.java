abstract class BankAccount{
	private String accountNumber;
	private String holderName;
	private double balance;
	public BankAccount(String accountNumber,String holderName,double balance)
	{
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getHolderName()
	{
		return holderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited:"+amount);
		}
	}
	public void withdraw(double amount)
	{
		if(amount<=balance&&amount>0)
		{
			balance-=amount;
			System.out.println("Withdraw:"+amount);
		}
		else
			System.out.println("Insufficient balance");
	}
	public abstract double calculateInterest();
}
interface Loanable{
	String applyForLoan(double amount);
	boolean calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
	private static final double interestRate=0.04;
	public SavingsAccount(String accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	@Override
	public double calculateInterest()
	{
		return getBalance()*interestRate;
	}
	@Override
	public String applyForLoan(double amount)
	{
		return "Loan applied for (Savings):"+amount;
	}
	@Override
	public boolean calculateLoanEligibility()
	{
		return getBalance()>5000;
	}
}
class CurrentAccount extends BankAccount implements Loanable{
	private static final double interestRate=0.01;
	public CurrentAccount(String accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	@Override
	public double calculateInterest()
	{
		return getBalance()*interestRate;
	}
	@Override
	public String applyForLoan(double amount)
	{
		return "Loan applied for (Current):"+amount;
	}
	@Override
	public boolean calculateLoanEligibility()
	{
		return getBalance()>10000;
	}
}
public class BankingSystem{
	public static void main(String[] args)
	{
		BankAccount[] accounts=new BankAccount[2];
		accounts[0]=new SavingsAccount("A101","Ravi",50000);
		accounts[1]=new CurrentAccount("A102","Sam",75000);
		for(int i=0;i<accounts.length;i++)
		{
			System.out.println("Name         :"+accounts[i].getHolderName());
			System.out.println("Interest     :"+accounts[i].calculateInterest());
			Loanable loan=(Loanable)accounts[i];
			System.out.println("Loan Eligible:"+loan.calculateLoanEligibility());
			System.out.println("Loan Result  :"+loan.applyForLoan(40000));
			System.out.println();
		}
	}
}