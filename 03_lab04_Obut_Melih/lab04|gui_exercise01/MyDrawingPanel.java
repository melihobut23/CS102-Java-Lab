import javax.swing.*;
import java.awt.*;

/**
 * MyDrawingPanel
 * @author melih obut
 * @version 31/03/2020
 */ 
public class MyDrawingPanel  extends JPanel {
   JPanel panel;
   // constructors
   public MyDrawingPanel()
   {
      setSize( 300, 250);
      setLayout( new GridLayout( 2, 3) );
      setBackground(Color.YELLOW);
      add( new JLabel("NABER") );
   }
   public MyDrawingPanel(int h, int w)
   {
      setSize( h, w);
      setLayout( new GridLayout( 2, 3) );
      setBackground(Color.WHITE);
      add( new JLabel("KANKA"),BorderLayout.EAST );
      
   }
   public void setColorBlack(){
   setBackground(Color.BLACK);
   } 
   public void setColorWhıte(){
   setBackground(Color.WHITE);
   } 
}
