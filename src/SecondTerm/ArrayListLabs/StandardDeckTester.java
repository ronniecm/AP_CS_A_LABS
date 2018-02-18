package SecondTerm.ArrayListLabs;

public class StandardDeckTester
{
   public static void main(String[] args)
   {
      StandardDeck deck = new StandardDeck();
      deck.removeFirstCard();
      deck.shuffleDeck();
      System.out.println(deck);
      System.out.println(deck.numberOfCards());
      deck.addCard(0,0);
      System.out.println(deck);
      System.out.println(deck.numberOfCards());
      
      deck.reset();
      System.out.println(deck);
   }
}