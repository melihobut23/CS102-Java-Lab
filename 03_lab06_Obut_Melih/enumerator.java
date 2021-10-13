import java.util.Scanner;
/*
 * Class that returns numbers which are strictly increasing and even
 * 
 * @date 25.04.2020
 * @author melihobut
 */
public class enumerator 
{ 
   public static void main(String args[])
   { 
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the digit");
      int digit = scan.nextInt();
      even_number(0,0,digit);
   }  
   public static void even_number(int number, int start, int digit) {
      if(digit == 0 && number % 2 ==0){
         System.out.print(" " + number);
      }
      for(int i = (start+1); i < 10; i++){
         even_number((number*10+i),i,digit-1);
      }
   }
   
}

