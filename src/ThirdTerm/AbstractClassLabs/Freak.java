package ThirdTerm.AbstractClassLabs;

public class Freak extends Warrior
{
   private String name;
   private int iq, strength;
   
   /**
     * pre:    none
        post:  getName() = name
               getIQ = iq
               getStrength = strength
    **/

   public Freak(String name)
   {
      super(name);
      generateStats();
   }
   
   /**
     * pre:    none
        post:   60 <= iq <= 180
                1 <= strength <= 100
    **/

   public void generateStats()
   {
      iq = (int)(Math.random() * 121 + 60);
      strength = (int)(Math.random() * 100 + 1);
   }
   
   /**
     * pre:  none
       post: returns Freak's IQ
   **/
   
   public int getIQ()
   {
      return iq;
   }
   
   /**
     **pre:    none
        post:   returns Freak's strength
    **/

   public int getStrength()
   {
      return strength;
   }
   
   /**
     * *pre:    other != null
        post:   true iff two Freaks have same name, iq, and strength
    **/
 
   public boolean equals(Freak other)
   {
      return super.equals(other) &&
             this.iq == other.iq &&
             this.strength == other.strength;
  }
  
 /**
     * pre:    none
        post:   returns String with Freak's name, iq, and strength
    **/
  
  public String toString()
  {
      return super.toString() +
             "\tIQ: " + this.iq +
             "\tStrength: " + this.strength;
  }
} //class