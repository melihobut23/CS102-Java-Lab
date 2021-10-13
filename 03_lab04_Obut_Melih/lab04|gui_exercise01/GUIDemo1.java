import javax.swing.*;
import java.awt.*;

/**
 * GUIDemo1
 * @author melih obut
 * @version 31/03/2020
 */ 
public class GUIDemo1
{
   public static void main( String[] args)
   {

      // constants

      // variables
      JFrame  f;
      JPanel a;
      // program code
      System.out.println( "Start...");

      f = new MyFrame();
      a = new MyDrawingPanel();
      System.out.println( "End.");
   }

}