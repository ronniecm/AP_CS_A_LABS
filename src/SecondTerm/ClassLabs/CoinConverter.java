package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 10 - Coin Converter Lab
What I learned:
************************************************/
import java.util.*;

public class CoinConverter
{
   private int cents, quarters, nickels, dimes, pennies;
   
   public CoinConverter(int initialCents)
   {
      cents = initialCents;
   } //CoinConverter
   
   public int getQuarters()
   {
      quarters = cents/25;
      cents %= 25;
      return quarters;
   } //getQuarters
   
   public int getNickels()
   {
      nickels = cents / 5;
      cents %= 5;
      return nickels;
   } //getNickels
   
   public int getDimes()
   {
      dimes = cents / 10;
      cents %= 10;
      return dimes;
   } //getDimes
   
   public int getPennies()
   {
      pennies = cents;
      return pennies;
   } //getPennies
   
   public boolean equals(CoinConverter other)
   {
      return this.quarters == other.quarters &&
             this.dimes == other.dimes &&
             this.nickels == other.nickels &&
             this.pennies == other.pennies;
   }//equals
   
   public String toString()
   {
      return getQuarters() + " quarters\n" +
             getDimes() + " dimes\n" +
             getNickels() + " nickels\n" +
             getPennies() + " pennies\n";
   } //toString
   
   public static void main(String[] args)
   {
      CoinConverter machine;
      int amountInCents;
      Scanner input = new Scanner(System.in);
      
      for (int i = 1; i<=6; i++)
      {
         System.out.print("Enter amount to be converted");
         amountInCents = input.nextInt();
      
         machine = new CoinConverter(amountInCents);
         System.out.print(machine);
      } //for
   } //main
} //CoinConverter

/* Output

 ----jGRASP exec: java CoinConverterDriver
 ----jGRASP exec: java CoinConverter
 Enter amount to be converted 0
 0 quarters
 0 dimes
 0 nickels
 0 pennies
 Enter amount to be converted 100
 4 quarters
 0 dimes
 0 nickels
 0 pennies
 Enter amount to be converted 95
 3 quarters
 2 dimes
 0 nickels
 0 pennies
 Enter amount to be converted 99
 3 quarters
 2 dimes
 0 nickels
 4 pennies
 Enter amount to be converted 60
 2 quarters
 1 dimes
 0 nickels
 0 pennies
 Enter amount to be converted 75
 3 quarters
 0 dimes
 0 nickels
 0 pennies
 
  ----jGRASP: operation complete.
  */