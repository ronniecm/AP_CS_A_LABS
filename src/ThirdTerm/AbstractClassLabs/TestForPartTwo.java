package ThirdTerm.AbstractClassLabs;

public class TestForPartTwo
{
   public static void main(String[] args)
   {
      Warrior[] fighters = new Warrior[5];
      fighters[0] = new Nerd("Alex");
      fighters[1] = new Jock("Bill");
      fighters[2] = new Prep("Caden");
      fighters[3] = new Thug("David");
      fighters[4] = new Freak("Frank");
      
      int fighter1 = (int)(Math.random() * 5);
      int fighter2 = (int)(Math.random() * 5);
      
      while (fighter2 == fighter1)
         fighter2 = (int)(Math.random() * 5);
         
      System.out.print(fighters[fighter1]);
      System.out.println(fighters[fighter2]);
      
      fighters[fighter1].fight(fighters[fighter2]);   
   }
} //class

/* Output
Name: David	IQ: 77	Strength: 8
Name: Caden	IQ: 140	Strength: 76
Caden beats David on IQ.

Name: Caden	IQ: 136	Strength: 84
Name: Alex	IQ: 135	Strength: 42
Caden beats Alex on strength.

Name: Frank	IQ: 141	Strength: 3
Name: Caden	IQ: 91	Strength: 78
Frank beats Caden on IQ.

 Name: Alex	IQ: 175	Strength: 73
 Name: Frank	IQ: 177	Strength: 79
 Frank beats Alex on strength.
*/
