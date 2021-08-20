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
        System.out.println("Tic-Tac-Toe");
        System.out.println("By: Hidden Genius");
    }

    /**
     * Fill the 2D board array with " - " strings (which represent empty 
     * spaces).
     */
    public static void resetBoard() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = " - ";
            }
        }
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
        board = new String[][] {
            {null, null, null},
            {null, null, null},
            {null, null, null}
        };
        resetBoard();
        turnsLeft = 9;
        activePlayer = (int) Math.floor(Math.random() * 2 + 1);
        winner = "";
        quit = false;
    }

    /**
     * Print the tic-tac-toe board to the terminal so the player can see it.
     */
    public static void printBoard() {
        System.out.println("  " + " 0 " + " 1 " + " 2 ");
        for(int i = 0; i < board.length; i++) {
            String currentRow = i + " ";
            for(int j = 0; j < board[i].length; j++) {
                currentRow += board[i][j];
            }
            System.out.println(currentRow);
        }
    }

    /**
     * Check each individual row for a win. If "X" has won, return "X". 
     * If "O" has won, return "O". If no one has won, return an empty 
     * string "".
     */
    public static String checkRows() {
        for(int i = 0; i < board.length; i++) {
            int xCount = 0;
            int oCount = 0;
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j].equals(" X ")) {
                    xCount++;
                } else if(board[i][j].equals(" O ")) {
                    oCount++;
                }
            }
            if(xCount == 3) {
                return "X";
            } else if(oCount == 3) {
                return "O";
            }
        }
        return "";
    }

    /**
     * Check each individual column for a win. If "X" has won, return "X". 
     * If "O" has won, return "O". If no one has won, return an empty string 
     * "".
     */
    public static String checkColumns() {
        for(int i = 0; i < board.length; i++) {
            int xCount = 0;
            int oCount = 0;
            for(int j = 0; j < board[i].length; j++) {
                if(board[j][i].equals(" X ")) {
                    xCount++;
                } else if(board[j][i].equals(" O ")) {
                    oCount++;
                }
            }
            if(xCount == 3) {
                return "X";
            } else if(oCount == 3) {
                return "O";
            }
        }
        return "";
    }

    /**
     * Check from the top left square to the bottom right square for a win. 
     * If "X" has won, return "X". If "O" has won, return "O". If no one has 
     * won, return an empty string "".
     */
    public static String checkLeftDiag() {
        int xCount = 0;
        int oCount = 0;
        for(int i = 0; i < board.length; i++) {
            if(board[i][i].equals(" X ")) {
                xCount++;
            } else if(board[i][i].equals(" O ")) {
                oCount++;
            }
        }
        if(xCount == 3) {
            return "X";
        } else if(oCount == 3) {
            return "O";
        }
        return "";
    }

    /**
     * Check from the top right square to the bottom left square for a win. 
     * If "X" has won, return "X". If "O" has won, return "O". If no one has 
     * won, return an empty string "".
     */
    public static String checkRightDiag() {
        int xCount = 0;
        int oCount = 0;
        for(int i = board.length - 1; i >= 0; i--) {
            if(board[i][2 - i].equals(" X ")) {
                xCount++;
            } else if(board[i][2 - i].equals(" O ")) {
                oCount++;
            }
        }
        if(xCount == 3) {
            return "X";
        } else if(oCount == 3) {
            return "O";
        }
        return "";
    }

    /**
     * Call all four "check" functions to determine if a player has won or if 
     * the game should keep going. If "X" has won, return "X". If "O" has won, 
     * return "O". If no one has won, return an empty string "".
     */
    public static String checkWon() {
        String rowWon = checkRows();
        String colWon = checkColumns();
        String leftDiagWon = checkLeftDiag();
        String rightDiagWon = checkRightDiag();
        if(!rowWon.equals("")) {
            return rowWon;
        } else if(!colWon.equals("")) {
            return colWon;
        } else if(!leftDiagWon.equals("")) {
            return leftDiagWon;
        } else if(!rightDiagWon.equals("")) {
            return rightDiagWon;
        } else {
            return "";
        }
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
        String playerName = "X";
        if(activePlayer == 2) {
            playerName = "O";
        }
        boolean validSelection = false;
        while(!validSelection) {
            System.out.print(playerName + ", choose a row: ");
            int row = Integer.parseInt(SC.nextLine());
            while(!(row >= 0 && row <= 2)) {
                System.out.println("Please enter 0, 1, or 2.");
                System.out.print(playerName + ", choose a row: ");
                row = Integer.parseInt(SC.nextLine());
            }
            System.out.print(playerName + ", choose a column: ");
            int column = Integer.parseInt(SC.nextLine());
            while(!(column >= 0 && column <= 2)) {
                System.out.println("Please enter 0, 1, or 2.");
                column = Integer.parseInt(SC.nextLine());
            }
            if(!board[row][column].equals(" - ")) {
                System.out.println("That square is already taken! Try again!");
            } else {
                board[row][column] = " " + playerName + " ";
                validSelection = true;
            }
        }
        if(activePlayer == 1) {
            activePlayer = 2;
        } else {
            activePlayer = 1;
        }
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
        while(turnsLeft > 0 && winner == "") {
            printBoard();
            winner = checkWon();
            if(winner.equals("X")) {
                System.out.println("X wins!");
            } else if(winner.equals("O")){
                System.out.println("O wins!");
            } else {
                chooseRowColumn();
                turnsLeft--;
            }
        }
        if(turnsLeft == 0){
            printBoard();
            System.out.println("DRAW!");
        }
        System.out.print("Play again? (yes or no): ");
        String keepPlaying = SC.nextLine();
        if(!keepPlaying.equals("yes") && !keepPlaying.equals("y")) {
            quit = true;
        }
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
        printGreeting();
        while(!quit) {
            setupGame();
            playGame();
        }
        System.out.println("Goodbye!");
    }
}
