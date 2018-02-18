package SecondTerm.InheritanceLabs;

/***************************************************
Name: Ronnie Mohapatra
Lab: Lab 2 - Person, Vehicle, Truck Lab
What I learned: a) Public methods work with every
                   other class
                b) Inhertiance extends through every
                   class
                c) Remember every parameter for the
                   super constructor
****************************************************/
public class Person
{
   private String name;
   private int age;
   
   public Person() { name = "No name yet."; age = 0;}
   
   public Person(String name, int age) { this.name = name; this.age = age; }
   public void setName(String newName) { this.name = newName; }
   public String getName() { return this.name; }
   public int getAge() { return this.age; }
   public String toString() { return "\nName: " + this.name + "\nAge: " + age; }
   
   public boolean equals(Person other)
   {
      return this.name.equals(other.name) && this.age == other.age;
   }
} // Person