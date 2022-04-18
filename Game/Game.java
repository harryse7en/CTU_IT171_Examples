package NumGuess;
import java.util.Scanner;
import java.util.Random;

public class Game {

    public void rules() {
                // Display rules of game
        System.out.println( "     --- Here are the rules of the game:" );
        System.out.println( "Enter a number between 1 and 20 and press enter." );
        System.out.println( "If your guess is the same as the computer’s guess, you win!" );
        System.out.println( "If not, then you lose. You only get one guess! Good luck.\n\n" );
    }
    
    public void play() { // The engine that runs the game

        // Prompt user for input / guess
        System.out.print( "Ok, so what is your guess? (Between 1-20)  " );
        Scanner input = new Scanner( System.in );
        int userNum = input.nextInt();

        // Generate a random number (computer’s number) in the range 1-20
        // 1 is added after receiving the random number, change from 0-19 to 1-20
        Random randNum = new Random();
        int cpuNum = 1 + randNum.nextInt(20);

        // If user’s number equals computer’s number display “You Win!”
        if ( userNum == cpuNum ) {
            System.out.println( "\nYou Win!\n\n" );
        } else { // Else display “You Lose!” and the computer’s number
            System.out.printf( "\nYou Lose! The computer guessed %d\n\n", cpuNum );
        }
    }
}
