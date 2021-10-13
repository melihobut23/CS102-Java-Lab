import javax.swing.*;
/**
 * Main class to display game
 * 
 * @author Melih Obut
 * @date 31.03.2020
 */
public class Launcher {
 public static void main(String[] args)
 {
  JFrame frame = new PotLuckDisplay();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
 }
}
