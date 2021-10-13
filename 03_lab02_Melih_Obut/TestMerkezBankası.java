import cs1.SimpleURLReader;
/**
 * Test program of Merkez banka
 * @author melihobut
 * @date 29.02.2020
 */
public class TestMerkezBankası {
   
   public static void main(String[] args) {
      
      merkezBankası mb = new merkezBankası("https://www.tcmb.gov.tr/kurlar/today.xml");
      
      System.out.println("USA Dollar: " +mb.getPageContents().substring(40,47));
      //System.out.println(mb.getUnfilteredPageContents());

   }
}