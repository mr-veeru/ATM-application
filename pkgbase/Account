package pkgbase;

import java.util.Scanner;
import pkgint.IAccount;

public class Account implements IAccount 
{
	protected int accNumber;
    protected String accountHolderName;
    protected long accountBalance;
    protected double rateOfInterest;
    
    Scanner sc=new Scanner(System.in);
    
    public void showAccountDetails()
    {
    	System.out.println("Account Number :"+accNumber);
    	System.out.println("Account Holder name :"+accountHolderName);    
    	System.out.println("Account balance :"+accountBalance);
    	System.out.println("Rate of interest="+rateOfInterest);
    }
    
    public void depositAmount(int accNumber) 
    {
    	if(accNumber==this.accNumber)
    	{
    		System.out.println("Enter the amount to be deposited");
    		int amount=sc.nextInt();
    		accountBalance+=amount;
    	}
    }
    
    public void balanceEnquiry(int accNumber) 
    {
        if(accNumber==this.accNumber)
        {
        	System.out.println("Balance in account "+accountBalance);
        }
    }

    public void withdrawAmount(int accNumber) 
    {
        if(accNumber==this.accNumber)
        {
            System.out.print("Enter the amount to be withdraw ");    
            int amount=sc.nextInt();
            if(amount<=accountBalance)
            {
                accountBalance=accountBalance-amount;
                System.out.println("Balance in account "+accountBalance);    
            }
            else
            {
                System.out.println("Not enough balance, your balance is "+accountBalance);
            }
        }
    }
}
