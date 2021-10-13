import java.util.Scanner;
/*
 * This class includes a main method for the Hangman game.
 * This class plays the hangman game
 * It includes rules menu 
 * 
 * @author Melih Obut
 */
public class main{
   public static void main( String [] args )
   {
      Scanner scan = new Scanner(System.in);
      //Constants
      
      // variables
      Hangman hangman = new Hangman();
      String letter;
      int result;
      
      //Welcome the player and shows the rules 
      System.out.println( "              Welcome to the HANGMAN GAME!" );
      System.out.println( "Rules: " );
      System.out.println( "1.You need to guess the secret word by choosing letters." );
      System.out.println( "2.After every guess (according to the accuracy of your guess) incomplete state of secret word will be displayed." );
      System.out.println( "3.Maximum incorrect letter guess amount is defaultly 6." );
      System.out.println( "4.If you guess the secret word before the maximum incorrect letters amount you win." );
      System.out.println( "5.If you can't, you lose and the secret word will be displayed.\n\n" );
      
      
      // displaying the secret word
      do {
         System.out.println();
         System.out.println("Secret Word is :" + hangman.getKnownSoFar());
         System.out.println("Unused letters are :" + hangman.getAllLetters());
         System.out.println("Used letters so far:" + hangman.getUsedLetters());
         System.out.println((6 - hangman.getNumOfIncorrectTries()) + " TRIES LEFT,PLEASE BE CAREFUL!");
         
         // to take the input from the user
         
         System.out.print("Enter a single letter :");
         letter = scan.next();
         
         if (letter.length() != 1) {
            System.out.println("You have to enter a single letter!");
         } 
         else {
            result = hangman.tryThis(letter.charAt(0));
            
            // to check the correction of inputs
            if (result == -1)
               System.out.println("\n"+"Invalid input: " + letter);
            
            else if (result == -2) {
               System.out.println("\n"+"Letter " + letter + " is already used!");
               System.out.println("Please try another letter!");   
            }
            
            else if (result == -3){
               System.out.println("Game Over...");
            }
            
            // if the letter is not in the secret word
            else if (result == 0){
               System.out.println("\n"+"Letter " + letter + " is not in the secretWord.");   
            }
            
            else if( !( hangman.hasLost() ) ){
               System.out.println( "The letter you choosed " + letter + " is in the word " + result + " times." );
            }  
         }
      } while (!hangman.isGameOver()); 
      //out of do loop
      
      if (hangman.knownSoFar.toString().equals(hangman.secretWord.toString()))
         System.out.println(" You Win! ");
      else
         System.out.println(" You Lost! :((");
      System.out.println("The Secret Word was " + hangman.secretWord.toString());
   }
   
}//End of main method

