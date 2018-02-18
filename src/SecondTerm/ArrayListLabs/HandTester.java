package SecondTerm.ArrayListLabs;

public class HandTester
{
   public static void main(String[] args)
   {
      Card c = new Card(0,0);
      Hand h =new Hand();  
      Hand h2 = new Hand(c); 
      h.addCard(12, 3); // adding a card to h
      System.out.println(h.numberOfCards()); // should return 1
      System.out.println(h.getCard(0) + "\n" + h2.getCard(0)); // should return Ace of Spades and Ace of Clubs
      System.out.println(h.ifSameValue(12) + "\n" + h.ifSameSuit(3)); // true true
      System.out.println(h2.ifSameValue(3) + "\n" + h2.ifSameSuit(3)); // false false
      h.removeCard(0); // removes card
      System.out.println(h2); // tests toString method
   }
}