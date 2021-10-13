  import java.util.ArrayList;
  import cs1.SimpleURLReader;
  /**
   * Program that return a non-html version of the text.
   * 
   * @author melihobut
   * @date 29.02.2020
   */
  public class HTMLFilteredReader extends MySimpleURLReader {
     //constants
     
     //variables
     String url;
     
     //program code
     public HTMLFilteredReader(String url) {
        super(url);
        this.url=url;
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
     

     
      /**This override method gives the text without its html code.
       * @return temp
       */
  @Override
   public String getPageContents() {
    String fullText;
    String temp = "";
    boolean filter = false;
    fullText = super.getPageContents();
    for (int i = 0; i < fullText.length(); i++) {
     //if char is '<' then filter be true.
     if (fullText.charAt(i) == '<')
      filter = true;
     else if (fullText.charAt(i) == '>') {
      filter = false;
      //if the filter is true then add the String temp.
     } else if (!filter) {
      temp = temp + fullText.charAt(i);
     }

    }
    return temp;

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






