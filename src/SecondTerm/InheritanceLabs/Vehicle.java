package SecondTerm.InheritanceLabs;

public class Vehicle extends Person
{
   private String manuName;
   private int numOfCylinders;
   
   public Vehicle()
   {
      super();
      manuName = "No Name Yet.";
      numOfCylinders = 0;
   }
   
   public Vehicle(String ownerName, int age, String manuName, int cylinders)
   {
      super(ownerName, age);
      this.manuName = manuName;
      this.numOfCylinders = cylinders;
   }
   
   public String getManuName()
   {
      return this.manuName;
   }
   
   public int getNumOfCylinders()
   {
      return this.numOfCylinders;
   }
   
   public boolean equals(Vehicle other)
   {
      return super.equals(other) &&
             this.manuName.equals(other.manuName) &&
             this.numOfCylinders == other.numOfCylinders;
   }
   
   public String toString()
   {
      return super.toString() +
             "\nManufacturer's Name: " + this.manuName +
             "\nNumber of Cylinders in the Engine: " + this.numOfCylinders;
   }
}