// HW4 Q4: Game Bean Machine
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 15th, February 17th, February 22nd, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class GameBeanMachine {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // User Input
        System.out.printf("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();
        System.out.printf("Enter the number of slots in the bean machine: ");
        int numSlots = input.nextInt();
        // Creates an array for user input
        int slots[][] = new int[numBalls][numSlots];
        
        // New Line to match example case
        System.out.printf("\n");
     
        // Keeps track of how many drops there are
        int numDrops = numSlots - 1;
       
        // Creates an array to store LR characters
        char lrList[] = new char[numSlots];
        // Creates an array to store final ball location
        int finalPos[] = new int[numSlots];
        
        // Simulates all the ball drops and prints LR
        for(int i=0; i<numBalls; i++){
            int ballPosition = numSlots / 2 + 1;            
            createLRArray(lrList, numDrops);
            finalPos[i] = trackBallPos(lrList, ballPosition, numSlots);
            //System.out.printf(" %d\n", finalPos[i]);
            System.out.printf("\n");
        }
        System.out.printf("\n");
        
        // Creates an array that mimicks the bean game slots
        char beanBoard[][] = new char[numSlots][numBalls];
        printBeans(beanBoard, finalPos);
        
    }
    public static void createLRArray(char array[], int numDrops){

        // Determines if the ball travels left or right
        for(int i = 0; i < numDrops; i++){
                if(Math.random() * 100 > 50){
                    array[i] = 'R';
                    System.out.printf("R");                   
                }
                else{
                    array[i] = 'L';
                    System.out.printf("L");                    
                }
        }
    }
    public static int trackBallPos(char array[], int ballStart, int numSlots){
        int ballPosition = ballStart;
        int rCount = 0, lCount = 0;
        for(int i=0; i<numSlots; i++){
            if(array[i] == 'R'){
                rCount++;
            }
            else{
                lCount++;
            }
        }
        ballPosition = (ballPosition + rCount) - lCount;
        // Bound Checkers
        if(ballPosition < 0){
            ballPosition = 0;
        }
        if(ballPosition > numSlots){
            ballPosition = numSlots;
        }
        
        return ballPosition;
    }
    public static void printBeans(char charArray[][], int numArray[]){
        
        int temp = 0;
        
        // Updates the board to replace blanks with Os
        for(int i=0; i<numArray.length; i++){
            for(int j=0; j<charArray[0].length; j++){
                if(numArray[i] == j){
                    if(charArray[i][j] != 'O'){
                        charArray[i][j] = 'O';
                    }
                    else if(charArray[i][j] == 'O'){
                        temp = i + 1;
                        charArray[temp][j] = 'O';   
                    }
                    else{
                        charArray[i][j] = ' ';
                    }
                }
            }
        }

        // Prints the entire board
        for(int i=0; i<charArray.length; i++){
            for(int j=0; j<charArray[0].length; j++){
                if(charArray[i][j] == 'O'){
                System.out.print(charArray[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
            }
        }
    }
