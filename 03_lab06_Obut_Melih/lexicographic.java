import java.util.*;

public class lexicographic {
   /*
    * Class that returns lexicographicly ordered list
    * 
    * @date 25.04.2020
    * @author melihobut
    */
   public static ArrayList<String> alist = new ArrayList<String>();
   public static void main(String[] args) {
      
      alist.add("melih");
      alist.add("cs");
      alist.add("lab");
      boolean list= order(0,1);
      System.out.println(list);  
   }
   /*
    * order checking the order of the elements
    * @param i,j
    * 
    */
   public static boolean order(int i, int j) {
      int compare = alist.get(i).compareTo(alist.get(j)); 
      //if ith element is smaller in alphabetical order it return -1
      if (compare < 0) {  
         i++;
         j++;
         
         if(j < alist.size()){ //checking for the j is smaller than size of list
            order(i,j); 
         }
         return true;
      }
      else {
         return false;
      }
   }
}