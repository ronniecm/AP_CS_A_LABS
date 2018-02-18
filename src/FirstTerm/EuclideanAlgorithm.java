package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 12
Due Date:
Date Submitted:
What I Learned: a) Use of while loops to reassign variables and do math
                b) More use of int methods
                c) If boolean condition is never met, an infinite loop is 
                   created
                d) Everyday implentation of algorithms
                e) Efficiency of algorithms
**********************************************************************************/
import java.util.*;

public class EuclideanAlgorithm
{
   public static void main(String[] args)
   {
     System.out.println("The GCD is: " + findGCD()); //prints out answer
   }//main
   
   public static int findGCD()
   {
      Scanner console = new Scanner(System.in);
      
      //take in integer inputs
      System.out.print("Enter one integer: ");
      int n1 = console.nextInt();
      
      System.out.print("Enter another integer: ");
      int n2 = console.nextInt();
      
      int remainder; //declare remainder variable
      
      //while loop to keep algorithm working until n1 or n2 = 0
      while (n1 != 0 && n2 != 0) 
      {
         if (n1 > n2)
         {
            remainder = n1 % n2; //find remainder
            n1 = n2;//make larger number smaller number
            n2 = remainder; //make smaller number remainder
            /*
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            */
         }
         else
         {
            remainder = n2 % n1;
            n2 = n1;
            n1 = remainder;
            /*
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            */
         }
      }
      
      if (n1 > n2)
      {
         return n1; //GCD if n1 is greater
      }
      else
      {
         return n2; //if n2 is greater
      }
   }//findGCD
}//EuclideanAlgorithm

/* Output

  ----jGRASP exec: java EuclideanAlgorithm
 Enter one integer: 256
 Enter another integer: 512
 The GCD is: 256
 
  ----jGRASP: operation complete.
  
     ----jGRASP exec: java EuclideanAlgorithm
 Enter one integer: 48
 Enter another integer: 10
 The GCD is: 2
 
  ----jGRASP: operation complete.
 

  
 */