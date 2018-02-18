package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 6 - Dice Lab
What I learned: a) More work with instance variables
                b) Difference between default
                   and non default constructors
************************************************/
public class Dice
{  
   private int faceValue;
   
   public Dice()
   {
      faceValue = 1;
   } //Dice(default)
   
   public Dice(int value)
   {
      faceValue = value;
   }//Dice(non default)
   
   public int roll()
   {
      faceValue = (int)(Math.random() * 6 + 1);
      return faceValue;
   }//roll
   
   public int getCurrentSide()
   {
      return faceValue;
   }//getCurrentSide
   
   public boolean equals(Dice other)
   {
      return this.faceValue == other.faceValue;
   }//equals
   
   public String toString()
   {
      return "Side: " + faceValue;
   } //toString
   
   public static void main(String[] args)
   {
      Dice d = new Dice();
      
      System.out.println(d);
      
      for (int k = 1; k <= 5; k++)
      {
         d.roll();
         System.out.println("\nCurrent side: " + d.getCurrentSide());
      }//for
   }//main
} //Dice

/* Output

Side: 1
 
 Current side: 4
 
 Current side: 4
 
 Current side: 2
 
 Current side: 6
 
 Current side: 5
 
  ----jGRASP: operation complete.
 */