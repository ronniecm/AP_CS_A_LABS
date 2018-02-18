package ThirdTerm.AbstractClassLabs;

public class Prep extends Warrior
{
   private String name;
   private int iq, strength;
   
   /**
     * pre:    none
        post:  getName() = name
               getIQ = iq
               getStrength = strength
    **/

   public Prep(String name)
   {
      super(name);
      generateStats();
   }
   
   /**
     * pre:    none
        post:   120 <= iq <= 180
                20 <= strength <= 80
    **/

   public void generateStats()
   {
      iq = (int)(Math.random() * 61 + 90);
      strength = (int)(Math.random() * 51 + 40);
   }
 
   /**
     * pre:  none
      post: returns Prep's IQ
   **/
   
   public int getIQ()
   {
      return iq;
   }
   
   /**
     **pre:    none
        post:   returns Prep's strength
    **/

   public int getStrength()
   {
      return strength;
   }
   
   /**
     * *pre:    other != null
        post:   true iff two Preps have same name, iq, and strength
    **/
 
   public boolean equals(Prep other)
   {
      return super.equals(other) &&
             this.iq == other.iq &&
             this.strength == other.strength;
  }
  
 /**
     * pre:    none
        post:   returns String with Prep's name, iq, and strength
    **/
  
  public String toString()
  {
      return super.toString() +
             "\tIQ: " + this.iq +
             "\tStrength: " + this.strength;
  }
}//class