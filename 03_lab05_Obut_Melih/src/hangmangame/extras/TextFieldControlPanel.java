package hangmangame.extras;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * Char Textfield 
 * @author melih obut
 */
public class TextFieldControlPanel extends JPanel
{
   // properties
   HangmanModel hangmanModel;
   JTextField textField;
   
   // constructor
   public TextFieldControlPanel( HangmanModel hangmanModel)
   {
      this.hangmanModel = hangmanModel;
      textField = new JTextField();
      textField.setPreferredSize(new Dimension(150, 30));//creates JTextField 
      textField.addActionListener(new MyActionListener());  //add ActionListener to the JTextField
      add(textField);    //add JTextField to the TextFieldControlPanel panel
   }
   
   // inner class
   public class MyActionListener implements ActionListener
   {
      // adds ActionListener to the JTextField
      public void actionPerformed(ActionEvent e)
      {
         String text;
         if (e.getSource() == textField)
         {
            System.out.println ("TextFieldControlPanel");
            text = textField.getText();
            for (int i = 0; i < text.length(); i ++)
            {
               hangmanModel.tryThis(text.charAt(i)); 
            }
            textField.setText("");
            
         }
      }
   }
}