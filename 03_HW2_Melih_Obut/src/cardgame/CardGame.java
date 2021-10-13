package cardgame;

import java.util.ArrayList;

// Cardgame
// author:Melih Obut
// date: 05.03.2020
public class CardGame
{
   // properties
   Cards             fullPack;
   ArrayList<Player> players;
   ScoreCard         scoreCard;
   Cards[]           cardsOnTable;
   int               roundNo;
   int               turnOfPlayer;
   
   // constructors
   public CardGame( Player p1, Player p2, Player p3, Player p4)
   {
      players = new ArrayList<Player>();
      players.add(p1);
      players.add(p2);
      players.add(p3);
      players.add(p4);
   }
   
   // methods
   public boolean playTurn( Player p, Card c)
   {
      if (!isTurnOf(p) || isGameOver()) {
         return false;
      } else {
         
         cardsOnTable[ getTurnOfPlayerNo() - 1].addTopCard(c);
         
         if (roundNo % 4 == 3) {
            updateScores();
         }
         
         if (roundNo < 51)
            roundNo++;
         
         return true;
      }
   }
   
      private void updateScores() {
      Card max = new Card(0);
      
      for (int i = 0; i < scoreCard.scores.length - 1; i++) {
         if (cardsOnTable[i].cards[getRoundNo() - 1].getFaceValue() >= max.getFaceValue()) {
            max = cardsOnTable[i].cards[getRoundNo() - 1];
         }
         
      }
      
      for (int j = 0; j < scoreCard.scores.length; j++) {
         if (cardsOnTable[j].cards[getRoundNo() - 1].getFaceValue() == max.getFaceValue()) {
            scoreCard.update(j, 1);
         }
      }
   }
   public boolean isTurnOf( Player p)
   {
      if (players.get(roundNo % 4).getName().equals(p.getName()))
         return true;
      else
         return false;
   }
   
   public boolean isGameOver()
   {
      if (cardsOnTable[3].cards.length == 13 && getRoundNo() == 13)
         return true;
      else
         return false;
   }
   /**
     *
     * @param playerNumber
     * @return
     */
    public int getScore( int playerNumber)
   {
      
      return scoreCard.scores[playerNumber - 1];
   }
   
    /**
     *
     * @param playerNumber
     * @return
     */
    public String getName( int playerNumber)
   {
      return players.get(playerNumber - 1).getName();
   }
    
    /**
     *
     * @return round number
     */
   public int getRoundNo()
   {
      if (roundNo < 52)
         return (roundNo / 4) + 1;
      else
         return roundNo / 4;
   }
   
    /**
     *
     * @return turn player
     */
    public int getTurnOfPlayerNo()
   {
      int i;
      for (i = 0; i < players.size() && !isTurnOf(players.get(i)); i++) {
         
      }
      return i + 1;
   }
   
    /**
     *
     * @return winners
     */
    public Player[] getWinners()
   {
      Player[] winners = new Player[scoreCard.getWinners().length];
      
      for (int i = 0; i < winners.length; i++) {
         winners[i] = players.get(scoreCard.getWinners()[i]);
      }
      
      return winners;
   }
   
    /**
     *
     * @return string values of cards
     */
   public String showScoreCard()
   {
      return scoreCard.toString();
   }
   
}