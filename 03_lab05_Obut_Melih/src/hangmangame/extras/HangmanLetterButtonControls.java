package hangmangame.extras;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import cs102.hangman.*;
/**
 * All of the letter buttons 
 * @author melih obut
 */
public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{   
   // properties
   Hangman hangman;
   // constructor
   public HangmanLetterButtonControls(String letters){
      super(letters);  
   }
   
   /*
    * updateView method enables buttons
    * @param Hangman hangmanModel
    */
   @Override
   public void updateView(Hangman hangmanModel){
      if ( hangmanModel.isGameOver ())
         setEnabledAll(false);
      else
      {
         setEnabledAll(true);
         setDisabled (hangmanModel.getUsedLetters());
      }
   }
}