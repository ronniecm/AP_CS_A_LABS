package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 3
Due Date:
Date Submitted: September 7, 2017   
What I Learned: a) Use System.in while initializing Scanners
                b) Doing simple math with integers
**********************************************************************************/
import java.util.Scanner;

public class Rectangles
{
   public static void main(String[] args) {
      Scanner rectangle = new Scanner(System.in); 
      
      //Prompting the user for inputs: width and height
      System.out.println("Enter the width: ");
      int width = rectangle.nextInt();
      
      System.out.println("Enter the width: ");
      int length = rectangle.nextInt();
      
      //Calculating area and perimeter
      int area = width * length;
      int perimeter = 2 * (width + length);
      
      //Display results
      System.out.println("The rectangle's area is: " + area);
      System.out.println("The rectangle's perimeter is : " + perimeter);
   }//main
}//Rectangles


/* Questions to Bottom

1. The perimeter is 4 times width (or length) and the area is the width (or length)
   squared.
   
2. The console says there was an InputMismatchException, which means it realizes
   that the user entered a String rather than an integer.

3. The program will still work that way it was coded. It will return a perimeter
   and an area.
*/
