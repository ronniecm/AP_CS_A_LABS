package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 6A
Due Date: September 19, 2017
Date Submitted:
What I Learned: a) How to shorten code that has a lot of repitition
                b) The purpose for the use of methods in Java
**********************************************************************************/
public class FightSong
{
   public static void main(String[] args)
   {  
      //prints entire fight song by calling methods
      printHook();
      System.out.println();
      printVerse();
      System.out.println();
      printVerse();
      System.out.println();
      printHook();
   }  //main
   
   public static void printHook()
   {
      System.out.println("Go, team, go!");
      System.out.println("You can do it.");
   } //printHook
   
   public static void printVerse()
   {
     printHook();
     System.out.println("You're the best.");
     System.out.println("In the West.");
     printHook();
   } //printVerse
} //FightSong


/* Output
    ----jGRASP exec: java FightSong
 Go, team, go!
 You can do it.
 
 Go, team, go!
 You can do it.
 You're the best.
 In the West.
 Go, team, go!
 You can do it.
 
 Go, team, go!
 You can do it.
 You're the best.
 In the West.
 Go, team, go!
 You can do it.
 
 Go, team, go!
 You can do it.
 
  ----jGRASP: operation complete.
   
*/
  