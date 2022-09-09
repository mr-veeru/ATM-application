package pkgbase;

import java.util.Scanner;
import pkgint.IAccount;

public class Account implements IAccount 
{
	protected int accNumber;
	protected int pin;
	protected String accountHolderName;
	protected long accountBalance;
	protected String rateOfInterest;
	protected int PAN_number;
    
    Scanner sc=new Scanner(System.in);
    
    public void showAccountDetails()
    {
    	System.out.println("Account Number :"+accNumber);
    	System.out.println("pin :"+ pin);
    	System.out.println("Account Holder name :"+accountHolderName);    
    	System.out.println("Account balance :"+accountBalance);
    	System.out.println("Rate of interest="+rateOfInterest);
    }
    
    public void depositAmount(int accNumber, int pin) 
    {
    	if(accNumber==this.accNumber && pin==this.pin)
    	{
    		System.out.println("Enter the amount to be deposited");
    		int amount=sc.nextInt();
    		accountBalance+=amount;
    		System.out.println("Updated Balance in your account is "+accountBalance);
    	}
    }
    
    public void balanceEnquiry(int accNumber, int pin) 
    {
        if(accNumber==this.accNumber && pin==this.pin)
        {
        	System.out.println("Balance in account "+accountBalance);
        }
    }

    public void withdrawAmount(int accNumber, int pin) 
    {
        if(accNumber==this.accNumber && pin==this.pin)
        {
            System.out.println("Enter the amount to be withdraw ");    
            int amount=sc.nextInt();
            if(amount<=accountBalance)
            {
                accountBalance=accountBalance-amount; 
                System.out.println("Updated Balance in your account is "+accountBalance);
            }
            else
            {
                System.out.println("Not enough balance, your balance is "+accountBalance);
            }
        }
    }
}
