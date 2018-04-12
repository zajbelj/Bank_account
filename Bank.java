
/**
 * This class holds the information pertaining
 * to the bank such as interest rate.
 * 
 * Rich Thomson
 */
public class Bank 
{
    private double interestRate = .1;
    private Customer[] customers = new Customer[100];
    
    public void calculateInterest(Customer customer) 
    {
        Account a = customer.getAccount();
        double bal = a.getBalance();
        double interestAmount = bal * interestRate / 100;
        double totalBalance = bal + interestAmount;
        System.out.println("Interest amount " + interestAmount + " Total money after adding interest: " + totalBalance);
    }

    public double getInterestRate() 
    {
        return interestRate;
    }

    public Customer[] getCustomer() 
    {
        return customers;
    }
}

/**
 * This class holds all the information for the customer.
 * Rich Thomson
 */
class Customer 
{

    private String name;
    private Account account;

    Customer(String n, Account a) {
        name = n;
        account = a;
    }
    
    public String getName()
    {
        return name;
    }

    public Account getAccount() 
    {
        return account;
    }
}