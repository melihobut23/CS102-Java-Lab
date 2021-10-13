import cs1.SimpleURLReader;
/**
 * Simple test program of mySimpleURLReader
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class test_mySimpleURLReader {
       public static void main(String args[])
   {
      //constants
      //variables
      MySimpleURLReader s1; 
      s1 = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.txt");
      
      //program code~
      System.out.println(s1.getPageContents());
      System.out.println("------------------------------------");     
      System.out.println(s1.getName());
      System.out.println("------------------------------------");
      System.out.println(s1.getUrl());
      System.out.println("------------------------------------");

   }
}