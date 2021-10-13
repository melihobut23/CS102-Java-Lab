import java.util.ArrayList;
import cs1.SimpleURLReader;
/**
 *This code is calculating between html and non-html code and 
 * creating an arrayList which includes urls.
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class XHTMLFilteredReader extends HTMLFilteredReader {
   //constants
   //variables
   
   //program code
   public XHTMLFilteredReader(String htm) {
      super(htm);    
   }
   
   /*
    * Creating arraylists and adding the urls with href code to this list
    * 
    * @return list 
    */
   
   public ArrayList<String> getLinks() {
      ArrayList<String> list;
      ArrayList<Integer> listInt;
      ArrayList<Integer> listLast;
      String addList;
      boolean check;
      
      addList = "";
      list = new ArrayList<String>();
      listInt = new ArrayList<Integer>();
      listLast = new ArrayList<Integer>();
      check = true;
      
      for (int i = 0; i < getUnfilteredPageContents().length() - 3; i++) {
         if (getUnfilteredPageContents().substring(i,i+1).equals("h") 
                && getUnfilteredPageContents().substring(i + 1, i+2).equals("r")
                && getUnfilteredPageContents().substring(i + 3, i+4).equals("f")) {
            listInt.add(i + 3); //if the elements are same adding it to list.
         }
      }
      
      for (int i = 0; i < listInt.size(); i++) {
         check = true;
         for (int j = listInt.get(i) + 2; j < getUnfilteredPageContents().length() && check; j++) {
            
            if (getUnfilteredPageContents().charAt(j) == '>') {
               listLast.add(j);
               check = false;
            }
            
         }
      }
      
      for (int i = 0; i < listInt.size(); i++) {
         list.add(getUnfilteredPageContents().substring(listInt.get(i) + 3, listLast.get(i) - 1));
      }
      
      return list;
   }
   
   /*
    * Calculating percentage between html and non-html code
    * 
    * @return getPageContents().length() * 100 / getUnfilteredPageContents().length() 
    */
   
   public double overHead() {
      
      return getPageContents().length() * 100 / getUnfilteredPageContents().length();
   }
   
}