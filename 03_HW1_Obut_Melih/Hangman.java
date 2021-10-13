import java.util.*;
import java.util.Scanner;
public class Hangman{
   
   //properties
   String secretWord;
   StringBuffer allLetters;
   StringBuffer usedLetters;
   StringBuffer knownSoFar;
   StringBuffer enteredLetter;
   int numberOfIncorrectTries;
   int maxAllowedIncorrectTries; 
   String a;
   public  Hangman(){
      
      this.allLetters = new StringBuffer( "ABCDEFGHIJKLMNOPQRSTUVWXYZ" );
      this.maxAllowedIncorrectTries = 6;
      this.numberOfIncorrectTries = 0;
      this.usedLetters = new StringBuffer();
      this.secretWord = chooseSecretWord();
      this.knownSoFar = new StringBuffer( secretWord.length() );
      for( int i = 0; i < this.secretWord.length(); i++)
         this.knownSoFar.append( '*' );
   }
   /*
    * This is a method that return all letters
    * @return allLetters
    * 
    */
   public String getAllLetters(){
      return allLetters.toString();
   }
   /*
    * This is a method that return all used letters
    * @return usedletters
    * 
    */
   public String getUsedLetters(){
      return usedLetters.toString();
   }
   
   /*
    * This is a method that return number of ýncorrect tries
    * @return numberOfIncorrectTries
    * 
    */
   public int getNumOfIncorrectTries(){
      return numberOfIncorrectTries;
   }
   
   /*
    * This is a method that return max allowed ýncorrect tries
    * @return maxAllowedIncorrectTries
    * 
    */
   public int getMaxAllowedIncorrectTries(){
      return maxAllowedIncorrectTries;
   }
   /*
    * This is a method that return letters known so far
    * @return knownSoFar
    * 
    */
   public String getKnownSoFar(){
      return knownSoFar.toString();
   }
   /**
    * @param letter 
    * @return
    */
   public int tryThis (char letter)
   {      
      int returnnum = 0;
      int counter = 0;
      
      if ((letter > 64 && letter < 91) || (letter > 96 && letter < 123)) {
         
         if (!hasLost()) {
            
            String used = getUsedLetters();
            char[] usedletters = used.toLowerCase().toCharArray();
            String all = getAllLetters();
            char[] allletters = all.toLowerCase().toCharArray();
            String secret = secretWord.toString();
            char[] secretW = secret.toLowerCase().toCharArray();
            
            int lengthused = usedletters.length;
            int lengthall = allletters.length;
            int lengthSec = secretW.length;
            int knownCount = 0;
            
            for (int i = 0; i < lengthused; i++)
               if (letter == usedletters[i])
               counter++;
            
            if (counter > 0)
               returnnum = -2; // Letter is already used!
            
            else {
               for (int i = 0; i < lengthSec; i++) {
                  if (secretW[i] == letter) {
                     knownCount++;
                     knownSoFar.replace(i, i + 1, String.valueOf(letter));
                     usedLetters.append(letter);
                     
                     for(int count=0; count<lengthall;count++){
                        if(letter==allletters[count]){
                           allLetters.delete(count,count+1);
                        }
                     }
                     /*
                      * BURADA ALL LETTERSDAN BU HARFİ SİLMEM GEREKİYOR
                      * Kİ KULLANICI KULLANILMAMIŞ KALAN HARFLERİ
                      * GÖREBİLSİN
                      */
                  }
                  returnnum = knownCount;
               }
               if (knownCount == 0) {
                  numberOfIncorrectTries++;
                  usedLetters.append(letter);
                  returnnum = knownCount;
               }
               
            }
            
         }
         
         else
            returnnum = -3; // The Game is OVER!
         
      }
      
      else
         returnnum = -1; // The input is invalid!!
      
      return returnnum;
      
   }
   
   /**
    * Checks whether the game has ended
    * @return true - if the game has already ended, false - otherwise
    */
   
   public boolean isGameOver(){
      boolean result;
      
      result = false;
      
      if ((numberOfIncorrectTries >= maxAllowedIncorrectTries)
             || (knownSoFar.toString().equals(secretWord.toString()))) {
         
         result = true;
      }
      
      return result;
   }
   
   
   /**
    * Checks whether the game is lost
    * @return true - if the game is lost, false - otherwise
    */
   public boolean hasLost() {
      if ( numberOfIncorrectTries == maxAllowedIncorrectTries ) {
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * a method that reads set of Strings and forms a String in it.
    * @return a random String from the Array
    */
   private static String chooseSecretWord() {
      
      String[] words;
      String word;
      int number;
      
      words = new String[]{"sudden" ,"table","value","right","human"};
         number= (int) ( Math.random() * words.length ); 
         word= words[number];
         return word;
         }
} 