package NumGuess;
import java.util.Scanner;

/* ******** NUMBER GUESSER ********
 *    by harryse7en, 10/30/2008
 * 
 * This Java application was created for CTU course #IT171
 */


public class GameRunner {

    public static void main( String[] args ) {

        // Greet user
        System.out.println( "Welcome to IT171's GUESS THAT NUMBER!\n" );
        
        Game newgame = new Game();
        
        // Display the rules
        newgame.rules();
        
        // Ask user if they want to play
        System.out.println( "Do you want to play now? (1 = Yes / 0 = No) " );
        Scanner playControl = new Scanner ( System.in );
        int doPlay = playControl.nextInt();
        
        // Loops play as long as doPlay = 1
        while (doPlay == 1) {
            newgame.play();
            System.out.println( "Do you want to play again? (1 = Yes / 0 = No) " );
            doPlay = playControl.nextInt();
        }
        
        // Display goodbye message
        System.out.println( "Good Bye. Thank you for playing.\n\n" );   
    }
}
