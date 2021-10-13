import java.util.Scanner;
/*
 * Class that returns binary equivalent of a decimal number
 * 
 * @date 25.04.2020
 * @author melihobut
 */
public class BinaryCounter{
   public static void main(String[] args){
      //properties
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a decimal number.");
      int decimal = scan.nextInt();
      System.out.println("Binary equilavent of "+ decimal +" is " + binary(decimal));
   }
   /*
    * binary returning number to the binary.
    * @param decimal
    * 
    */
   public static int binary(int decimal ){
      if (decimal == 0){
         return 0;
      }
      else {
         //decimal % 2 gives  1 or 0 and it start from right to the left
         return (decimal % 2 + 10 * binary(decimal / 2));
      }
   }
}