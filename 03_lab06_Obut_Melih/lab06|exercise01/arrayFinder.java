
/*
 * Recursive Java program to search x in array 
 * 
 * @melihobut
 * @25.04.2020
 */
public class arrayFinder 
{
   // Function to find first occurrence of a given number
   // in sorted array of integers
   public static int findFirstOccurrence(int[] A, int x)
   {
      // search space is A[left..right]
      int left = 0;
      int right = A.length - 1;
      
      // initialize the result by -1
      int result = -1;
      
      // iterate till search space contains at-least one element
      while (left <= right)
      {
         // find the mid value in the search space and
         // compares it with key value
         int mid = (left + right) / 2;
         
         // if key is found, update the result and
         // go on searching towards left (lefter indices)
         if (x == A[mid]) {
            result = mid;
            right = mid - 1;
         }
         
         // if key is less than the mid element, discard right half
         else if (x < A[mid]) {
            right = mid - 1;
         }
         
         // if key is more than the mid element, discard left half
         else {
            left = mid + 1;
         }
      }
      
      // return the leftmost index or -1 if the element is not found
      return result;
   }
   
   // Function to find last occurrence of a given number
   // in sorted array of integers
   public static int findLastOccurrence(int[] A, int x)
   {
      // search space is A[left..right]
      int left = 0;
      int right = A.length - 1;
      
      // initialize the result by -1
      int result = -1;
      
      // iterate till search space contains at-least one element
      while (left <= right)
      {
         // find the mid value in the search space and
         // compares it with key value
         int mid = (left + right) / 2;
         
         // if key is found, update the result and
         // go on searching towards right (higher indices)
         if (x == A[mid]) {
            result = mid;
            left = mid + 1;
         }
         
         // if key is less than the mid element, discard right half
         else if (x < A[mid]) {
            right = mid - 1;
         }
         
         // if key is more than the mid element, discard left half
         else {
            left = mid + 1;
         }
      }
      
      // return the leftmost index or -1 if the element is not found
      return result;
   }
   public int[] AllIndexesRecursive(int input[], 
                                    int x, int start) 
   { 
      // If the start index reaches the 
      // length of the array, then 
      // return empty array 
      if (start == input.length) { 
         int[] ans = new int[0]; // empty array 
         return ans; 
      } 
      
      // Getting the recursive answer in 
      // smallIndex array 
      int[] smallIndex = AllIndexesRecursive(input, x, 
                                             start + 1); 
      
      // If the element at start index is equal 
      // to x then 
      // (which is the answer of recursion) and then 
      // (which came through recursion) 
      if (input[start] == x) { 
         int[] myAns = new int[smallIndex.length + 1]; 
         
         // Put the start index in front 
         // of the array 
         myAns[0] = start; 
         for (int i = 0; i < smallIndex.length; i++) { 
            
            // Shift the elements of the array 
            // one step to the right 
            // and putting them in 
            // myAns array 
            myAns[i + 1] = smallIndex[i]; 
         } 
         return myAns; 
      } 
      else { 
         
         // If the element at start index is not 
         // equal to x then just simply return the 
         // answer which came from recursion. 
         return smallIndex; 
      } 
   } 
   
   public int[] AllIndexes(int input[], int x) 
   { 
      
      return AllIndexesRecursive(input, x, 0); 
   }
   public static void main(String[] args)
   {
      arrayFinder arr = new arrayFinder(); 
      int[] A = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
      int key = 5;
      
      int index = findFirstOccurrence(A, key);
      int lastindex = findLastOccurrence(A,key);
      if (index != -1) {
         System.out.println("First occurrence of element " + key +
                            " is found at index " + index);
      } else {
         System.out.println("Element not found in the array");
      }
      if (lastindex != -1) {
         System.out.println("First occurrence of element " + key +
                            " is found at index " + lastindex);
      } else {
         System.out.println("Element not found in the array");
      }
      
      // Printing the output array 
      int output[] = arr.AllIndexes(A, key); 
      System.out.print("All indexes of " + key +" are " );
      for (int i = 0; i < output.length; i++) { 
         System.out.print(output[i] + " "); 
      } 
      
   }
}