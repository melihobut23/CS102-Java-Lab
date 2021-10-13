import javax.swing.*;
import java.awt.*;
import java.util.*;
/**
 * Main Menu
 * @author melihobut
 * @date 07.04.2020
 */
public class lab04b extends JFrame{
   public lab04b(){
      setTitle("Balloons Game");
      setDefaultCloseOperation(3);
      setLayout(new FlowLayout());
      BalloonsGamePanel balloonGame = new BalloonsGamePanel();
      add(balloonGame);
      pack();
      setVisible(true);
   }
   
   public static void main(String[] args){
      System.out.println("Balloons...");
      new lab04b();  
   }  
}
