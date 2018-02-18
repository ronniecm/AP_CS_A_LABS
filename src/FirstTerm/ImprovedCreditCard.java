package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 14
Due Date:
Date Submitted:
What I Learned: a) Precedence Matters
                b) Make sure precedence rules are correct or you will get an
                   infinite loop
**********************************************************************************/
import java.util.*;
import java.text.*;

public class ImprovedCreditCard
{
   public static void main(String[] args)
   {
      int counter = 1; //initialize counter variable
      double totalPayments = 0.0; //total payments variable
      
      Scanner console = new Scanner(System.in);
      DecimalFormat d = new DecimalFormat("0.00");
      
      System.out.print("Enter beginning balnce: "); //input initial balance
      double amount = console.nextDouble();
      
      System.out.print("Enter monthly payment: "); //input monthly payment
      double monthlyPayment = console.nextDouble();
      
      System.out.print("Enter monthly interest rate: "); //input monthly interest rate
      double monthlyInterest = console.nextDouble();
      
      while (amount > 0)
      {
         if (amount < monthlyPayment) //logic if amount is below monthlyPayment
         {      
            amount = (amount + (amount * (monthlyInterest/100))); //calculate interest first
            totalPayments = totalPayments + amount; //add amount to totalPayments
            amount = amount - amount; //subtract payment to equal 0
         }
         else
         {
            amount = (amount + amount * (monthlyInterest/100)) - monthlyPayment; //add interest and subtract monthlyPayment
            totalPayments = totalPayments + monthlyPayment; //add monthlyPayment to totalPayments
         }
         System.out.print("Month " + counter); //display month number
         System.out.print(" balance: $" + d.format(amount)); //display amount remaining to be paid
         System.out.println(" total payments: $" + d.format(totalPayments)); //display total amount of payments
         counter++;  
      }
   }//main
}//ImprovedCreditCard

/* Output

Enter beginning balnce: 1000
 Enter monthly payment: 100
 Enter monthly interest rate: 1.5
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
 Month 11 balance: $0.00 total payments: $1091.62
 
  ----jGRASP: operation complete.
 */