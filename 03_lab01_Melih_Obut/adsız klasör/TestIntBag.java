import java.util.*;

/**
 * IntBag allows a variable sized collection of integer values be stored.
 * @author melihobut
 * @date 15.02.2020
 */

public class TestIntBag {
   public static void main (String [] args) {
      Scanner scan = new Scanner(System.in);
      IntBag testIntBag = null;
      int option;
      int singlevalue = 0;
      int numRem = 0;
      IntBag newInt = new IntBag();
      //Menu
      do {
         System.out.println("1- Create a new empty collection with specified  max capacity");
         System.out.println("2- Read a set of positive values into the collection (use negat,ve to indicate all the values have been entered.)");
         System.out.println("3- Print the collection of values.");
         System.out.println("4- Add a value to the collection of values at a specified location");
         System.out.println("5- Remove the value at a specified location from the collection of values");
         System.out.println("6- Read a single test value");
         System.out.println("7- Compute the set of locations of the test value within the collection");
         System.out.println("8- Print the set of locations");
         System.out.println("9- Quit");
         System.out.print("Please choose one of these option: ");
         option = scan.nextInt();
         
         // create the IntBag with specified size
         if(option == 1) {
            System.out.println("Enter max capacity");
            int maxCap = scan.nextInt();
            System.out.println(maxCap);
            testIntBag = new IntBag(maxCap);
            //testIntBag = new IntBag();
         }
         // read new values from the user
         else if(option == 2){
            System.out.println("Enter a list with one space and last one must be -1.");
            int elem = scan.nextInt();
            
            while (elem != 0) {
               if (elem < 0){
                  System.out.println("Please add ONLY positive integers");
                  elem = 0;
               }
               else {
                  testIntBag.add(elem);
                  elem = scan.nextInt();
               }
            }
         }
         // print the collection
         else if(option == 3) {
            // We have toString() method to print this array directly
            System.out.println(testIntBag);
            
         }
         //add a value to a specific location of values
         else if(option == 4){
            System.out.println("Enter value then with space enter index to add the list.");
            int value = scan.nextInt();
            System.out.print( "Enter the index ");
            int index = scan.nextInt();
            testIntBag.add(value, index);
         }
         // remove element
         else if(option == 5) {
            System.out.println("Enter a value to remove from list.");
            int index = scan.nextInt();
            testIntBag.remove(index);
            
         }
         //read a single test value and remove it from the bag.
         
         else if(option == 6)
         {
            System.out.println("Enter read a single test value");
            numRem = scan.nextInt();
            
         }
         else if(option ==7){
            
            newInt = testIntBag.findAll(numRem); 
         }
         else if(option ==8){
            System.out.println(newInt);
         }
         
         
      }while(option != 9);
      
      System.out.println("DONE!");
   }
}

