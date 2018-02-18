package ThirdTerm.AbstractClassLabs;

public class Eq extends Triangle
{
   private double sideLength;
   
   public Eq(double side)
   {
      super("Eq Triangle");
      sideLength = side;
   }
   
   public double area()
   {
      return Math.sqrt(3) / 4 * Math.pow(sideLength, 2);
   }
   
   public double perimeter()
   {
      return 3 * sideLength;
   }
}