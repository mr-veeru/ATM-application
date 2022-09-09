package pkgint;

public interface IAccount 
{	
   public void depositAmount(int accNumber, int pin);
   public void balanceEnquiry(int accNumber, int pin);
   public void withdrawAmount(int accNumber, int pin);	   
}
