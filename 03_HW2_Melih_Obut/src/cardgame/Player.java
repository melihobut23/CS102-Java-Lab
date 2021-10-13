package cardgame;

// Player - Simple card game player with name and hand of cards
// author:Melih Obut
// date: 05.03.2020
public class Player
{
    // properties
    String name;
    public Cards hand;
    
    // constructors
   public Player( String name)
   {
      this.name = name;
      hand = new Cards(false);
   }
    
    // methods
    /**
     *
     * @return
     */
   public String getName()
   {
      return name;
   }
    /**
     *
     * @param c
     */
    public void add( Card c)
   {
      hand.addTopCard(c);
      
   }
    /**
     *
     * @return
     */
    public Card playCard()
   {
      return hand.getTopCard();
   }
    
} // end class Player
