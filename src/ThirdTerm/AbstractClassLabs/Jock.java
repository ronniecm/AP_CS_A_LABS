package ThirdTerm.AbstractClassLabs;

public class Jock extends Warrior
{
   private String name;
   private int iq, strength;
   
   /**
     * pre:    none
        post:  getName() = name
               getIQ = iq
               getStrength = strength
    **/

   public Jock(String name)
   {
      super(name);
      generateStats();
   }
   
   /**
     * pre:    none
        post:   80 <= iq <= 140
                50 <= strength <= 100
    **/

   public void generateStats()
   {
      iq = (int)(Math.random() * 61 + 80);
      strength = (int)(Math.random() * 51 + 50);
   }
   
   /**
     * pre:  none
       post: returns Jock's IQ
   **/
   
   public int getIQ()
   {
      return iq;
   }
   
   /**
     **pre:    none
        post:   returns Jock's strength
    **/

   public int getStrength()
   {
      return strength;
   }
   
   /**
     * *pre:    other != null
        post:   true iff two Jocks have same name, iq, and strength
    **/
 
   public boolean equals(Jock other)
   {
      return super.equals(other) &&
             this.iq == other.iq &&
             this.strength == other.strength;
  }
  
 /**
     * pre:    none
        post:   returns String with Jock's name, iq, and strength
    **/
  
  public String toString()
  {
      return super.toString() +
             "\tIQ: " + this.iq +
             "\tStrength: " + this.strength;
  }
}//class