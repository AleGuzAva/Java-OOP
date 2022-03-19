// GAME: SCISSOR, ROCK, PAPER
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class ScisRockPaper {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Player Move
        System.out.println("Enter your move: scissors(0), rock(1), paper(2)");
        int playerMove = input.nextInt();
        // Generate Computer Move
        int compMove = (int)(Math.random() * 3);
        
        // Convert integer plays to strings.
        
        String movePlayer = "hi";
        String moveComp = "hi";

        if(playerMove == 0){
            movePlayer = "scissor"; 
        }
        if(playerMove == 1){
            movePlayer = "rock";
        }
        if(playerMove == 2){
            movePlayer = "paper";
        }
        if(compMove == 0){
            moveComp = "scissor"; 
        }
        if(compMove == 1){
            moveComp = "rock";
        }
        if(compMove == 2){
            moveComp = "paper";
        }

        // Print Moves and Winner
        if(playerMove > compMove){
            if((playerMove == 2) && (compMove == 0)){
                System.out.print("The computer is " + moveComp + ". You are ");
                System.out.println(movePlayer + ". You lost");
            }
            else{
            System.out.print("The computer is " + moveComp + ". You are ");
            System.out.println(movePlayer + ". You won");
            }
        }
        
        if(playerMove < compMove){
            if((playerMove == 0) && (compMove == 2)){
                System.out.print("The computer is " + moveComp + ". You are ");
                System.out.println(movePlayer + ". You won");
            }
            else{
            System.out.print("The computer is " + moveComp + ". You are ");
            System.out.println(movePlayer + ". You lost");
            }
        }
      
        if(compMove == playerMove){
            System.out.print("The computer is " + moveComp + ". You are ");
            System.out.println(movePlayer + " too. It is a draw");
        }
    }   
}
