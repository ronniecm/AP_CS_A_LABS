package ThirdTerm.AbstractClassLabs;

public class Thug extends Warrior
{
   public Thug(String name)
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
      setIQ((int)(Math.random() * 31 + 60));
      setStrength((int)(Math.random() * 21 + 80));
   }
}//class