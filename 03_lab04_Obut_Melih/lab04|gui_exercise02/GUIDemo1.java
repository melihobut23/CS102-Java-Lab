import java.util.Scanner;
import java.awt.*;
// import java.awt.Button;

/**
 * GUIDemo1
 * @author Sec03
 * @version 13/03/2020
 */ 
public class GUIDemo1
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Frame  f;
      Panel  d;
      Button b;

      // program code
      System.out.println( "Start...");

      //f = new MyFrame();
      d = new MyPanel();


      System.out.println( "End.");
   }

}