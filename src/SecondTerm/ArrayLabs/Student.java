package SecondTerm.ArrayLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 2 - 1-D Array of References
What I learned:
************************************************/
public class Student
{
   private int id;
   private String name;
   private double gpa;
   
   public Student(String name, int id, double gpa)
   {
      this.name = name;
      this.id = id;
      this.gpa = gpa;
   }
   
   public int getID()
   {
      return this.id;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public double getGPA()
   {
      return this.gpa;
   }
   
   public void setName(String n)
   {
      this.name = n;
   }
   
   public void setID(int newId)
   {
      this.id = newId;
   }
   
   public void setGPA(double newGpa)
   {
      this.gpa = newGpa;
   }
   
   public String toString()
   {
      return "\nName: " + this.name +
            "\nID: " + this.id +
            "\nGPA: " + this.gpa;
   }
}