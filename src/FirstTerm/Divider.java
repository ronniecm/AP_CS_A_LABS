package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 8
Due Date:
Date Submitted:
What I Learned: a) Use of if statements to compare numbers
                b) Else means any other condition not just the opposite
                c) Implementation of relational operators
                d) 
**********************************************************************************/
import java.util.Scanner;

public class Divider
{
   public static void main(String[] args)
   {
      Scanner divider = new Scanner(System.in);
      
      System.out.print("Enter a whole number: ");
      int x = divider.nextInt(); //input number 1
      
      System.out.print("Enter another whole number: ");
      int y = divider.nextInt();//input number 2
      
      int quotient, remainder;
      
      if (x > y) //logic to see which number is bigger 
      {
         quotient = x / y; //quotient calculation
         remainder = x % y;//remainder calculation
      } else { //includes if numbers are equal
         quotient = y / x;
         remainder = y % x;
      } 
      System.out.println("Quotient: " + quotient); //print remainder
      System.out.println("Remainder: " + remainder);//print quotient
   }  //main
}  //Divider

/* Output

 ----jGRASP exec: java Divider
 Enter a whole number: 3
 Enter another whole number: 6
 Quotient: 2
 Remainder: 0
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java Divider
 Enter a whole number: 54
 Enter another whole number: 7
 Quotient: 7
 Remainder: 5
 
  ----jGRASP: operation complete.
 
      ----jGRASP exec: java Divider
 Enter a whole number: 5
 Enter another whole number: 5
 Quotient: 1
 Remainder: 0
 
  ----jGRASP: operation complete.
 
 */