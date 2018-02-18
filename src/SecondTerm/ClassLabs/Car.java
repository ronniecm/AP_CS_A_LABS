package SecondTerm.ClassLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - Car Lab
What I learned: a). Use accessor methods to display
                    instance variables/attributes
                b). Use "this" to specify which
                    object you are referring to
************************************************/
public class Car
{
   private String make;
   private int year;
   private double mileage, cost;
   
   public Car()
   {
      this.make = " ";
      this.year = 0;
      this.mileage = 0;
      this.cost = 0;
   } //Car(default)
   
   public Car(String make, int year, double mileage, double cost)
   {
      this.make = make;
      this.year = year;
      this.mileage = mileage;
      this.cost = cost;
   } //Car(non default)
   
   public String getMake()
   {
      return this.make;
   } //getMake
   
   public int getYear()
   {
      return this.year;
   } //getYear
   
   public double getMileage()
   {
      return this.mileage;
   } //getMileage
   
   public double getCost()
   {
      return this.cost;
   } //getCost
   
   public boolean equals(Car other)
   {
      return this.make.equals(other.make) &&
             this.year==other.year &&
             this.mileage==other.mileage &&
             this.cost==other.cost;
   } //equals
   
   public String toString()
   {
      return "\nMake: " + make +
             "\nYear: " + year +
             "\nMileage: " + mileage +
             "\nCost: " + cost;
   } //toString
   
   public static void main(String[] args)
   {
      Car test = new Car("Toyota", 2000, 1239.8, 20000.0);
      Car test2 = new Car("Honda", 2005, 1300.4, 29834.5);
      
      System.out.println(test.getMake());
      System.out.println(test.getYear());
      System.out.println(test.getMileage());
      System.out.println(test.getCost());
      
      System.out.println(test2.getMake());
      System.out.println(test2.getYear());
      System.out.println(test2.getMileage());
      System.out.println(test2.getCost());
      
      
      
      System.out.println(test);
      System.out.println(test2);
      System.out.println(test.equals(test2));
   } //main
} //Car

/* Output
 ----jGRASP exec: java Car
 Toyota
 2000
 1239.8
 20000.0
 Honda
 2005
 1300.4
 29834.5
 
 Make: Toyota
 Year: 2000
 Mileage: 1239.8
 Cost: 20000.0
 
 Make: Honda
 Year: 2005
 Mileage: 1300.4
 Cost: 29834.5
 false
*/