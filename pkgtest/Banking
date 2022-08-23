package pkgtest;

import java.util.Scanner;

import pkgder.CurrentAccount;
import pkgder.SavingsAccount;

public class Banking
{
	public static int saCount=0;
    public static int caCount=0;
    
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		
		SavingsAccount savingsAccount[]=new SavingsAccount[10];
		CurrentAccount currentAccount[]=new CurrentAccount[10];
		
		boolean contBanking=true;
		while(contBanking) 
		{
			System.out.println("Enter the banking operation you want to perform\n 1.Account Creation\n 2.Account Operation");
			int ch1=sc.nextInt();
			switch(ch1) 
			{
				case 1: System.out.println("Create Account\n 1.Savings Account\n 2.Current Account");
    				int choice=sc.nextInt();
    				switch(choice)
    				{
    					case 1:savingsAccount[saCount]=new SavingsAccount();
    						savingsAccount[saCount].createAccount();
    						saCount++;
    						break;
    					case 2:currentAccount[caCount]=new CurrentAccount();
	    					currentAccount[caCount].createAccount();
	    					caCount++;
	    					break;
    				}
    				break;
				case 2:
    				System.out.println("1.Savings Acc Deposit \n2.Savings Acc Withdraw \n3.Savings Account Balance Enquiry \n4.Current Account Deposit \n5.Current Account Withdraw \n6.Current Acc BalnceEnquiry");
    				System.out.println("Enter your choice of Banking operation");
    				int ch=sc.nextInt();
    				
    				System.out.println("Enter the accountNumber to operate");
    				int account=sc.nextInt();
    				switch(ch)
    				{
    					case 1: 
    						for(int i=0;i<saCount;i++)
    							savingsAccount[i].depositAmount(account);
    						break;
    					case 2: 
    						for(int i=0;i<saCount;i++)
    							savingsAccount[i].withdrawAmount(account);
    						break;
    					case 3:
    						for(int i=0;i<saCount;i++) 
    							savingsAccount[i].balanceEnquiry(account);
    						break;
    					case 4:
    						System.out.println("Number of CA"+caCount);
    						for(int i=0;i<caCount;i++) 
    							currentAccount[i].depositAmount(account);
    						break;
    					case 5:
    						for(int i=0;i<caCount;i++) 
    							currentAccount[i].withdrawAmount(account);
    						break;
    					case 6:
    						for(int i=0;i<caCount;i++) 
    							currentAccount[i].balanceEnquiry(account);
    						break;
    				}
			}	
			System.out.println("Would you like to continue ?? Input 1 to continue... Any other to exit");
			int num = sc.nextInt();
			if(num!=1)
				contBanking = false;
		}
    }
}
