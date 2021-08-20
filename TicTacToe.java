import java.util.Scanner;

/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    /**
     * Constants
     */
    private static final Scanner SC = new Scanner(System.in);

    /**
     * String[][] board
     * Represents the tic-tac-toe game board. A 3x3 grid. Blank squares are 
     * represented by " - " strings.
     * 
     * int turnsLeft
     * The number of turns remaining. When this is 0, the game is declared a
     * draw. Since there are only 9 total moves players can make in one game, 
     * this should be initialized to 9 at the start of every game.
     * 
     * int activePlayer
     * Represents the currently active player. Encoded as 1 for Player One 
     * and 2 for Player Two. Initialize this in setupGame() by "flipping a 
     * coin".
     * 
     * String winner
     * Represents the current winner. By default this is "" or an empty 
     * string. After each round of play, the game should check to see if 
     * someone has won, in which case this variable will hold a value of "X" 
     * or "O".
     * 
     * boolean quit
     * Represents if the player has chosen to quit the game (true) or not
     * (false).
     */
    private static String[][] board; 
    private static int turnsLeft; 
    private static int activePlayer;
    private static String winner; 
    private static boolean quit;

    /**
     * Prints a simple greeting. Be as creative as you want here. Be sure to 
     * include your name as the author!
     */
    public static void printGreeting() {

    }

    /**
     * Fill the 2D board array with " - " strings (which represent empty 
     * spaces).
     */
    public static void resetBoard() {

    }

    /**
     * Initialize global variables as follows:
     * -initialize board as a 2D array of null values, with 3 rows and 3 
     *  columns.
     * -call resetBoard() to fill the board with " - " (which represent empty 
     *  spaces).
     * -set activePlayer to either 1 or 2 ("coin flip"): 
     *  (int) Math.floor(Math.random() * 2 + 1)
     * -set winner to an empty string ""
     * -set quit to false
     */
    public static void setupGame() {

    }

    /**
     * Print the tic-tac-toe board to the terminal so the player can see it.
     */
    public static void printBoard() {

    }

    /**
     * Check each individual row for a win. If "X" has won, return "X". 
     * If "O" has won, return "O". If no one has won, return an empty 
     * string "".
     */
    public static String checkRows() {

    }

    /**
     * Check each individual column for a win. If "X" has won, return "X". 
     * If "O" has won, return "O". If no one has won, return an empty string 
     * "".
     */
    public static String checkColumns() {

    }

    /**
     * Check from the top left square to the bottom right square for a win. 
     * If "X" has won, return "X". If "O" has won, return "O". If no one has 
     * won, return an empty string "".
     */
    public static String checkLeftDiag() {

    }

    /**
     * Check from the top right square to the bottom left square for a win. 
     * If "X" has won, return "X". If "O" has won, return "O". If no one has 
     * won, return an empty string "".
     */
    public static String checkRightDiag() {

    }

    /**
     * Call all four "check" functions to determine if a player has won or if 
     * the game should keep going. If "X" has won, return "X". If "O" has won, 
     * return "O". If no one has won, return an empty string "".
     */
    public static String checkWon() {

    }

    /**
     * Ask the currently active player to choose a row and then a column. 
     * Validate their input to make sure they aren't entering bad inputs 
     * (only 0, 1, or 2 should be accepted). If a player chooses a square 
     * that is not blank (" - "), they should be made to choose again, until 
     * they choose a blank square.
     * 
     * After the player chooses a valid square, set it to " X " or " O " 
     * accordingly (mind the spaces!). Then switch the active player to the 
     * other player.
     */
    public static void chooseRowColumn() {

    }

    /**
     * While turnsLeft is greater than 0 and the winner variable is set to an
     * empty string, do the following in an endless loop:
     * 1) Print the board.
     * 2) If the winner is "X", print "X wins!"
     * 3) Otherwise, if the winner is "O", print "O wins!".
     * 4) Otherwise, no one has won, so call chooseRowColumn() and decrement
     *    turnsLeft.
     *    
     * Outside of the loop, check if turnsLeft is 0. If so, print the board, 
     * then print "DRAW!".
     * 
     * Finally, the game is over at this point. So ask players if they would 
     * like to play again (just as you did in Nim). If they answer anything 
     * other than "yes" or "y" (or whatever else you want), set quit to true.
     */
    public static void playGame() {
 
    }

    /**
     * The "mother function" of the program. Runs the game by doing the 
     * following:
     * 1) Print a greeting.
     * 2) While quit is set to false, do the the following:
     *    A) Setup the game.
     *    B) Play the game.
     * 3) Outside the loop above, print a "Goodbye" message.
     */
    public static void main(String[] args) {

    }
}
