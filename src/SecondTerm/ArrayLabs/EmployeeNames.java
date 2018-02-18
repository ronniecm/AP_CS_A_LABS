package SecondTerm.ArrayLabs;

public class EmployeeNames
{
   public static String[] convertName(String[] lastNames)
   {
      String[] formattedNames = new String[10];
      
      for(int i = 0; i<lastNames.length; i++)
      {
         String firstInitial = lastNames[i].substring(lastNames[i].length() - 1).toUpperCase();
         String middleInitial = lastNames[i].substring(lastNames[i].length() - 2,  lastNames[i].length() - 1).toUpperCase();
         
         formattedNames[i] = firstInitial + ". " + middleInitial + ". " + lastNames[i];
      } //for
      
      return formattedNames;
   }//convertNames
}//EmployeeNames