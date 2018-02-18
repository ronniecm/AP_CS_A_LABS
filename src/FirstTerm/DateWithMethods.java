package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 6B
Due Date:
Date Submitted:
What I Learned: a) How to write methods with parameters
                b) Call different methods inside a program
**********************************************************************************/
import java.util.*;

public class DateWithMethods
{
   public static void main(String[] args) //uses static methods to print messsage
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter the date: ");
      int date = console.nextInt();
      System.out.print("Enter the year: ");
      int year = console.nextInt();
      System.out.print("Enter the day of the week: ");
      String day = console.next();
      System.out.print("Enter the month: ");
      String month = console.next();
      
      printAmerican(date, year, day, month);
      printEuropean(date, year, day, month);
   }//main
   
   public static void printAmerican(int date, int year, String day, String month) //prints date in American format
   {
      System.out.println(day + ", " + month + " " + date + ", " + year);
   }//printAmerican
   
   public static void printEuropean(int date, int year, String day, String month) //prints date in European format
   {
      System.out.println(day + " " + date + " " + month + ", " + year);
   }//printEuropean
}//DateWithMethods

/* Output

    ----jGRASP exec: java DateWithMethods
 Enter the date: 16
 Enter the year: 2017
 Enter the day of the week: Monday
 Enter the month: September
 Monday, September 16, 2017
 Monday 16 September, 2017
 
  ----jGRASP: operation complete.
*/