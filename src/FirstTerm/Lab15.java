package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 15
Due Date:
Date Submitted:
What I Learned: a) Incorporating methods into other methods
                b) More use of while loops
                c) Updating variables through iteration and selection
**********************************************************************************/
public class Lab15
{
   public static void main(String[] args)
   {
      printAmicableNumbers();
      printPerfect();
   } //main
   
   public static int aliquotSum(int n)
   {
      int aliquotSum = 0; //initialize aliquot sum
      for (int i = 1; i<n; i++)
      {
         if (n % i == 0)
         {
            aliquotSum += i;
         }
      }
      return aliquotSum;
   }//aliquotSum
   
   public static void printAmicableNumbers()
   {
      for (int n = 3; n <= 500; n++)
      {
         for (int m = 2; m < n; m++)
         {
            if (aliquotSum(m) == n && aliquotSum(n) == m)
               System.out.println(n + " and " + m + " are amicable numbers.");
         }
      }
   }//printAmicableNumbers
   
   public static boolean isPerfect(int n)
   {
      if (n == aliquotSum(n)) //if x equals its aliquot sum
      {
         return true; //number is perfect
      }
      else
      {
         return false; //number is not perfect
      }
   } //isPerfect
   
   public static void printPerfect()
   {
      for (int i = 2; i<=500; i++)
      {
         if (isPerfect(i))
         {
            System.out.println(i + " is a perfect number.");
         }
      }
   }//printPerfect
}//Lab15

/* Output

 ----jGRASP exec: java Lab15
 284 and 220 are amicable numbers.
 6 is a perfect number.
 28 is a perfect number.
 496 is a perfect number.
 
  ----jGRASP: operation complete.
 
 */
