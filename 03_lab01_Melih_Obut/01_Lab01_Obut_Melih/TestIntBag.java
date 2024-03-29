/*
 * Test intBag
 * 
 * @Author Melih Obut
 * @Date 9.10.2019
 */
import java.util.*;
public class TestIntBag {
public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    IntBag testIntBag = null;
    int option;
    int singlevalue = 0;
  
    //Menu
    do {
      System.out.println("1. Create a new empty collection with capacity of 4 (any previous values are lost!)");
      System.out.println("2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
      System.out.println("3. Print the collection of values.");
      System.out.println("4. Add a value to the collection of values at a specified location");
      System.out.println("5. Remove the value at a specified location from the collection of values");
      System.out.println("6. Read a single test value and remove it from the bag.");
      System.out.println("7. Quit the program.");
      System.out.println();
      System.out.print("Please choose one of these option: ");
      option = scan.nextInt();
    
      // create the IntBag with specified size
      if(option == 1) {
 
        testIntBag = new IntBag();
      }
      // read new values from the user
      else if(option == 2){
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
        System.out.print("value: ");
        int value = scan.nextInt();
        if (value < 0 )
          System.out.println("please enter ONLY positive integers.");
        else{
          System.out.print("index: ");
          int index = scan.nextInt();
          testIntBag.add(value,index);
          System.out.println(testIntBag);
        }
      }
      // remove element
      else if(option == 5) {
        System.out.print("Index: ");
        int index = scan.nextInt();
        testIntBag.remove(index);
        System.out.println(testIntBag);
      }
      //read a single test value and remove it from the bag.
      else if(option == 6) {
        System.out.println("Please enter the value which you want to find and delete: ");
        singlevalue = scan.nextInt();
        testIntBag.removeAll(singlevalue);
        System.out.println(testIntBag);
     
      }
    
    //exitig the loop
    } while(option != 7);
    System.out.println("Done!");
}
}

