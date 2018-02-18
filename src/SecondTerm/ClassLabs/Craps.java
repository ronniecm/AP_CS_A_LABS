package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 7 - Craps Lab
What I learned:
************************************************/
import java.util.*;

public class Craps
{
   static Dice one = new Dice();
   static Dice two = new Dice();
   static int setpoint;
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args)
   {      
      printIntro();
      rollDie();
      System.out.println("\nROLL #1");  
      printRoll();      
      int sum = one.getCurrentSide() + two.getCurrentSide();
      
      if (sum == 7 || sum == 11)
      {
         System.out.println("You WON.");
      } else if (sum == 2 || sum == 12) {
         System.out.println("You LOSE.");
      } else {
         setpoint = sum;
         System.out.println("Your setpoint is " + setpoint);
         System.out.print("\nPress enter for next roll");
         input.nextLine();
         continueGame();
      }  
   }
   
   public static void rollDie()
   {
      one.roll();
      two.roll();
   } 
  
   public static void printRoll()
   {
      System.out.println("\nYou rolled a " + one.getCurrentSide() +
                         " and a " + two.getCurrentSide() + ".");
   }
  
   public static void continueGame()
   {
      for (int i = 2; i <= 5; i++)
      {
         System.out.println("\nROLL #" + i);
         rollDie();
         int sumOfRolls = one.getCurrentSide() + two.getCurrentSide();
         if (sumOfRolls == setpoint)
         {
            printRoll();
            System.out.println("YOU WIN");
            break;
         } else if (sumOfRolls == 7 || sumOfRolls == 11 || i == 5) {
            printRoll();
            System.out.println("YOU LOSE");
            break;
         } else {
            printRoll();
            System.out.print("\nPress enter for next roll");
            input.nextLine();
         } 
      }   
   }
   public static void printIntro()
   {
      System.out.println("Welcome to our Craps game extraordinaire!");
      System.out.println("Here's how you play.");
      System.out.println("A first roll of 7 or 11 wins.");
      System.out.println("A first roll of 2 or 12 wins.");
      System.out.println("Any other first roll becomes the set point.");
      System.out.println("Subsequent rolls of 7 or 11 loses.");
      System.out.println("On subsequent rolls of the set point wins!");
      System.out.println("You are limited to 5 rolls max.");
      System.out.println("Here's what happened to you.");
   }   
}

/* Output

ROLL #1
 
 You rolled a 3 and a 2.
 Your setpoint is 5
 
 Press enter for next roll
 
 ROLL #2
 
 You rolled a 3 and a 5.
 
 Press enter for next roll
 
 ROLL #3
 
 You rolled a 1 and a 1.
 
 Press enter for next roll
 
 ROLL #4
 
 You rolled a 5 and a 2.
 YOU LOSE
 
  ----jGRASP: operation complete.
 
 
 ROLL #1
 
 You rolled a 4 and a 2.
 Your setpoint is 6
 
 Press enter for next roll
 
 ROLL #2
 
 You rolled a 2 and a 6.
 
 Press enter for next roll
 
 ROLL #3
 
 You rolled a 6 and a 5.
 YOU LOSE
 
  ----jGRASP: operation complete.

 ROLL #1
 
 You rolled a 1 and a 6.
 You WON.
 
  ----jGRASP: operation complete.
 
 ROLL #1
 
 You rolled a 2 and a 4.
 Your setpoint is 6
 
 Press enter for next roll
 
 ROLL #2
 
 You rolled a 3 and a 2.
 
 Press enter for next roll
 
 ROLL #3
 
 You rolled a 3 and a 6.
 
 Press enter for next roll
 
 ROLL #4
 
 You rolled a 6 and a 2.
 
 Press enter for next roll
 
 ROLL #5
 
 You rolled a 2 and a 4.
 YOU WIN
 
 
 ROLL #1
 
 You rolled a 6 and a 5.
 You WON.

 */