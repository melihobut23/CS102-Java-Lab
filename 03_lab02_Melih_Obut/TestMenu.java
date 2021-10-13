import java.util.ArrayList;
import java.util.Scanner;
import cs1.SimpleURLReader;
/**
 *A simple menu-driven program
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class TestMenu {
   
   public static void main(String[] args) {
      
      Scanner scan;
      String url;
      int input;
      ArrayList<MySimpleURLReader> list;
      int index;
      
      list = new ArrayList<MySimpleURLReader>();
      scan = new Scanner(System.in);
      
      do {
         
         System.out.println("-----------------------------------------------------");
         
         System.out.println("(1) Enter the url of poem to add to collection");
         System.out.println("(2) List all poems in the collection ");
         System.out.println("(3) Quit ");
         
         System.out.println("-----------------------------------------------------");
         
         System.out.println("Please enter your choice :");
         input = scan.nextInt();
         
         scan = new Scanner(System.in);
         
         if (input == 1) {
            scan.nextLine();
            System.out.println("Enter the url of the poem to add to collection.");
            url = scan.nextLine();
            boolean found = true;
            String temp = "";
            // this loop begins with the end of the url and it should continue when it comes
            // to comma.
            for (int i = url.length() - 1; found & i >= 0; i--) {
               if (url.charAt(i) == '.') {
                  found = false;
               } else {
                  temp = url.charAt(i) + temp;
               }
            }
            // creating an HTMLFilteredReader object
            if (temp.equals("html") || temp.equals("htm")) {
               HTMLFilteredReader url_1 = new HTMLFilteredReader(url);
               list.add(url_1);
               // creating MySimpleURLReader object
            } else if (temp.equals("txt")) {
               MySimpleURLReader url_2 = new MySimpleURLReader(url);
               list.add(url_2);
            }
         }
         else if(input ==2){
            for (int i=0 ; i<list.size(); i++){
               System.out.println("--" + i +"--" + list.get(i).getName());
               System.out.println( list.get(i).getPageContents());
            }
            
            
            System.out.println("please enter the index :");
            index = scan.nextInt();
            
            if(index<list.size() && index >=0){
               System.out.println(list.get(index).getPageContents());
               System.out.println("--------------------------------------");
            }else if( index == list.size()){
               
            }else
               System.out.println("invalid input!");
            
         }
         
      } while (input != 3);
      
   }
   
}