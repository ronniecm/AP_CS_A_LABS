package SecondTerm.ArrayListLabs;

import java.awt.Graphics;

public abstract class Face
{
   Graphics g;
   public void draw(Graphics g)
   {
      this.g = g;
      g.drawOval(20,20,30,30);
      drawEyes(g);
      drawLips(g);
   }
   
   public void drawEyes(Graphics g)
   {
      this.g = g;
      g.fillOval(28,28,5,5);
      g.fillOval(38,25,5,5);
   }
   
   public abstract void drawLips(Graphics g);
}