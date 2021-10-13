/**
 * chooseSecretWord methods
 * @authors Ahmet Hakan Yýlmaz, Akýn Kutlu, Ebrar Bozkurt, Zehra Erdem, Esat Tök, Arda Güven Çiftçi
 * @version 12.02.2020
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Hangman
{
   /**
    * choose secret word from fixed array
    * @return StrignBuffer choosen randomly from list
    */
  public StringBuffer chooseSecretWord()
  {
    
    StringBuffer[] words;
    StringBuffer word;
    int number;
    
    words = new StringBuffer[5];
    
    words[0] = new StringBuffer( "sudden" );
    words[1] = new StringBuffer(  "table");
    words[2] = new StringBuffer( "value");
    words[3] = new StringBuffer( "right");
    words[4] = new StringBuffer( "human");
    
    number= (int) ( Math.random() * words.length );
    
    word= words[ number ];
    
    return word;
  }
   
   /**
    * choose secret word from a text
    * @return StringBuffer choosen randomly fom text
    */
//  public StringBuffer chooseSecretWord()
//  {
//     ArrayList<String> list;
//     String words;
//     StringBuffer word;
//     
//     list = new ArrayList<String>();
//     
//     File testFile = new File("words.txt");
//     
//     // try/catch is used to prevent exception errors during compile
//     try 
//     {
//        Scanner scan = new Scanner( testFile );
//        
//        while ( scan.hasNext() )
//        {
//           words = scan.next();
//           list.add( words );
//        }
//     } catch ( FileNotFoundException e )
//     {
//        e.printStackTrace();
//     }
//     
//     word = new StringBuffer ( list.get( (int) (Math.random() * list.size() ) ) );
//     
//     return word;
//  }
  
}