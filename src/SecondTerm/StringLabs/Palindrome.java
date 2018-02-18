package SecondTerm.StringLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 2 - Palindrome Lab
What I learned:
************************************************/
import java.util.*;

public class Palindrome
{
   public static void main(String[] args)
   {
      String s;
      boolean isPalindrome;
      Scanner console = new Scanner(System.in);
      
      for(int k = 1; k<=8; k++)
      {
         System.out.print("Enter a string: ");
         s = console.nextLine();
         if (check(removeSpace(s)) == true)
            System.out.println("\""+ s + "\" is a palindrome\n\n");
         else
            System.out.println("\"" + s + "\" is NOT a palindrome\n\n");
      } //for
   } //main
   
   public static String removeSpace(String s)
   {
      return s.replace(" ","");
   } //removeSpace
   
   public static boolean check(String s)
   {
      String backwards = "";
      
      for (int i = s.length()-1; i >= 0; i--)
      {
         backwards += s.substring(i, i+1);
      }
      
      return s.equals(backwards);
   } //check
} //Palindrome

/* Output

  ----jGRASP exec: java Palindrome
 Enter a string: dad
 "dad" is a palindrome
 
 
 Enter a string: mom
 "mom" is a palindrome
 
 
 Enter a string: ronnie
 "ronnie" is NOT a palindrome
 
 
 Enter a string: lau
 "lau" is NOT a palindrome
 
 
 Enter a string: abc cba
 "abc cba" is a palindrome
 
 
 Enter a string: bob ob
 "bob ob" is a palindrome
 
 
 Enter a string: long word
 "long word" is NOT a palindrome
 
 
 Enter a string: long sentence
 "long sentence" is NOT a palindrome
 
 
 
  ----jGRASP: operation complete.
  */
