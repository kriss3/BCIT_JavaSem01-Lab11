import java.util.ArrayList;
import java.util.Iterator;
/**
 * Class to model a deck of cards.

 * Lab 11 For Gary Tong
 *
 * @author Krzysztof Szczurowski;
 * @version 1.1
 * @since 12/10/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2138002/View
 */
public class Deck
{
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    
    public ArrayList<Card> deck = new ArrayList<Card>();

    /**
     * Public method to load all combination of card and store it in a deck;
     */
    public void loadDeck()
    {
        for(int i = 0; i < DESCRIPTIONS.length; i++)
        {
            for(int j = 0; j < SUITS.length; j++)
            {
                deck.add(new Card(SUITS[j], DESCRIPTIONS[i]));
            }
        }
    }
    
    /**
     * Public method to print content of a deck ArrayList;<br>
     * It does not take parameters, it does not return value;<br>
     * Print Error when cards are not loaded to the deck of cards;
     */
    public void printDeck()
    {
        if(deck.size() == 0)
        {
            System.out.println("ERROR: Load Deck first !!!");
        }
        else
        {
            System.out.println("Elements in the ArrayList: " + deck.size());
            for(Card c : deck)
            {
                System.out.println(c.getDescription() + " of " + c.getSuit() + ".");
            }
        }
    }
    
    /**
     * Public method to remove an element from the Deck of Cards;
     * @param takes i as integer; index parameter of element to be removed from the Desck of cards;
     */
    public void removeCard(int i)
    {
        if(i >= 0 && i < deck.size())
        {
            deck.remove(i);
        }
        else
        {
            System.out.println("Error: Index out of bound of Deck ArrayList.");
        }
    }
    
    /**
     * Public method to remove all cards with Suite from the Deck of Cards;
     * @param takes suitName parameter as String;
     */
    public void removeBySuit(String suitName)
    {
        Iterator<Card> itr = deck.iterator();
        while(itr.hasNext())
        {
            Card c = itr.next();
            if(c.getSuit().equals(suitName))
            {
                itr.remove();
            }
        }
        printDeck();
    }
    
    /**
     * Public method to remove all cards with Suite from the Deck of Cards;<br>
     * This method does not use while loop;<br>
     * @param takes suitName parameter as String;
     */
    public void removeBySuiteUsingForLoop(String suitName)
    {
        Iterator<Card> itr = deck.iterator();
        for (Iterator<Card> cardIterator = itr; itr.hasNext();)
        {
            Card c = itr.next();
            if(c.getSuit().equals(suitName))
            {
                itr.remove();
            }
        }
        printDeck();
    }
    
    /**
     * Public method to remove all cards with Suite from the Deck of Cards;<br>
     * This method uses lambda expression to remove item from collection based on parameter;<br>
     * @param takes suitName parameter as String;
     */
    public void removeSuitUsingLambda(String suitName)
    {
        deck.removeIf(c -> c.getSuit().equals(suitName));
        printDeckWithLambda();
    }
    
    /**
     * Public method to print content of a deck;<br>
     * It does not take parameters, it does not return value;<br>
     * It uses lambda expression + forEach method to print content of collection;
     */
    public void printDeckWithLambda()
    {
        if(deck.size() == 0)
        {
            System.out.println("ERROR: Load Deck first !!!");
        }
        else
        {
            System.out.println("Elements in the ArrayList: " + deck.size());
            deck.forEach((c) -> System.out.println(c.getDescription() + " of " + c.getSuit() + "."));
        }
    }
}
