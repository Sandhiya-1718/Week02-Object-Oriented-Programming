import java.util.ArrayList;
class Customer{
	String name;
	int accountNumber;
	double balance;
	Bank bank;
	Customer(String name)
	{
		this.name=name;
		this.balance=0.0;
	}
	public void setAccount(int accountNumber,Bank bank)
	{
		this.accountNumber=accountNumber;
		this.bank=bank;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void viewBalance()
	{
		System.out.println("Customer      :"+name);
		System.out.println("Bank          :"+bank.name);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance       :"+balance);
	}
}
public class Bank{
	String name;
	ArrayList<Customer> customers;
	Bank(String name)
	{
		this.name=name;
		customers=new ArrayList<>();
	}
	public void openAccount(Customer customer,int accountNumber)
	{
		customer.setAccount(accountNumber,this);
		customers.add(customer);
		System.out.println("Account opened for "+customer.name+" in "+name+" (Account No: "+accountNumber+" )");
	}
	public static void main(String[] args)
	{
		Bank sbi=new Bank("SBI");
		Bank icici=new Bank ("ICICI");
		Customer c1=new Customer("Sweety");
		Customer c2=new Customer("Rahul");
		sbi.openAccount(c1,10010);
		icici.openAccount(c2,20010);
		c1.deposit(2500);
		c1.viewBalance();
		c2.deposit(50000);
		c2.viewBalance();
	}
}