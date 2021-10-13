import cs1.SimpleURLReader;
/**
 *Simple URL reader test program which show content and line number.
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class test_SimpleURLReader {
       public static void main(String args[])
   {
      //constants
      //variables
      SimpleURLReader s1; 
      s1 = new SimpleURLReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.txt");
      
      //program code
      System.out.println(s1.getPageContents());
      System.out.println("------------------------------------");
      System.out.println(s1.getLineCount());
   }
}