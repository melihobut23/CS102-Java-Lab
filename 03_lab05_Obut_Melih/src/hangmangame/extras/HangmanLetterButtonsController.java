package hangmangame.extras;

import java.awt.event.*;
import javax.swing.*;
import cs102.hangman.*;
import java.awt.*;
/**
 * All of the letter buttons actionListener class
 * @author melih obut
 */
public class HangmanLetterButtonsController implements ActionListener
{
   //properties
   Hangman hm;
           
   // constructor
   public HangmanLetterButtonsController(Hangman hm)
   {
      this.hm = hm;
   }
    /*
    * actionPerformed method add actionevent to the buttons
    * @param Hangman hangmanModel
    */
   public void actionPerformed (ActionEvent e)
   {
      hm.tryThis (e.getActionCommand().charAt(0));
      ((JButton)(e.getSource())).setEnabled(false);
   }
}
