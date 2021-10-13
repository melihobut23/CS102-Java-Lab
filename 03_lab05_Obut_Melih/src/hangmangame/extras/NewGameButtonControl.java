package hangmangame.extras;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import cs102.hangman.*;
/**
 * To play another game class
 * @author melih obut
 */
public class NewGameButtonControl extends JButton implements IHangmanView
{
   // properties
   HangmanModel hm;
   
   // constructor
   public NewGameButtonControl( HangmanModel hm)
   {
      this.hm = hm;
      setText("New Game");
      setEnabled(false);
      addActionListener(new MyActionListener());     //adds ActionListener 
   }
   
   // inner class
   public class MyActionListener implements ActionListener
   {
      // listens to actions
      public void actionPerformed(ActionEvent e)
      {
         setEnabled(false);
         hm.initNewGame();
      }
   }
   
   /* updateView() method updates the view
    * @return void
    */
   public void updateView(Hangman hm)
   {
      hm = hm;
      if(hm.isGameOver())
      {
         setEnabled(true);  
      } 
   }
}