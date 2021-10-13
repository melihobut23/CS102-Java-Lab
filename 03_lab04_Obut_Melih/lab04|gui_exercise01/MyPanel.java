import javax.swing.*;
import java.awt.*;
/**
 *  
 * @author Melih Obut
 * @version 31.03.2020
 */ 
public class MyPanel extends JPanel
{
   // properties

   // constructors
   public MyPanel()
   {
      JButton b;

      setSize( 200, 200);
      setLayout( new GridLayout( 2, 3) );
      
      add( new JLabel( "Welcome to ZOOM") );
      
      b = new JButton( "OK");
      add( b);
      add( new JButton( "Good luck with Maths! ") );
      
      add( new TextField( 25) );      
   }

     
}