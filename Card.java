
/**
 * Card class to model Card objects;
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1
 * @since 12/02/2015      
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2135678/View
 */
public class Card
{
    private String suit;
    private String description;
    
    /**
     * Default constructor to create a card object;
     */
    public Card(String suite, String description)
    {
        this.suit = suite;
        this.description = description;
    }
    
    /**
     * Public method to get suit of a card;
     * @return return suit as String;
     */
    public String getSuit()
    {   
        return this.suit;
    }
    
    /**
     * Public method to set suit of a card;
     * @param takes parameter value as String;
     */
    public void setSuit(String value)
    {
        this.suit = value;
    }
    
    /**
     * Public method to get description of a card;
     * @return return description as String;
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
     * Public method to set description of a card;
     * @param takes parameter value as String;
     */
    public void setDescription(String value)
    {
        this.description = value;
    }
}
