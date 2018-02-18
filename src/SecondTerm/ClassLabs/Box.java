package SecondTerm.ClassLabs;

/************************************************************************************
Name: Ronnie Mohapatra
Lab: Lab 1 - Type-in Lab
What I learned: a) The difference between a default constructor and non default
                   constructor
                b) The importance of a 'toString' method is to translate the object
                   into something that can be read and understood by the compiler: a
                   String
*************************************************************************************/
public class Box
{
   private int width, length, height;
   
   public Box()
   {
      this.width = 1;
      this.length = 1;
      this.height = 1;
   }//Box (default)
   
   public Box(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }//Box (non default)
   
   
   public String toString()
   {
      return "\nWidth: " + width +
             "\nLength: " + length +
             "\nHeight: " + height;
   }//toString
   
   
   public static void main(String[] args)
   {
      Box defaultBox = new Box();
      Box box = new Box(1, 2, 3);
      
      System.out.println(defaultBox);
      System.out.println(box);
   }//main
} //Box

/* Output
 ----jGRASP exec: java Box
 
 Width: 1
 Length: 1
 Height: 1
 
 Width: 1
 Length: 2
 Height: 3
 
  ----jGRASP: operation complete.
 
*/