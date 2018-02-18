package ThirdTerm.AbstractClassLabs;

public class Isoceles extends Triangle
{
   private double myA, myBase;
   public Isoceles()
   {
      super("Isoceles Triangle");
   }
   
   public Isoceles(double a, double b)
   {
      super("Isoceles Triangle");
      myA = a;
      myBase = b;
   }
   
   public double area()
   {
      return myBase * Math.sqrt((myA * myA) - (myBase*myBase/4)) / 2;
   }
   
   public double perimeter()
   {
      return (2*myA) + myBase;
   }
}