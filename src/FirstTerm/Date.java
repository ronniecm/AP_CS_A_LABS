package FirstTerm;

/***************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 2
Due Date:
Date Submitted:
What I Learned: a) Always compile and run a few times before finishing
                b) println always creates a new line
****************************************************************************/
public class Date
{
   public static void main(String[] args)
   {
      String day, month; //declaration of variables
      int date, year;
      day = "Thursday"; //assignment of values
      date = 31;
      month = "August";
      year = 2017;
      
      System.out.println("American Format:");
      System.out.println(day + ", " + month + " " + date + ", " + year);
      System.out.println("European Format:");
      System.out.println(day + " " + date + " " + month + ", " + year);
   }//main
}//Date