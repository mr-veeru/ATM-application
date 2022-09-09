package pkgder;

import java.util.Scanner;
import pkgbase.Account;
public class SavingsAccount extends Account 
{
    static int accnumGen=25678;
    static int pinGen=1234; 
    
    public SavingsAccount()
    {
        rateOfInterest="4%";
    }
    
	public void createAccount()
    {
        Scanner sc= new Scanner(System.in);
        accNumber = accnumGen++;
        pin = pinGen++;
        System.out.println("Enter the Account holder name");
        accountHolderName=sc.nextLine();
        showAccountDetails();
    }
}
