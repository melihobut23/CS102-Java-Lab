import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyOtherTFActionListener extends Frame implements ActionListener
{
   TextField text = new TextField(20);

   
   public static void main(String[] args) {
      MyOtherTFActionListener myWindow = new MyOtherTFActionListener();
      myWindow.setSize(350,100);
      myWindow.setVisible(true);
   }
   
   public MyOtherTFActionListener() {
      
      super();
      setLayout(new FlowLayout()); 
      add(text);
      text.addActionListener(this);
      setVisible(true);  
      
   }
   
   public void actionPerformed(ActionEvent e) {
      
      text.setText("TextField enter key pressed");
      System.out.println(text);
   }
   
   
   public void windowClosing(WindowEvent e) {
      dispose();
      System.exit(0);
   }
}