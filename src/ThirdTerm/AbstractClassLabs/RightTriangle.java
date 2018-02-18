package ThirdTerm.AbstractClassLabs;

public class RightTriangle extends Triangle
{
   private double leg1, leg2;
   
   public RightTriangle(double length1, double length2)
   {
      super("Right Triangle");
      leg1 = length1;
      leg2 = length2;
   }
   
   public double area()
   {
      return leg1 * leg2 / 2;
   }
   
   public double perimeter()
   {
      double hypotnuse = Math.sqrt((leg1*leg1) + (leg2*leg2));
      return leg1 + leg2 + hypotnuse;
   }
   
   public static void main(String[] args)
   {
      Triangle t = new Isoceles(2, 3);
      
      System.out.println("Isoceles (2,3) area: " + t.area());
      
      Triangle[] array = new Triangle[3];
      
      array[0] = new Isoceles(2,3);
      
      array[1] = new RightTriangle(1, 3);
      
      array[2] = new Eq(2);
      
      for(Triangle v : array)
         System.out.println(v.area()); 
   }
}