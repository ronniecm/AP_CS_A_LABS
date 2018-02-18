package ThirdTerm.AbstractClassLabs;

public abstract class Triangle
{
   private String myName;
   public Triangle(String name)
   {
      myName = name;
   }
   
   public abstract double area();
   public abstract double perimeter();
}