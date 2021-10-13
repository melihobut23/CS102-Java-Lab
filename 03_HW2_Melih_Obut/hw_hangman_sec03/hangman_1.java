/**
 * __the hangman class___ 
 * @author __sec 03, part 5, Onuralp Avcı___
 * @version __12.02.2020__
 */ 

public class hangman {
   //properties
   private int maxAllowedIncorrectTries;
   private int noOfIncorrectTries;

   private StringBuffer usedLetters;
   private StringBuffer allLetters;
   private StringBuffer secretWord;
   private StringBuffer knownSoFar;

   //constructors
   public hangman(){
      //set all letters to English alphabet

      //set max allowed incorrect tries to 6

      //no of incorrect tries to 0

      //used letters to empty set

      // secret word to result of calling choose secret word method

      //knowsofar to StringBuffer of same length as secret word, but all characters are stars ('*').
   }

   //methods
   public String getAllLetters(){
      String allLettersString = allLetters.toString();
      return allLettersString;
   } 

   public String getUsedLetters(){
      String usedLettersString = usedLetters.toString();
      return usedLettersString;
   } 

   public int getNumOfIncorrectTries(){
      return noOfIncorrectTries;
   } 

   public int getMaxAllowedIncorrectTries(){
      return maxAllowedIncorrectTries;
   } 
   
   public String getKnownSoFar(){
      String knownSoFarString = knownSoFar.toString();
      return knownSoFarString;
   } 
   public String chooseSecretWord(){
      return null; // TO BE CHANGED BY THE OTHER GROUPS
   }

   public int tryThis( char letter ){
      return 0; //TO BE CHANGED BY THE OTHER GROUPS
   }

   public boolean isGameOver(){
      return ( noOfIncorrectTries > maxAllowedIncorrectTries || secretWord.toString().equals( knownSoFar.toString()));
   }

   public boolean hasLost(){
      return ( noOfIncorrectTries > maxAllowedIncorrectTries);
   }

}