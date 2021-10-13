import java.util.Scanner;
import cardgame.*;

// CardGameTest
// author:Melih Obut
// date: 05.03.2020
public class CardGameTest
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        System.out.println( "Start of CardGameTest\n");
        
        // CONSTANTS
        
        // VARIABLES
        Card       c;
        Cards      cards;
        ScoreCard  scores;
        Player     p;
        CardGame   game;
        
        // PROGRAM CODE
        
        // test Card class
        c = new Card( 1);
        System.out.println( c);
        System.out.println();
        
        // test Cards class
        cards = new Cards( true);
        cards.addTopCard( c);
       
        // test ScoreCard class
        scores = new ScoreCard( 4);
        scores.update( 3, 1);
        scores.update( 1, 2);
        System.out.println( "\n" + scores );
        
        // test Player class
        p = new Player("melih");
        p.add(c);
        System.out.println(p.getName().toUpperCase());
        System.out.println(p.playCard());

        
        System.out.println( "\nEnd of CardGameTest\n" );
    }
    
} // end of class CardGameTest
