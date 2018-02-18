package SecondTerm.ArrayLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 2 - 1-D Array of References
What I learned: a) Arrays can be made up of user
                   defined objects
                b) For each loops take the object
                   itself as the iterator, not the
                   index
************************************************/
import java.util.*;

public class StudentBody
{
   private Student[] students;
      
   public StudentBody()
   {
      students = new Student[3];
   }
   
   public void init()
   {
      Scanner input = new Scanner(System.in);
      for (int i = 0; i<students.length; i++)
      {
         System.out.println("Enter student's first name: ");
         String firstName = input.next();
         System.out.println("Enter student's last name: ");
         String lastName = input.next();
         String name = firstName + " " + lastName;
         System.out.println("Enter student's ID: ");
         int idNum = input.nextInt();
         System.out.println("Enter student's GPA: ");
         double gpa = input.nextDouble();
         students[i] = new Student(name, idNum, gpa);
      }
   }
   
   public String toString()
   {
      return students[0].toString() + 
             "\n" + students[1].toString() + 
             "\n" + students[2].toString();
   }
   
   public Student search(int id)
   {
      for (Student u : students)
      {
         if(u.getID() == id) {
            return u;
         }
      }
      
      return null;
   }
   
   public static void main(String[] args)
   {
      StudentBody students = new StudentBody();
      
      students.init();
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter the id of the student you are looking for: ");
      int studentID = keyboard.nextInt();
      
      Student target = students.search(studentID);
      
      if (target != null)
         System.out.println(target);
      else
         System.out.println("Student not found...");
         
      System.out.println("\nStudent Body Information:" + students);
   }
}

/* Output

  ----jGRASP exec: java StudentBody
 Enter student's first name: 
 Ronnie
 Enter student's last name: 
 Mohapatra
 Enter student's ID: 
 1624470
 Enter student's GPA: 
 4.3
 Enter student's first name: 
 Sally
 Enter student's last name: 
 Person
 Enter student's ID: 
 1418729
 Enter student's GPA: 
 4.2
 Enter student's first name: 
 Bob
 Enter student's last name: 
 Dillon
 Enter student's ID: 
 1318673
 Enter student's GPA: 
 3.5
 
 Enter the id of the student you are looking for: 1418729
 
 Name: Sally Person
 ID: 1418729
 GPA: 4.2
 
 Student Body Information:
 Name: Ronnie Mohapatra
 ID: 1624470
 GPA: 4.3
 
 Name: Sally Person
 ID: 1418729
 GPA: 4.2
 
 Name: Bob Dillon
 ID: 1318673
 GPA: 3.5
 
  ----jGRASP: operation complete.
  */