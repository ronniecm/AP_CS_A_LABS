package SecondTerm.StringLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - Password Strength Lab
What I learned:
************************************************/
import java.util.Scanner;
public class PasswordStrength
{
   public static void main(String[] args)
   {
      
      int strengthValue = 0;
      
      while(strengthValue < 1 || strengthValue > 4)
      {
         String password = generateRandomPassword();
         displayPasswordRule(password);
         strengthValue = checkStrength(password);
      }
      
   } //main
   
   public static String generateRandomPassword()
   {
      String charList = "0123456789abcdefghijklmnopqrstuvwxyz@#$%&*?!";
      int randomPasswordSize = (int)(Math.random()* 10 + 1);
      
      String password = "";
      for (int k = 0; k < randomPasswordSize; k++)
      {
         password += charList.charAt((int)(Math.random() * charList.length()-1));
      } //for
      
      return password;
   }
   
   public static void displayPasswordRule(String password)
   {
     if (checkStrength(password) == 1) {
         System.out.println(password + " is a very weak password.");
     } else if (checkStrength(password) == 2) {
         System.out.println(password + " is a weak password.");
     } else if (checkStrength(password) == 3) {
         System.out.println(password + " is a strong password.");
     } else if (checkStrength(password) == 4) {
         System.out.println(password + " is a very strong password.");
     } else {
         System.out.println(password + " is an invalid password.");
     }
   } //displayPasswordRule
   
   public static int checkStrength(String password)
   {
      if (password.length() < 8)
      {
         if (onlyLetters(password) == true) {
            return 1;
         } else if (onlyNums(password) == true) {
            return 2;
         } else {
            return 0;
         }
      } else {
         if (hasLetterNumAndSpecialChar(password) == true) {
            return 4;
         } else if (hasAtLeastOneNum(password) == true) {
            return 3;
         } else {
            return 0;
         }
      }
   }
   
   public static boolean onlyLetters(String password)
   {
      String charList = "abcdefghijklmnopqrstuvwxyz";
      int count = 0;
      
      for(int i = 0; i<password.length(); i++)
      {
         for (int j = 0; j<charList.length(); j++)
         {
            if (password.charAt(i) == charList.charAt(j))
               count++;
         } //for
      } //for
      
      if (count == password.length())
         return true;
      else
         return false;
   } //onlyLetters
   
   public static boolean onlyNums(String password)
   {
      String numList = "0123456789";
      int count = 0;
      
      for (int i = 0; i<password.length(); i++)
      {
         for (int j = 0; j<numList.length(); j++)
         {
            if (password.charAt(i) == numList.charAt(j))
               count++;
         } //for
      } //for
      
      if (count == password.length())
         return true;
      else
         return false;
   } //onlyNums
   
   public static boolean hasAtLeastOneNum(String password)
   {
      String numList = "0123456789";
      String charList = "abcdefghijklmnopqrstuvwxyz";
      
      for(int i = 0; i<password.length(); i++)
      {
         if (numList.indexOf(password.charAt(i)) == -1 &&
             charList.indexOf(password.charAt(i)) == -1)
            {
               return false;
            }
         else
            return true;
      }
      
      return true;
   } //hasAtleastOneNum
   
   public static boolean hasLetterNumAndSpecialChar(String password)
   {
      String charList = "abcdefghijklmnopqrstuvwxyz";
      String specialCharList = "@#$%&*?!";
      String numList = "1234567890";
            
      for (int i = 0; i<password.length(); i++)
      {
         if (charList.indexOf(password.charAt(i)) == -1 &&
             specialCharList.indexOf(password.charAt(i)) == -1 &&
             numList.indexOf(password.charAt(i)) == -1)
             {
               return false;
             }
          else 
            return true;
      } //for
      
      return true;
   } //hasLetterNumAndSpecialChar
} //PasswordStrength

/*
  ----jGRASP exec: java PasswordStrength
 k$5f is an invalid password.
 plmfr0 is an invalid password.
 bg is a very weak password.
 
  ----jGRASP: operation complete.
  
   ----jGRASP exec: java PasswordStrength
 owzwhy0fi is a strong password.
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java PasswordStrength
 v4trwj3 is an invalid password.
 u18 is an invalid password.
 %# is an invalid password.
 &@ is an invalid password.
 8&q28 is an invalid password.
 7 is a weak password.
 
  ----jGRASP: operation complete.
  
  ----jGRASP exec: java PasswordStrength
 ?d#i#09#5t is a very strong password.
 
  ----jGRASP: operation complete.
 
 
  
  */
  
  