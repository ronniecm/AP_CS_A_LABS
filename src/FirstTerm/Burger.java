package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 11
Due Date:
Date Submitted:
What I Learned: a) Use of for loops for math
                b) Reassignment of variables in a for loop
**********************************************************************************/
import java.util.*;
import java.text.*;

public class Burger
{
   public static void main(String[] args)
   {
      final double taxRate = 30.0; //constant tax rate
      final double wage = 5.15; //constant wage
      double hours, takeHomePay; 
      double monthlyTotal = 0.0; //initialize total for whole month 
      
      
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat d = new DecimalFormat("0.00");
      
      for (int i = 1; i <= 4; i++)
      {
         System.out.print("How many hours did you work in week " + i + "?");
         hours = keyboard.nextDouble(); //input number of hours
         takeHomePay = hours * wage * (1 - taxRate/100); //calculate take home pay for week
         monthlyTotal += takeHomePay; //update monthly total
         System.out.println("Your take home pay is: $" + d.format(takeHomePay)); //display week's take home pay
      }
      
      System.out.println("You made $" + d.format(monthlyTotal) + " this month."); //display total for month     
   }//main 
}//Burger

/* Output

 ----jGRASP exec: java Burger
 How many hours did you work in week 1?45
 Your take home pay is: $162.23
 How many hours did you work in week 2?50
 Your take home pay is: $180.25
 How many hours did you work in week 3?35
 Your take home pay is: $126.17
 How many hours did you work in week 4?45
 Your take home pay is: $162.23
 You made $630.88 this month. 
  ----jGRASP: operation complete.
 
 */