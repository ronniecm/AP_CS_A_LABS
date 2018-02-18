package ThirdTerm.AbstractClassLabs;

public class Nerd extends Warrior
{
   /**
     * pre:    none
        post:  getName() = name
               getIQ = iq
               getStrength = strength
    **/

   public Nerd(String name)
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
      setIQ((int)(Math.random() * 61 + 120));
      setStrength((int)(Math.random() * 61 + 20));
   }
   

   
   public static void main(String[] args)
   {
      Warrior nerd = new Nerd("joey");
      System.out.println(nerd);
   }
 }//class