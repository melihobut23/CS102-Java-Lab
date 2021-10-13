/*
 * Recursive Java program to find max in array 
 * 
 * @melihobut
 * @25.04.2020
 */
public class maxNumber{
   public static void main(String[] args){
      int arr[] = new int[5];
      arr[0] = 10;
      arr[1] = 60;
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
      System.out.print(findMax(arr, arr.length-1));
   }
   
   /*
    * findMax method looking for the max element
    * @param arr, index
    */
   public static int findMax(int[] arr, int index) {
      if (index > 0) {
         return Math.max(arr[index], findMax(arr, index-1));
      } 
      else {
         return arr[0];
      }
   }
}