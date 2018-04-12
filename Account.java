/**
 * 
 * This class handles all the account info.
 * 
 * Rich Thomson 
 * 
 */
public class Account 
{

    private double balance = 100;
    private String pinNum;
    

    public Account(String pin) 
    {
        pinNum = pin;
    }

    public Account(double bal, String pin) 
    {
        if (bal >= 100) 
        {
            balance = bal;
        } 
        else 
        {
            balance = 100;
        }
        pinNum = pin;
    }
    

    public void deposit(double a) 
    {
        if (a > 0) 
        {
            balance = balance + a;
            System.out.println(a + " was successfully deposited in your account."
                    + " The new balance of your account is " + balance);
        } 
        else 
        {
            System.out.println("Please ensure the amount to be deposited is not negative.");
        }
    }
    

    public void withdraw(double a) 
    {
        if (a >= 0) 
        {
            
            double tempBalance = balance;
            
            tempBalance = tempBalance - a;
            if (tempBalance >= 100) 
            {
                balance = balance - a;
                System.out.println("You withdrew " + a + " from your account. Your new balance is " + balance);
            } 
            else 
            {

                System.out.println("Insufficient balance to remove " + a);
            }
                
            } 
            
         
        else 
        {
            System.out.println("Please ensure the amount to be withdrawn is a valid positive number");
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    public String getpinNum() 
    {
        return pinNum;
    }

}