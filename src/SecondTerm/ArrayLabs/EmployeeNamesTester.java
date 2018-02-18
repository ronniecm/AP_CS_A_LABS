package SecondTerm.ArrayLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - 1-D Array of References
What I learned: a) For each loops uses the object
                   as the iterator NOT the index
                b) You may assign an array
                   produced by a method to an
                   array declared in another
                   class
************************************************/
import java.util.*;

public class EmployeeNamesTester
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      String[] lastNames = {"Jones", "James", "Thompson", "Leonard", "Gupta",
                            "Patel", "Schmitz", "Durant", "Lau", "Kelly"};
      
      String[] formattedNames = new String[10];
      formattedNames = EmployeeNames.convertName(lastNames);
      
      for (String name : formattedNames)
      {
         System.out.println(name);
      } //for
   } //main
} //EmployeeNamesTester

/* Output

 ----jGRASP exec: java EmployeeNamesTester
 S. E. Jones
 S. E. James
 N. O. Thompson
 D. R. Leonard
 A. T. Gupta
 L. E. Patel
 Z. T. Schmitz
 T. N. Durant
 U. A. Lau
 Y. L. Kelly
 
  ----jGRASP: operation complete.
 
 */