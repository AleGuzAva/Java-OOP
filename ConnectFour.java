// HW4 Q8: Game - Connect Four
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 17th, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class ConnectFour {
    public static void main(String[] args){
        // Create new scanner object
        Scanner input = new Scanner(System.in);
        
        // Create Board + Array
        String[][] gameBoard = createBoard();
        
        // Initial Variables for Turn 1
        int curPlayer = 1;
        int drop = 0;
        // Bound Checker Variables
        int nextTurn = 0, validDrop = 0;
        
        // The ultimate while loop which contains every function per turn
        while(checkWin(curPlayer) == false){
            
            System.out.printf("Drop a disc at column (0-6): \n");
            // Checks to make sure player made a valid move
            while(validDrop == 0){
                drop = input.nextInt();
                if(drop < 0 || drop > 6){
                    System.out.printf("Invalid Move. Try Again\n");
                }
                else{
                    validDrop = 1;
                }
            }
            // Checks to make sure player made a move in an empty spot
            while(nextTurn == 0){    
                nextTurn = playerMove(gameBoard, curPlayer, drop);
                if(nextTurn == 0){
                    System.out.printf("That spot is taken! Try Again\n");
                }
            }     
            nextTurn = 0;
            validDrop = 0;
            showBoard(gameBoard);
            checkWin(curPlayer);
            curPlayer = swapPlayer(curPlayer);          
        }
    }
    
    // Conducts a player's move 
    public static int playerMove(String[][] board, int player, int column){
       
        // Chooses the color of the disc to drop
        String discColor;
        if(player == 1){
            discColor = "|R|";
        }
        else{
            discColor = "|Y|";
        }
        
        // Checks to see if a disc is already in the spot
        int row = 0;
        for(int i=0; i<board.length; i++){
            if(board[i][column] == "| |" || board[i][column] == " |"){
                row = i;
            }
            else{
                return 0;
            }
        }
        
        // Updates board with the play
        board[row][column] = discColor;
        return 1;
    }
    
    // Checks to see if a player won
    public static boolean checkWin(int player){
        
        // Counter variable to decide for win
        int streak = 0;
        // PLACEHOLDER !!!!!!!!!!
        int board = 11, full = 24;
        
        if(streak == 4){
            System.out.printf("Player %d has won!\n", player);
            return true;
        }
        // PLACEHOLDER !!!!!!!!!!!!!
        if(board == 'C'){
            System.out.printf("The game has ended in a draw.\n");
            return true;
        }
        return false;
    }
    
    // Swaps the player after a turn
    public static int swapPlayer(int player){

        if(player == 1){
            player = 2;
        }
        else{
            player = 1;
        }
        return player;
    }
    
    // Creates the game board
    public static String[][] createBoard() {

        String[][] board = new String[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == 0){
                    board[i][j] = "| |";
                }
                else{
                    board[i][j] = " |";
                }

            }
        }
        return board;
    }
    
    // Displays the board after each turn
    public static void showBoard(String[][] gameBoard){
        for(int i=0; i<gameBoard.length; i++){
            for(int j=0; j<gameBoard[0].length; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.printf("\n");
        }
    }
}