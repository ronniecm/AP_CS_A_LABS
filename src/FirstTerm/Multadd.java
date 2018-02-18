package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 6C
Due Date:
Date Submitted:
What I Learned: a) Using methods to do mathematical calculations
                b) Writing a method that invokes another method
**********************************************************************************/
public class Multadd
{
   public static void main(String[] args)
   {
      //test case 1: a = 1, b = 2, c = 3
      double a1 = 1.0;
      double b1 = 2.0;
      double c1 = 3.0;
      //ouput answer
      System.out.println("1.0 * 2.0 + 3.0 = " + multAdd(a1, b1, c1));
      
      //test case 2: a = 0.5, b = cos(pi/4), c = sin(pi/4)
      double a2 = 0.5;
      double b2 = Math.cos(Math.PI/4);
      double c2 = Math.sin(Math.PI/4);
      //output answer
      System.out.println("sin(pi/4) + (cos(pi/4)/2) = " + multAdd(a2, b2, c2));
      
      //test case 3: a = 1, b = log(10), c = log(20)
      double a3 = 1;
      double b3 = Math.log10(10);
      double c3 = Math.log10(20);
      //output answer
      System.out.println("log(10) + log(20) = " + multAdd(a3, b3, c3)); 
      
      //test case when x = 0
      System.out.println("When x = 0, xe^-x + sqrt(1-e^-x) = " + yikes(0.0));
      //test case when x = 1 
      System.out.println("When x = 1, xe^-x + sqrt(1-e^-x) = " + yikes(1.0)); 
   }  //main
   
   public static double multAdd(double a, double b, double c)
   {
      return a * b + c; //formula for multadditionization
   }  //multAdd
   
   public static double yikes(double x)
   {
      return multAdd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
   }  //yikes
}  //MultAdd

/* Output

 ----jGRASP exec: java Multadd
 1.0 * 2.0 + 3.0 = 5.0
 sin(pi/4) + (cos(pi/4)/2) = 1.0606601717798212
 log(10) + log(20) = 2.3010299956639813
 When x = 0.0, x*e^-x + sqrt(1 - e^-x) = 0.0
 When x = 1.0, x*e^-x + sqrt(1 - e^-x) = 1.1629395387920924
 
  ----jGRASP: operation complete.
 
*/