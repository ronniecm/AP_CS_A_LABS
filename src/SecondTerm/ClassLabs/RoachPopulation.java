package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 8 - Roach Population Lab
What I learned:
************************************************/
public class RoachPopulation
{
   private int population;
   
   public RoachPopulation(int initialPopulation)
   {
      population = initialPopulation;
   }//RoachPopulation(non-default)
   
   public void waitForDoubling()
   {
      population *= 2;
   }//waitForDoubling
   
   public void spray()
   {
      population *= 0.9;
   }//spray
   
   public int getRoaches()
   {
      return population;
   }//getRoaches
   
   public boolean equals(RoachPopulation other)
   {
      return this.population == other.population;
   }
 
   public String toString()
   {
      return "Current roach population is " + population;
   }//toString
   
   public static void main(String[] args)
   {
      RoachPopulation kitchen = new RoachPopulation(10);
      
      for (int k = 1; k <= 3; k++)
      {
         kitchen.waitForDoubling();
         kitchen.spray();
         System.out.println(kitchen);
      }//for
   }//main
} //RoachPopulation

/* Output
----jGRASP exec: java RoachPopulation
 Current roach population is 18
 Current roach population is 32
 Current roach population is 57
 
  ----jGRASP: operation complete.
  */
 