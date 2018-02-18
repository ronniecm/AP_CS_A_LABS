package FirstTerm;

/***************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of Lab: Lab 4B
Purpose: Reads a four digit number and outputs the number one digit per line
Due Date:
Date Submitted: 
What I Learned: a) Usage of the modulus function
                b) How to extract digits out of numbers
                c) Test out with smaller numbers first
****************************************************************************/
import java.util.Scanner;

public class DisplayVertical
{
   public static void main(String[] args)
   {
      Scanner vertical = new Scanner(System.in);
      
      System.out.println("Enter a number: ");
      int number = vertical.nextInt(); //Input number x
      
      //Separate the digits
      int lastDigit = number % 10; //Extract last digit
      int thirdDigit = (number / 10) % 10; //Extract third digit
      int secondDigit = (number / 100) % 10; //Extract second digit
      int firstDigit = number / 1000; //Extract first digit
      
      //Display digits in vertical line
      System.out.println(firstDigit);
      System.out.println(secondDigit);
      System.out.println(thirdDigit);
      System.out.println(lastDigit);
   }//main
}//DisplayVertical