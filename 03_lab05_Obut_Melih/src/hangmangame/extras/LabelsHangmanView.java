package hangmangame.extras;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import cs102.hangman.*;
/**
 * Label Class that show knowledge about game
 * @author melih obut
 */
public class LabelsHangmanView extends JPanel implements IHangmanView
{
   // properties
   
   JLabel knownSoFar;
   JLabel allLetters;
   JLabel usedLetters;
   JLabel incorrectTries;
   JLabel maxAllowedTries;
   JLabel hasLost;     
   JLabel gameOver;
   // constructor
   public LabelsHangmanView( )
   {
      setLayout (new GridLayout(7,1));
      knownSoFar = new JLabel ();
      allLetters = new JLabel ();
      usedLetters = new JLabel ();
      incorrectTries = new JLabel ();
      maxAllowedTries = new JLabel ();
      hasLost = new JLabel ();
      gameOver = new JLabel ();
      add (knownSoFar);
      add (allLetters);
      add (usedLetters);
      add (incorrectTries);
      add (maxAllowedTries);
      add (hasLost);
      add (gameOver);
   }
   
   /*
    * updateView method update the view of labels
    * @param Hangman hangmanModel
    */
   @Override
   public void updateView(Hangman hangmanModel)
   {
      knownSoFar.setText("Known So Far      = " + hangmanModel.getKnownSoFar() );
      usedLetters.setText("UsedLetters     = " + hangmanModel.getUsedLetters() );
      incorrectTries.setText("Incorrect Tries  = " + hangmanModel.getNumOfIncorrectTries() );
      hasLost.setText( "Has Lost         = " + hangmanModel.hasLost() );
      gameOver.setText("Game Over        = " + hangmanModel.isGameOver() );  
      if ( hangmanModel.hasLost()){
         setBackground(Color.RED);
      }
      else if( hangmanModel.hasLost() == false && hangmanModel.isGameOver() == true){
         setBackground(Color.GREEN);
      }
      else if( !hangmanModel.isGameOver()){
         setBackground(Color.WHITE);
      }
   }
}