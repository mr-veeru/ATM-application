package pkgder;

import java.util.Scanner;
import pkgbase.Account;

public class CurrentAccount extends Account
{
	static int accnumGen=65729;
	static int pinGen=4321;
	
	public CurrentAccount()
	{
		rateOfInterest="0%";
	}
	
	public void createAccount()
	{
		Scanner sc= new Scanner(System.in);
		accNumber=accnumGen++;
		pin = pinGen++;
		System.out.println("Enter the Account holder name");
		accountHolderName=sc.nextLine();
		System.out.println("Enter Your PAN card number");
		PAN_number=sc.nextInt();
		showAccountDetails();
	}
}
