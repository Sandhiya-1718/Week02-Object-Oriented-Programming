import java.util.Scanner;
public class PalindromeChecker{
	private String text;
	PalindromeChecker(String text)
	{
		this.text=text.toLowerCase();
	}
	public boolean isPalindrome()
	{
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)!=text.charAt(text.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}
	public void displayResults()
	{
		System.out.print(isPalindrome()?"Palindrome":"Not Palindrome");
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a text:");
		String text=scanner.nextLine();
		scanner.close();
		PalindromeChecker palindrome=new PalindromeChecker(text);
		palindrome.displayResults();
	}
}