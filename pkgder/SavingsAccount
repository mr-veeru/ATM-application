package pkgder;

import java.util.Scanner;
import pkgbase.Account;
public class SavingsAccount extends Account 
{
    static int accnumGen=10000;
    public SavingsAccount()
    {
        rateOfInterest=5.5;
    }
    
	public void createAccount()
    {
        Scanner sc= new Scanner(System.in);
        accNumber = accnumGen++;
        System.out.println("Enter the Account holder name");
        accountHolderName=sc.nextLine();
        showAccountDetails();
    }
}
