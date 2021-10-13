/* Serhat Gürgenyatağı
 * Gökberk Beydemir
 * Doruk Kantarcıoğlu
 * Efe Ertürk
 * Doruk Onur Çalışkan
 */
public int tryThis( char letter )
{
   //variables
   boolean existsInAllLetters;
   boolean existsInUsedLetters;
   int occurrence;
   
   //program code
   existsInAllLetters = false;
   existsInUsedLetters = false;
   occurrence = 0;
   
   //checks whether the game is over
   if ( isGameOver() )
      return -3;
   
   //checks whether the letter exists in english alphabet
   for (int n = 0; n < allLetters.length(); n++)
   {
      if ( letter == allLetters.charAt(n))
         existsInAllLetters = true;
   }
   if ( !existsInAllLetters )
      return -1;
   
   //checks whether the letter has been already used
   for ( int n = 0; n < usedLetters.length(); n++ )
   {
      if ( letter == usedLetters.charAt(n) )
         existsInUsedLetters = true;
   }
   if ( existsInUsedLetters )
      return -2;
   
   //counts the number of the occurrences of the letter in the secret word
   for ( int n = 0; n < secretWord.length(); n++ )
   {
      if ( letter == secretWord.charAt(n) )
         occurrence++;
   }
   
   //if it is an incorrect try increases the number of incorrrect tries
   if ( occurrence == 0 )
      numberOfIncorrectTries++;
   
   //returns the number of occurrences
   return occurrence;
}
