package SecondTerm.StringLabs;

public class test
{
   public static void main(String[] args)
   {
      String str = "Java is mighty.";
      String vowels = "aeiouAEIOU";
      
      String output = "";
      
      for(int j=0; j<str.length();j++)
      {
         if (vowels.indexOf(str.charAt(j)) == -1)
            output += "*";
         else
            output += str.charAt(j);
      }
      
      System.out.println(output);
   }
}