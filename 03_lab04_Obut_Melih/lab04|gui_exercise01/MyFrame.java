import javax.swing.*;
import java.awt.*;
/**
 *  
 * @author Melih Obut
 * @version 31.03.2020
 */ 
public class MyFrame extends JFrame
{
   // properties

   // constructors
   public MyFrame()
   {
      JButton b;
      //MyPanel  p= new MyPanel();
      MyDrawingPanel a = new MyDrawingPanel();
      //a.setVisible(false);
      MyDrawingPanel c = new MyDrawingPanel(400,500);
      a.setLayout( new GridLayout(4,4) );
      a.setColorWhıte();
      c.setColorBlack();
      //p.setLayout( new GridLayout(4,4) );
      add(a);
      add(c);
      //add( p);
      
      pack();
      setVisible( true );      
   }
   


}