package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 9 - Vending Machine Lab
What I learned:
************************************************/
public class VendingMachine
{
   private int sodaCanCount, tokenCount;
   
   public VendingMachine()
   {
      this.sodaCanCount = 10;
      this.tokenCount = 0;
   } //VendingMachine (default)
   
   public VendingMachine(int cans)
   {
      sodaCanCount = cans;
      tokenCount = 0;
   } //VendingMachine (non default)
   
   public int getSodaCount()
   {
      return sodaCanCount;
   } //getSodaCount
   
   public int getTokenCount()
   {
      return tokenCount;
   } //getTokenCount
   
   public void addCans(int numberOfCans)
   {
      sodaCanCount += numberOfCans;
   } //numberOfCans
   
   public void insertToken()
   {
      tokenCount++;
      sodaCanCount--;
   } //insertToken
   
   public boolean equals(VendingMachine other)
   {
      return this.sodaCanCount == other.sodaCanCount &&
             this.tokenCount == other.tokenCount;
   } //equals
   
   public String toString()
   {
      return "Number of cans left: " + sodaCanCount +
             "\nNumber of tokens inserted: " + tokenCount;
   } //toString
   
   public static void main(String[] args)
   {
      VendingMachine machine = new VendingMachine(); 
      VendingMachine javaMachine = new VendingMachine (20);
      machine.addCans (20);
      machine.insertToken();
      machine.insertToken();
      System.out.println (machine);
      System.out.println (javaMachine);
   } //main
} //VendingMachine

/* Output

 ----jGRASP exec: java VendingMachine
 Number of cans left: 28
 Number of tokens inserted: 2
 Number of cans left: 20
 Number of tokens inserted: 0
 
  ----jGRASP: operation complete.
 */