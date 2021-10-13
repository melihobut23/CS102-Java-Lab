/**
 * @author
 * @Ya�mur Ery�lmaz 
 * @Mehmet Berk T�rk�apar
 * @O�ulcan �nal
 * @Gamze Elif �enesiz
 * @Melih Obut
 * @�dil Y�lmaz
 * 
 * @date: 12.02.2020
 * Hangman Class that covers methods
 */
public class Hangman{
  
  //properties
  StringBuffer secretWord;
  StringBuffer allLetters;
  StringBuffer usedletters;
  StringBuffer knownSoFar;
  StringBuffer enteredLetter;
  int numberOfIncorrectTries;
  int maxAllowedIncorrectTries; 
  
  public  Hangman(){
    
  }
  /*
   * This is a method that return all letters
   * @return allLetters
   * 
   */
  public StringBuffer getAllLetters(){
    return allLetters;
  }
  /*
   * This is a method that return all used letters
   * @return usedletters
   * 
   */
  public StringBuffer getUsedLetters(){
    return usedletters;
  }
  
  /*
   * This is a method that return number of �ncorrect tries
   * @return numberOfIncorrectTries
   * 
   */
  public int getNumOfIncorrectTries(){
    return numberOfIncorrectTries;
  }
  
  /*
   * This is a method that return max allowed �ncorrect tries
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
  public StringBuffer getKnownSoFar(StringBuffer secretWord, StringBuffer enteredLetter){
    for(int i = 0; i < secretWord.length()-1; i++){
      if(secretWord.charAt(i) == enteredLetter.charAt(0)){
        return knownSoFar;
      }
    }
    return knownSoFar;
  }
  /*
   * 
   * @return
   * 
   */
  public int tryThis(){
    return 0;
  }  
  
  /*
   * This is a method that return false if game is over
   * @return false
   * 
   */
  public boolean isGameOver(){
    if(numberOfIncorrectTries == maxAllowedIncorrectTries && knownSoFar == secretWord){
      chooseSecretWord();
    }
    return false;
  }
  
  /*
   * This is a method that return false if game is lost
   * @return false
   * 
   */
  public boolean hasLost(){
    return numberOfIncorrectTries == maxAllowedIncorrectTries;
    
  }
  
  /*
   * @return secretWord
   * 
   */
  private StringBuffer chooseSecretWord(){
    return secretWord;
  }
} 