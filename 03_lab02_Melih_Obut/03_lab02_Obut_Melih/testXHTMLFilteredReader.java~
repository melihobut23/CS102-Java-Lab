import cs1.SimpleURLReader;
/**
 * Using the String class methods indexOf & substring, 
 * to extract all of the link_url's and put them into an ArrayList
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class testXHTMLFilteredReader 
{
   
   public static void main(String[] args) 
   {
      
      XHTMLFilteredReader supRead = new XHTMLFilteredReader("http://www.cs.bilkent.edu.tr/%7Edavid/index.html");
      
      for(int i = 0 ; i< supRead.getLinks().size();i++){
         System.out.println(supRead.getLinks().get(i));
      }
      System.out.println();
      System.out.println("Overhead is" + supRead.overHead());
   }
   
}