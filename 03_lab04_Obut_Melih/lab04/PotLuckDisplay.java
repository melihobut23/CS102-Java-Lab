import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Creates components for the potluckdisplay all gui code and initiliazes 
 * the unknown boxes 
 * 
 * @author Melih Obut
 * @date 31.03.2020
 */
public class PotLuckDisplay extends JFrame {
   
   //constants
   private static final int WIDTH = 500;
   private static final int HEIGHT = 500;
   private static final int ROW = 5;
   private static final int COLUMN = 5;
   
   //properties
   private JButton prizeButton;
   private JLabel label;
   private JPanel panel;
   private int prizeNum;
   private int trial;
   
   
   //program code
   
   /**
    * Constructor that creates a game
    */
   public PotLuckDisplay(){
      setTitle("Pot Luck Game");
      trial = 0;
      label = new JLabel("Just Choose one of them!!");
      add(label, BorderLayout.NORTH);
      createPrizeBomb();
      createComponents();
      setSize(WIDTH, HEIGHT);  
   }
   
   /**
    * creates prizes different from each other
    */
   private void createPrizeBomb(){
      prizeNum = (int) (Math.random() * 24); 
   }
   
   /**
    * creates panel and adds buttons
    */
   private void createComponents() {
      panel = new JPanel();
      panel.setLayout(new GridLayout(ROW,COLUMN));
      
      for(int i = 0; i <25; i++){
         if(i == prizeNum){
            prizeButton = makeButton();
            
            panel.add(prizeButton);
         }
         else
         {
            panel.add(makeButton());
         }
      }
      
      add(panel, BorderLayout.CENTER);
   }
   
   /**
    * implements action listener class to get user events for buttons
    * 
    * @author Melih Obut
    * @date 31.03.2020
    */
   class ButtonListener implements ActionListener{
      
      /**
       * take the events source and take action with respect to event
       * if the prizebutton is pressed then it will congrutulate the user and
       * the user's trial will be updated
       * 
       * @param Actionevent of user
       */
      @Override
      public void actionPerformed(ActionEvent eve) 
      {
         trial++;
         if(eve.getSource() == prizeButton)
         {
            label.setText("You have managed to find prize with " + trial + " trial");
             
            for(int i = 0; i < 25; i++){
               prizeButton.setEnabled(true);
               ((JButton) panel.getComponent(i)).setEnabled(false);
               
            }
            
         }
         else 
         {
            label.setText("You did not step anything precious in " + trial + " trial");
            ((JButton) eve.getSource()).setEnabled(false);
         }
      }
      
   }
   
   /**
    * creates button and give actionlistener
    * @return button
    */
   private JButton makeButton()
   {
      JButton button = new JButton();
      button.addActionListener(new ButtonListener());
      return button;
   }
   
}
