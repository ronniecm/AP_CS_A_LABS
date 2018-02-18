package SecondTerm.ArrayListLabs;

import java.awt.Graphics;


public class SmileyFace extends Face
{

   Graphics g;
   public void drawLips(Graphics g)
   {
      this.g = g;
      g.drawArc(25, 25, 20,20, 255, 90);
   }
   
   public static void main(String[] args)
   {
       Face hi = new SmileyFace();
   }
}