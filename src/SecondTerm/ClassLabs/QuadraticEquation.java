package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 5 - Quadratic Equation Lab
What I learned: a). Static methods CANNOT use
                    instance variables
                b). Use this to specify which
                    object you are referring to
************************************************/
import java.util.*;

public class QuadraticEquation
{
   private double a, b, c;
   
   public QuadraticEquation()
   {
      this.a = 0;
      this.b = 0;
      this.c = 0;
   } //QuadraticEquation(default)
   
   public QuadraticEquation(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   } //QuadraticEquation(non-default)
   
   private double findDiscriminant()
   {
      return Math.pow(b, 2) - 4 * a * c;
   } //findDiscriminant
   
   public boolean noSolution()
   {
      if (findDiscriminant() < 0)
         return true;
      else
         return false;
   } //noSolution
   
   public boolean equalRoots()
   {
      if (findDiscriminant() == 0)
         return true;
      else
         return false;
   } //equalRoots
   
   public double getSolution1()
   {
      return (-b + Math.sqrt(findDiscriminant())) / (2 * a);
   } //getSolution1
   
   public double getSolution2()
   {
      return (-b - Math.sqrt(findDiscriminant())) / (2 * a);
   } //getSolution2
   
   public boolean equals(QuadraticEquation other)
   {
      return this.a == other.a &&
             this.b == other.b &&
             this.c == other.c;
   }
   
   public String toString()
   {
      return "Equation: " + a + "x^2 + " + b + "x + " + c;
   } //toString
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      for (int k = 1; k <= 3; k++)
      {
         System.out.print("Enter a, b, and c: ");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();
         
         QuadraticEquation q = new QuadraticEquation(a, b, c);
         
         if (q.noSolution() == true)
            System.out.println("No real solutions.");
         else if (q.equalRoots() == true)
            System.out.println("The only solution is " +
                                    q.getSolution1());
         else
         {
            System.out.println("The two real solutions are: ");
            System.out.println(q.getSolution1());
            System.out.println(q.getSolution2());
         } //else
      } //for
      
      QuadraticEquation test = new QuadraticEquation(1,2,3);
      QuadraticEquation test2 = new QuadraticEquation(1,2,3);
      
      System.out.println(test + "\n" + test2);
      System.out.println(test.equals(test2));
   } //main
}//QuadraticEquation

/* Output
 Enter a, b, and c: 1
 -2
 1
 The only solution is 1.0
 Enter a, b, and c: 1
 -4
 3
 The two real solutions are: 
 3.0
 1.0
 Enter a, b, and c: 1
 1
 1
 No real solutions.
 Equation: 1.0x^2 + 2.0x + 3.0
 Equation: 1.0x^2 + 2.0x + 3.0
 true
 
  ----jGRASP: operation complete.
 */