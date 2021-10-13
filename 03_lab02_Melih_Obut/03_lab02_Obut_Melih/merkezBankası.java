import java.util.ArrayList;
import cs1.SimpleURLReader;
/**
 * Program that return a non-html version of the text.
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class merkezBankası extends MySimpleURLReader {
   
   public merkezBankası(String url) {
      super(url);
      url=url;
   }

   /* 
    * returns the url String used to create the SimpleURLReader object
    * 
    * @return url
    */
   public String getUrl(){
      return url;
   }
   
   /* that returns the filename part of the url ,i.e, the part of the url
    * following the last '/' character
    * 
    * @return url.substring(i+1,url.length()
    */
   public String getName(){
      boolean there = false;
      int i = 0;
      for(i = url.length() - 1; (!there) && i > 0; i--){
         if(url.charAt(i)=='/'){
            there = true;
         }
      }
      return url.substring(i+1,url.length());
   }
   
   /*
    * fixes the text without any html code
    * 
    * @return finalString
    */
   
   @Override
   public String getPageContents(){
      String finalString = "";
      boolean check = false;
      int length = super.getPageContents().length();
      int a = 0;  //first index
      int b = 0;  // last index
      
      for (int i = 0; i < getUnfilteredPageContents().length(); i++) {
         
         if (getUnfilteredPageContents().charAt(i) == '<') {
            a = i;
         }
         if (getUnfilteredPageContents().charAt(i) == '>') {
            b = i;
            
         }
         
         if (a != 0 && b != 0) {
            finalString += getUnfilteredPageContents().substring(b + 1, a);
            
            a = 0;
            b = 0;
         }
      }
      return finalString;
   }
   /*
    * Return the original page with html codes.
    *  
    *@return getPageContents 
    */   
   public String getUnfilteredPageContents(){
      return super.getPageContents();
   }
}
