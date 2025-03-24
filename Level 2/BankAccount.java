import java.util.Scanner;
public class BankAccount{
	private String accountHolder;
	private long accountNumber;
	private double balance;
	BankAccount(String holder,long number,double bal)
	{
		this.accountHolder=holder;
		this.accountNumber=number;
		this.balance=bal;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited:Rs."+amount);
		}
		else
			System.out.println("Invalid deposit amount");
	}	
	public void withdraw(double amount)
	{
		if(amount<=balance&&amount>0)
		{
			balance-=amount;
			System.out.println("Withdrawn:Rs."+amount);
		}
		else if(amount>balance)
			System.out.println("Insufficient balance!!");
		else
			System.out.println("Invalid withdrawal amount");
			
	}
	public void displayDetails()
	{
		System.out.println("------Account Details-------");
		System.out.println("Account Holder:"+accountHolder);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance       :Rs."+balance);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter account holder name:");
		String name=scanner.nextLine();
		System.out.print("Enter account number:");
		long number=scanner.nextLong();
		scanner.nextLine();
		System.out.print("Enter balance:Rs.");
		double balance=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("1.Deposit \n2.Withdraw \nChoose your option:");
		int choice=scanner.nextInt();
		scanner.nextLine();
		double amount;
		BankAccount bankaccount=new BankAccount(name,number,balance);
		switch(choice)
		{
		case 1:
			System.out.print("Enter amount to deposit:");
			amount=scanner.nextDouble();
			scanner.nextLine();
			bankaccount.deposit(amount);
			System.out.println();
			bankaccount.displayDetails();
			break;
		case 2:
			System.out.print("Enter amount to withdraw:");
			amount=scanner.nextDouble();
			scanner.nextLine();
			bankaccount.withdraw(amount);
			System.out.println();
			bankaccount.displayDetails();
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();
	}
}