package SecondTerm.StringLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 4 - Sentence Information Lab
What I learned:
************************************************/
import java.util.*;

public class SentenceInformation
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Input Sentence: ");
      String sentence = input.nextLine();
      
      System.out.println("Length of sentence: " + sentence.length());
      
      int spaceCounter = 0;
      
      for(int i = 0; i<sentence.length(); i++)
      {
         if (sentence.substring(i, i+1).equals(" "))
            spaceCounter++;
      }
      
      int numOfWords = spaceCounter + 1;
      
      System.out.println("Number of words: " + numOfWords);
      
      double averageLength = (double)(sentence.length() - spaceCounter)/numOfWords;
      System.out.println("Average word length: " + averageLength);
   }
}
