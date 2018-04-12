import java.util.*;
import java.io.*;
/**
 * Rich Thomson
 * 
 * This class holds the switch statement
 * which runs the program.
 */
public class BankProgram 
{
    public static void main(String[] args) throws Exception 
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCust = 0;
        Bank b = new Bank();
        Customer[] c = b.getCustomer();
        while (true) 
        {
            
            System.out.println("1: Add Customer");
            System.out.println("2: Check Balance");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Deposit Money");
            System.out.println("5: Calculate Interest");
            System.out.println("6: Exit");
            System.out.println("Please enter your choice:");
            int choice = Integer.parseInt(br.readLine());
            if (choice <0 || choice >6)
            {
                System.out.println("That is not a valid option, please choose a number from 1-6.\n");
            }
            switch (choice) 
            {
                case 1:
                
                    System.out.println("Please enter the initial amount you wish to deposit in your account: ");
                    double bal = Double.parseDouble(br.readLine());
                    System.out.println("Please enter your pin number: ");
                    String pin = br.readLine();
                    Account account = new Account(bal, pin);
                    System.out.println("Please enter your name: ");
                    String name = br.readLine();
                    Customer customer = new Customer(name, account);
                    c[numCust] = customer;
                    System.out.println("The customer's name is: " + name + "\nThe opening balance is: " + bal + "\nThe pin number: " + pin + " was added successfully to the database");
                    numCust++;

                    break;
                    
                case 2:
                 
                    System.out.println("Please enter the pin number");
                    pin = br.readLine();
                    if (numCust == 0) 
                    {
                        System.out.println("There are no accounts registered in the system");
                    } 
                    else 
                    {
                        boolean found = false;
                        for (int i = 0; i < numCust; i++) 
                        {
                            Account temp = c[i].getAccount();
                            String pinTemp = temp.getpinNum();
                            if (pinTemp.equals(pin)) 
                            {
                                System.out.println("Balance is: "+temp.getBalance());
                                found = true;
                            }
                        }
                        if (found == false) 
                        {
                            System.out.println("The account was not found");
                        }
                    }
                    break;
                    
                case 3:
                
                    System.out.println("Please enter the pin number");
                    pin = br.readLine();
                    if (numCust == 0) 
                    {
                        System.out.println("There are no accounts registered in the system");
                    } 
                    else 
                    {
                        boolean found = false;
                        for (int i = 0; i < numCust; i++) 
                        {
                            Account temp = c[i].getAccount();
                            String pinTemp = temp.getpinNum();
                            if (pinTemp.equals(pin))
                            {
                                System.out.println("Please enter the amount to withdraw: ");
                                double money = Double.parseDouble(br.readLine());
                                temp.withdraw(money);
                                found = true;
                            }
                        }
                        if (found == false) 
                        {
                            System.out.println("The account was not found");
                        }
                    }
                    break;
                case 4:
                
                    System.out.println("Please enter the pin number");
                    pin = br.readLine();
                    if (numCust == 0) 
                    {
                        System.out.println("There are no accounts registered in the system");
                    } 
                    else 
                    {
                        boolean found = false;
                        for (int i = 0; i < numCust; i++) 
                        {
                            Account temp = c[i].getAccount();
                            String pinTemp = temp.getpinNum();
                            if (pinTemp.equals(pin))
                            {
                                System.out.println("Please Enter the amount to deposit: ");
                                double money = Double.parseDouble(br.readLine());
                                temp.deposit(money);
                                found = true;
                            }
                        }
                        if (found == false) 
                        {
                            System.out.println("The account was not found");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Please enter the pin number");
                    pin = br.readLine();
                    if (numCust == 0) 
                    {
                        System.out.println("There are no accounts registered in the system");
                    } 
                    else 
                    {
                        boolean found = false;
                        for (int i = 0; i < numCust; i++) 
                        {
                            Account temp = c[i].getAccount();
                            String pinTemp = temp.getpinNum();
                            if (pinTemp.equals(pin)) 
                            {
                                b.calculateInterest(c[i]);
                                found = true;
                            }
                        }
                        if (found == false) 
                        {
                            System.out.println("The account was not found");
                        }
                    }
                    break;
                    
                case 6:
                    System.out.println ("Thank you for using the program.");
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }
}