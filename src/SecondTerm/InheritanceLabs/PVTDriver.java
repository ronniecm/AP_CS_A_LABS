package SecondTerm.InheritanceLabs;

public class PVTDriver
{
   public static void main(String[] args)
   {
      Person joe = new Person("Joe", 35);
      System.out.println(joe);
      Vehicle car = new Vehicle("Joe", 35, "Honda", 4);
      System.out.println(car);
      Truck truck = new Truck("Bob", 40, "Ford", 10, 2.5, 500);
      System.out.println(truck);
      
      joe.setName("Bob");
      System.out.println(joe.getName() + " " + joe.getAge());
      
      System.out.println(car.getManuName() + " " + car.getNumOfCylinders());
      
      System.out.println(truck.getLoadCapacity() + " " + truck.getTowingCapacity());
   } //main
} //PVTDriver

/* Output


  ----jGRASP exec: java PVTDriver
 
 Name: Joe
 Age: 35
 
 Name: Joe
 Age: 35
 Manufacturer's Name: Honda
 Number of Cylinders in the Engine: 4
 
 Name: Bob
 Age: 40
 Manufacturer's Name: Ford
 Number of Cylinders in the Engine: 10
 Load Capacity: 2.5
 Towing Capacity: 500
 Bob 35
 Honda 4
 2.5 500
 
  ----jGRASP: operation complete.
 */