package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 7
Due Date:
Date Submitted:
What I Learned: a) More advanced use of the Math class
                b) More advanced use of parameters in methods
                c) How to use the DecimalFormat class
                d) Understand more about return types
**********************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab7
{
   //Scanner used everywhere in program
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      double amount = getAmount(); //retrieve amount from method
      double rate = getRate(); //retrieve rate from method
      double years = getYears(); //retrieve years from method
      //calculate monthly payment using method
      double payment = findPayment(amount, rate, years); 
      //display payment using method
      displayPayment(payment);
   } // main
   
   public static double getAmount()
   {
      System.out.print("Enter the amount to be borrowed: ");
      double amount = console.nextDouble();
      //amount needs to be a positve double below 100,000
      if(amount < 0 || amount > 100000) 
      {
         System.out.print("Invalid amount. Enter amount: "); 
         //restart Scanner if amount is invalid
         amount = console.nextDouble(); 
      }
      //return amount
      return amount;
   } // getAmount
   
   public static double getRate()
   {
      System.out.print("Enter the annual interest rate as a percent: ");
      double rate = console.nextDouble();
      //rate must be less than 100 and positive
      if (rate < 0 || rate > 100)
      {
         System.out.print("Invalid rate. Enter annual interest rate as a percent: ");
         //restart Scanner if rate is invalid
         rate = console.nextDouble();
      }
      //return rate
      return rate;
   } // getRate
   
   public static double getYears()
   {
      System.out.print("Enter the length of the loan in years: ");
      double years = console.nextDouble();
      if (years < 0) //must be positive
      {
         System.out.print("Invalid length. Enter the length of the loan in years: ");
         //restart Scanner if time is invalid
         years = console.nextDouble(); 
      }
      //return years
      return years;
   } // getYears
   
   public static double findPayment(double amount, double rate, double years)
   {
      //calculate monthly rate
      double monthlyRate = rate/1200.0;
      //calculate number of months
      double months = years * 12.0;
      //calculate monthly payment
      return amount*monthlyRate*Math.pow(monthlyRate+1, months)/(Math.pow(monthlyRate+1, months)- 1);
   }  // findPayment
   
   public static void displayPayment(double payment)
   {
      //round to nearest hundreth
      DecimalFormat d = new DecimalFormat("0.00"); 
      //print monthly payment
      System.out.println("Monthly payment: $" + d.format(payment));
   }  // displayPayment
}  // Lab7


/* Output

 ----jGRASP exec: java Lab7
 Enter the amount to be borrowed: 10500
 Enter the annual interest rate as a percent: 9.5
 Enter the length of the loan in years: 4
 Monthly payment: $263.79
 
  ----jGRASP: operation complete.
 
*/