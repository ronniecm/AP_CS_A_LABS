package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 9
Due Date:
Date Submitted:
What I Learned: a) How to work with Math.random
                b) How to properly implement Math.abs
                c) How to implement logical operators
                d) Relational operators are seen before logical operators
                e) PRECEDENCE MATTERS
**********************************************************************************/
import java.util.Scanner;

public class Lock
{
   static Scanner locker = new Scanner(System.in);
   public static void main(String[] args)
   {
      //generates random numbers
      int first, second, third;
      first = (int)(Math.random () * 50 + 1);
      second = (int)(Math.random () * 50 + 1);
      third = (int)(Math.random () * 50 + 1);
      
      //prints out random numbers
      System.out.println(first + ", " + second + ", " + third);
  
      //prints whether the lock is open or closed
      System.out.println("The lock is open: " + theLockisOpen(first, second, third));
   } //main
   
   public static boolean theLockisOpen(int firstNum, int secondNum, int thirdNum)
   {
      //prompt user for guess
      System.out.print("Guess the first number: ");
      int firstGuess = locker.nextInt();
      
      System.out.print("Guess the second number: ");
      int secondGuess = locker.nextInt();
      
      System.out.print("Guess the third number: ");
      int thirdGuess = locker.nextInt();
      
      //logic to check if the guesses are within a margin of 3
      if (Math.abs(firstGuess-firstNum) <= 3 && Math.abs(secondGuess-secondNum) <= 3 
                                  && Math.abs(thirdGuess - thirdNum) <= 3)
      {
        return true;
      } else {
        return false;
      }
   }//theLockisOpen
} //Lock

/* Output
 
 ----jGRASP exec: java Lock
 Guess the first number: 5
 Guess the second number: 42
 Guess the third number: 7
 The lock is open: false
 
  ----jGRASP: operation complete.
 
----jGRASP exec: java Lock
 23, 35, 1
 Guess the first number: 20
 Guess the second number: 38
 Guess the third number: 4
 The lock is open: true
 
  ----jGRASP: operation complete.
 
 */