package SecondTerm.StringLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 1 - Email Address
What I learned:
************************************************/
public class EMail
{
   private String myUserName, myHostName, myExtension;
   public EMail(String address)
   {
      int indexOfAt = address.indexOf('@');
      myUserName = address.substring(0, indexOfAt);
      int indexOfDot = address.indexOf('.');
      myHostName = address.substring(indexOfAt+1, indexOfDot);
      myExtension = address.substring(indexOfDot+1);
   }
   
   public String getUserName()
   {
      return myUserName;
   }
   
   public String getHostName()
   {
      return myHostName;
   }
   
   public String getExtension()
   {
      return myExtension;
   }
   
   public String toString()
   {
      return myUserName + "@" + myHostName + "." + myExtension;
   }
   
   public static void main(String[] args)
   {
      EMail ronnie = new EMail("ronniecm@gmail.com");
      
      System.out.println(ronnie.getUserName());
      System.out.println(ronnie.getHostName());
      System.out.println(ronnie.getExtension());
      
      System.out.println(ronnie);
   }
}