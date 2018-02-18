package FirstTerm;

/*************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 14
Due Date:
Date Submitted:
What I Learned: a) More usage of while loop
                b) Another use of final variables
***************************************************************************/
import java.util.*;
import java.text.*;

public class CreditCard
{
   public static void main(String[] args)
   {
      int counter = 1; //initialize counter variable for months
      final double lateFee = 0.015; //late fee tax rate divided by 100
      double amount = 1000.0; //initial balance
      
      Scanner console = new Scanner(System.in);
      DecimalFormat d = new DecimalFormat("0.00");
      
      System.out.print("Enter monthly payment: ");
      double monthlyPayment = console.nextDouble(); //user input for montly payment
      
      while (amount > 0) //while loop for calculating remaining balance
      {
         amount = (amount + amount * lateFee) - monthlyPayment; //applying interst rate
         System.out.print("Month " + counter);
         System.out.print(" balance: $" + d.format(amount));
         System.out.println(" total payments: $" + d.format(monthlyPayment * counter)); 
         counter++; //increase counter
      }
   } //main
} //CreditCard

/* Output
Enter monthly payment: 100
 Month 1 balance: $915.00 total payments: $100.00
 Month 2 balance: $828.73 total payments: $200.00
 Month 3 balance: $741.16 total payments: $300.00
 Month 4 balance: $652.27 total payments: $400.00
 Month 5 balance: $562.06 total payments: $500.00
 Month 6 balance: $470.49 total payments: $600.00
 Month 7 balance: $377.55 total payments: $700.00
 Month 8 balance: $283.21 total payments: $800.00
 Month 9 balance: $187.46 total payments: $900.00
 Month 10 balance: $90.27 total payments: $1000.00
 Month 11 balance: $-8.38 total payments: $1100.00
 
  ----jGRASP: operation complete.
 */