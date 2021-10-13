package cardgame;
import java.util.*;
// ScoreCard - Maintains one integer score per player, for any number of players
//             Caution: invalid playernumbers result in run-time exception!
// author:Melih Obut
// date: 05.03.2020
public class ScoreCard
{
   // properties
   int[] scores;
   
   // constructors
   public ScoreCard( int noOfPlayers)
   {
      scores = new int[noOfPlayers];
      
      // init all scores to zero
      for ( int i = 0; i < scores.length; i++)
         scores[i] = 0;
   }
   
   // methods
   public int getScore( int playerNo)
   {
      return scores[ playerNo];
   }
   
   public void update( int playerNo, int amount)
   {
      scores[playerNo] += amount;
   }
   
   public String toString()
   {
      String s;
      s = "\n"
         + "_____________\n"
         + "\nPlayer\tScore\n"
         + "_____________\n";
      
      for ( int playerNo = 0; playerNo < scores.length; playerNo++)
      {
         s = s + playerNo + "\t" + scores[playerNo] + "\n";
      }
      
      s += "_____________\n";
      return s;
   }
   
   public int[] getWinners()
   {
      int mostScore = 0;
      int[] win;
      ArrayList<Integer> winner = new ArrayList<Integer>();
      for (int i = 0; i < scores.length; i++) {
         if (scores[i] > mostScore) {
            mostScore = scores[i];
         }
         
      }
      
      for (int j = 0; j < scores.length; j++) {
         if (mostScore == scores[j]) {
            winner.add(j);
         }
      }
      
      win = new int[winner.size()];
      for (int i = 0; i < win.length; i++) {
         win[i] = winner.get(i);
      }
      
      return win;
   }


} // end class ScoreCard
