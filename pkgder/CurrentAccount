package pkgder;
import java.util.Scanner;
import pkgbase.Account;
public class CurrentAccount extends Account
{
	static int accnumGen=50000;
	public CurrentAccount()
	{
		rateOfInterest=0.0;
	}
	
	public void createAccount()
	{
		Scanner sc= new Scanner(System.in);
		accNumber=accnumGen++;
		System.out.println("Enter the Account holder name");
		accountHolderName=sc.nextLine();
		showAccountDetails();
	}
}
