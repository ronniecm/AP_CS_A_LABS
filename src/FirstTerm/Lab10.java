package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 10
Due Date: October 4, 2017
Date Submitted:
What I Learned: a) You must cast integer math into to doubles to return a double
                b) Relational operators are higher than logical operators
                c) .nextInt() takes can take integers
                d) Order of your if statements matter. for example, if you have the
                   same point logic after the vertical line logic, it will say the 
                   same point is a vertical line.
**********************************************************************************/
import java.util.Scanner;

public class Lab10
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Enter the x and y of point 1 with a space in between them: ");
      int x1 = keyboard.nextInt();
      int y1 = keyboard.nextInt();
   
      System.out.print("Enter the x and y of point 2 with a space in between them: ");    
      int x2 = keyboard.nextInt();
      int y2 = keyboard.nextInt();
      
      if (x1 == x2 && y1 == y2)
      {
         System.out.println("Alert. These are the same points. No line.");
      } else if (x1 == x2) { //logic for vertical line 
         System.out.println("Alert. The line is vertical");
      } else if (y1 == y2) { //logic for horizontal line
         System.out.println("Alert. The line is horizontal");
      } else { //logic any other line
         System.out.println("Slope is: " + findSlope(x1, x2, y1, y2));
      }
   }
   
   public static double findSlope(int x1, int x2, int y1, int y2)
   {
      int numerator = y2 - y1; //calculate numerator
      int denominator = x2 - x1; //calculate denominator
      
      return (double)numerator/denominator; //calculate slope
   }  //findSlope
}//Lab10

/* Output
 ----jGRASP exec: java Lab10
 Enter the x and y of point 1 with a space in between them: 9 0
 Enter the x and y of point 2 with a space in between them: 7 5
 Slope is: -2.5
 
  ----jGRASP: operation complete.
  
  ----jGRASP exec: java Lab10
 Enter the x and y of point 1 with a space in between them: 8 8
 Enter the x and y of point 2 with a space in between them: 8 9
 Alert. The line is vertical
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Lab10
 Enter the x and y of point 1 with a space in between them: 6 3
 Enter the x and y of point 2 with a space in between them: 4 3
 Alert. The line is horizontal
 
  ----jGRASP: operation complete.
 
     ----jGRASP exec: java Lab10
 Enter the x and y of point 1 with a space in between them: 4 5
 Enter the x and y of point 2 with a space in between them: 4 5
 Alert. These are the same points. No line.
 
  ----jGRASP: operation complete.
 */ 
