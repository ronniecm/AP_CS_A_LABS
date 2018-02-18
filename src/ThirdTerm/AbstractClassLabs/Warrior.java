package ThirdTerm.AbstractClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Nerd Wars Part II
What I learned: a) Abstract methods will never
                   have a body.
                b) An abstract class contains
                   abstract methods.
                c) An abstract method can be
                   defined as concrete in other
                   subclasses.
************************************************/
public abstract class Warrior
{
   private String name;
   private int strength, iq;
   /**
     * pre:    none
        post:   getName() = name 
    **/

   public Warrior(String name)
   {
      this.name = name;
      generateStats();
   } //Warrior
   
   /**
     *pre:    none
        post:   returns Warrior's name
    **/

   public String getName()
   {
      return name;
   } //getName
   
   /**
     * *pre:    none
        post:   none
    **/

   public int getIQ()
   {
      return iq;
   }
   
   /**
     * *pre:    none
        post:   none
    **/

   public int getStrength()
   {
      return strength;
   }
   
   public void setIQ(int newIQ)
   {
      iq = newIQ;
   }
   
   public void setStrength(int newStrength)
   {
      strength = newStrength;
   }
   /**
     * *pre:    none
        post:   none
    **/

   public abstract void generateStats();
   
     /**
     * pre:    other is of Warrior type, other != null
        post:   if iq of a Warrior is more than 20 higher than the
                other warrior, then then that Warrior, otherwise
                it is decided by who is stronger
    **/
   public void fight(Warrior other)
   {
      if (this.getIQ() > 20 + other.getIQ())
         System.out.println(this.getName() + " beats " + other.getName() + " on IQ.");
      else if (other.getIQ() > 20 + this.getIQ())
         System.out.println(other.getName() + " beats " + this.getName() + " on IQ.");
      else if (this.getStrength() > other.getStrength())
         System.out.println(this.getName() + " beats " + other.getName() + " on strength.");
      else
         System.out.println(other.getName() + " beats " + this.getName() + " on strength.");
   }
   
   /**
     * *pre:    other != null
        post:   true iff two warriors have same name
    **/
     
   public boolean equals(Warrior other)
   {
      return this.name == other.name &&
             this.iq == other.iq &&
             this.strength == other.strength;
   } //equals
   
   /**
     * pre:    none
        post:   returns String with Warrior's name
    **/
   
   public String toString()
   {
      return "\nName: " + name +
             "\tIQ: " + iq +
             "\tStrength: " + strength;
   } //toString
} //Warrior


