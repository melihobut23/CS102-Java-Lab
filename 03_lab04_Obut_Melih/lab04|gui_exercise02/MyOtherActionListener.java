import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyOtherActionListener extends Frame implements ActionListener
{
   TextField text = new TextField(20);
   Button b;
   JToggleButton tb;

   
   public static void main(String[] args) {
      MyOtherActionListener myWindow = new MyOtherActionListener();
      myWindow.setSize(350,100);
      myWindow.setVisible(true);
   }
   
   public MyOtherActionListener() {
      
      
      
      super();
      setLayout(new FlowLayout());
      setTitle("JToggleButton ");  
      setLayout(new FlowLayout());  
      
      b = new Button("OK");
      tb = new JToggleButton("ON");  
      add(tb);
      add(b);
      add(text);
      b.addActionListener(this);
      tb.addActionListener(this); 
      setVisible(true);  
      
   }
   
   public void actionPerformed(ActionEvent e) {
      
      text.setText("Button pressed");
      
      if (tb.isSelected())  
      {
         text.setText("OFF"); 
      }
      else
      {
         text.setText("ON");  
      }
   }

   
   public void windowClosing(WindowEvent e) {
      dispose();
      System.exit(0);
   }
}