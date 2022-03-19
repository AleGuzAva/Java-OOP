// GAME: LOTTERY
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class Lottery {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input three-digit number
        System.out.println("Enter your 3-Digit Number: ");
        int guessNumber = input.nextInt();
        // Generate random lottery number
        int lotteryNumber = (int)(Math.random() * 1000);
        System.out.println("Lottery Number is: " + lotteryNumber);
        
        // Get Digits from Lottery
        int lotDigitOne = lotteryNumber / 100;
        lotteryNumber %= 100;
        int lotDigitTwo = lotteryNumber % 10;
        lotteryNumber %= 10;
        int lotDigitThree = lotteryNumber;
        
        // Get Digits from Guess
        int guessDigitOne = guessNumber / 100;
        guessNumber %= 100;
        int guessDigitTwo = guessNumber / 10;
        guessNumber %= 10;
        int guessDigitThree = guessNumber; 
        
        // Keep Track of Score
        int score = 0;
        
        if(lotDigitOne == guessDigitOne){
            score++;
        }
        if(lotDigitTwo == guessDigitTwo){
            score++;
        }
        if(lotDigitThree == guessDigitThree){
            score++;
        }
        
        // Final Results
        if(score == 3){
            System.out.println("Congratulations! You have won $10,000");    
        }
        if(score == 2){
            System.out.println("Congratulations! You have won $3,000");
        }
        if(score == 1){        
            System.out.println("Congratulations! You have won $1,000");        

        }
        else{
            System.out.println("Sorry, you didn't win anything.");            
        }
    }   
}
