package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 4A
Due Date:
Date Submitted:
What I Learned: a) Use System.in while initializing Scanners
                b) Doing simple math with integers
                c) Math with integers will return an INTEGER
**********************************************************************************/

import java.util.Scanner;

public class Average
{
   public static void main(String[] args)
   {
      Scanner numbers = new Scanner(System.in);
      double x, y, z; //declare inputs
      
      //Take in number inputs
      System.out.println("Enter the first number: ");
      x = numbers.nextDouble();
      System.out.println("Enter the second number: ");
      y = numbers.nextDouble();
      System.out.println("Enter the third number: ");
      z = numbers.nextDouble();
      
      //Calculate the average
      double average = (x + y + z) / 3;
      
      //Display the result
      System.out.println("The average of the numbers is: " + average);
   }//main
}//Average