package SecondTerm.InheritanceLabs;

public class Truck extends Vehicle
{
   private double loadCapacity;
   private int towingCapacity;
   
   public Truck(String ownerName, int age, String manuName, int cylinders, double loadCapacity, int towingCapacity)
   {
      super(ownerName, age, manuName, cylinders);
      this.loadCapacity = loadCapacity;
      this.towingCapacity = towingCapacity;
   }
   
   public Truck()
   {
      super();
      loadCapacity = 0.0;
      towingCapacity = 0;
   }
   
   public double getLoadCapacity()
   {
      return this.loadCapacity;
   }
   
   public int getTowingCapacity()
   {
      return this.towingCapacity;
   }
   
   public boolean equals(Truck other)
   {
      return super.equals(other) &&
             this.loadCapacity == other.loadCapacity &&
             this.towingCapacity == other.towingCapacity;
   }
   
   public String toString()
   {
      return super.toString() +
             "\nLoad Capacity: " + this.loadCapacity +
             "\nTowing Capacity: " + this.towingCapacity;
   }
}