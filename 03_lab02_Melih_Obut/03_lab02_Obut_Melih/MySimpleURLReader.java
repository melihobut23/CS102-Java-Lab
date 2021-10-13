import cs1.SimpleURLReader;
/**
 *Program that return name of url and content of the url. 
 * Also replace the null element at the beginning of the text.
 * 
 * @author melihobut
 * @date 29.02.2020
 */
public class MySimpleURLReader extends SimpleURLReader {
   //constants
   
   //variables
   String url;
   
   //program code
   public MySimpleURLReader(String url) {
      super(url);
      this.url=url;
   }
   
   /* 
    * returns the url String used to create the MySimpleURLReader object
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
    * fixes the bug in SimpleURLReader's getPageContents() method whereby the
    * String "null" is added to the beginning of the String it returns. Do
    * this by overriding the corresponding method in your new sub-class.
    * 
    * @ return null 
    */
   @Override
   public String getPageContents(){
     
     return super.getPageContents().replace("null", "");
   }
}






