package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 5
Due Date: September 11, 2017
Date Submitted: 
What I Learned: a) How to manipulate numbers with mod and division
                b) Work more with integer division
                c) Integer division returns an INTEGER
**********************************************************************************/
import java.util.Scanner;

public class Dispenser
{
   public static void main(String[] args)
   {
      //declaration of Scanner object
      Scanner change = new Scanner(System.in);
      
      //input price of the item
      System.out.println("Enter price of item");
      System.out.println("(1 to 99 cents):");
      int price = change.nextInt();
      
      //calculate change back
      int moneyBack = 100 - price;
      
      int quarters = moneyBack / 25; //find number of quarters
      moneyBack = moneyBack % 25; //change after quarters
      int dimes = moneyBack / 10; //find number of dimes
      moneyBack = moneyBack % 10; //change after dimes
      int nickels = moneyBack / 5; //find number of nickels
      moneyBack = moneyBack % 5; //change after nickels
      int pennies = moneyBack; //find number of pennies
      
      System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
      System.out.println("so your change is: "); 
      
      System.out.println(quarters + " quarters"); //print number of quarters
      System.out.println(dimes + " dimes"); //number of dimes
      System.out.println(nickels + " nickels"); //number of nickels
      System.out.println(pennies + " pennies"); //number of pennies
   }
}