/*
 * Class that returns numbers which are strictly increasing 
 * 
 * @date 25.04.2020
 * @author melihobut
 */
import java.util.Scanner;

public class printReverse { 
   public static void main(String args[]){ 
      //Properties
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a string");
      String input = scan.nextLine();
      printReverse obj = new printReverse(); 
      obj.reverse(input);
      obj.forward(input);
   }  
   /**
    * reverse method 
    * @param input 
    * 
    */
   public static void reverse(String input) {  
      if ((input==null)||(input.length() <= 1)) {
         System.out.println(input); 
      }
      else{ 
         System.out.print(input.charAt(input.length()-1)); 
         reverse(input.substring(0,input.length()-1)); 
      } 
   }
} 