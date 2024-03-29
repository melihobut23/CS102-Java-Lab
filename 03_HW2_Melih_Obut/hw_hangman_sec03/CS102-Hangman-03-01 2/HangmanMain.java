import java.util.Scanner;

/*
 * This class includes a main method for the Hangman game.
 * This class plays the hangman game
 * It includes rules menu and  
 * 
 * @author Turgut Alp Edis, Gizem G�k�e I��k, Utku G�k�en,
 * Bayram Charyyev, Mikail Ko�
 */
public class HangmanMain
{
   public static void main( String [] args )
   {
      //Constants
      //Variables
      Scanner scan;
      Hangman hangman;
      String guess;
      int gameNumber, request, tryLetterResult;
      
      //Program Code
      request = 1;
      scan = new Scanner(System.in);
      
      //Welcome the player and shows the rules 
      System.out.println( "              Welcome to the HANGMAN GAME!" );
      System.out.println( "Rules: " );
      System.out.println( "1.You need to guess the secret word by choosing letters." );
      System.out.println( "2.After every guess (according to the accuracy of your guess) incomplete state of secret word will be displayed." );
      System.out.println( "3.Maximum incorrect letter guess amount is defaultly 6." );
      System.out.println( "4.If you guess the secret word before the maximum incorrect letters amount you win." );
      System.out.println( "5.If you can't, you lose and the secret word will be displayed.\n\n" );
      
      
      //This while loops lets the user play the game as much as the user wants.
      while( request== 1 ){
         tryLetterResult = 0;
         request =0;
         guess = "";
         
         //Constructing a Hangman object every time player wants to play the game
         hangman = new Hangman();
         
         System.out.println( "Your max allowed incorrect guess amount is: " + hangman.getMaxAllowedIncorrectTries() + " ." );
         
         //The hangman continues to play unless the game is over.
         while( !hangman.isGameOver())
         {
            
            System.out.println( "\n----------------------------------" );
            System.out.println( "Amount of incorrect tries left: " + ( hangman.getMaxAllowedIncorrectTries() - hangman.getNumOfIncorrectTries() ) );
            System.out.println( "----------------------------------" );
            System.out.println( "The letters have been used before: " + hangman.getUsedLetters() );
            System.out.println( "----------------------------------" );
            
            
            System.out.println( "\t" + hangman.getKnownSoFar() + "\n" );
            System.out.println( hangman.getAllLetters() );
            System.out.print( "Please choose and enter the letter you want to guess: " );
            
            //This do-while loop ensures player enters valid inputs
            //return -1 if input is invalid
            //return -2 if input is already occured
            //return -3 or less if input is not correct
            do
            {
               if( tryLetterResult == -1 ){
                  System.out.print( "Invalid input. Please enter one of the letters you see above: " );
               }
               if( tryLetterResult == -2 ){
                  System.out.print( "You have choosen this letter already. Please enter a letter that you didn't guess before: " );
               }
               guess = scan.next();
               tryLetterResult = hangman.tryLetter(guess);
            }while( tryLetterResult != -3 && tryLetterResult < 0 );
            
            //If the user makes correct guess, this message shows.
            if( !( hangman.hasLost() ) )
            {
               System.out.println( "The letter you choosed " + guess + " is in the word " + tryLetterResult + " times." );
            }
            
         }//End of hangman game
         
         //The player wins the game
         if( !(hangman.hasLost()) && hangman.isGameOver() )
         {
            System.out.println( "******CONGRUTULATIONS****** You guessed the secret word.\n" );
            System.out.println( "The secret word was: " + hangman.getKnownSoFar() + "\n" );
            System.out.println( "It took " + hangman.getNumOfIncorrectTries() + " incorrect tries to find the word" );
         }
         
         //The player loses the game with his last letter try
         if( hangman.hasLost() && hangman.isGameOver() )
         {
            System.out.println( "Sorry, but you lost!\n" );
            System.out.println( "The secret word was: " + findSecretWord(hangman) );
         }
         //Ask user to play game again (1 for yes, 0 fot no)
         System.out.print( "\nWould you like to play again? (If yes write \"1\" if not write \"0\"): " );
         request = scan.nextInt();
         
      }//End of outer loop (after the user press 0)
      
      System.out.println( "\n THANKS FOR PLAYING!! Exitting..." );
      
   }//End of main method
   
   /*
    * This method finds the secret word to show it to the user after the game ends.
    * tryLetter method is used to do it
    * !!This is done assuming after the game ends tryThis method can still place the letters inside the secret word
    * 
    * @param secretWord this is an Hangman object used to find the word
    * @return String that is the secret word
    */
   public static String findSecretWord( Hangman secretWord )
   {
      //Constants
      //Variables
      String letter = "";
      String word = "";
      
      //Program Code
      for( int i=0; i < secretWord.getAllLetters().length(); i++ )
      {
         letter = secretWord.getAllLetters().charAt(i) + "";
         secretWord.tryLetter(letter);
      }
      word = secretWord.getKnownSoFar();
      
      return word;
   }
}
  
  
  
  
