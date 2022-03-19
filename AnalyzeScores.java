// HW4 Q1: Analyze Scores
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 15th, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class AnalyzeScores {
    public static void main(String[] args){

        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Array for storing scores
        int[] scores = new int[100];
        int i = 0;
        
        System.out.printf("Enter your scores!\n");
        // Keeps program within bounds and running until negative input
        while(i < 100){
            scores[i] = input.nextInt();
            if(scores[i] < 0){
                break;
            }      
            // Moves to the next array spot
            i++;
        }
        
        // Creates a new array only utilizing the amount of indexes required
        int totalScores = i;
        int[] eff_scores = new int[totalScores];
        for(i = 0; i<totalScores; i++){
            eff_scores[i] = scores[i];
        }
        
        // Sums up the total of all the scores (used for average calculation)
        double total = 0;
        for(i = 0; i < eff_scores.length; i++){
            total += eff_scores[i];
        }
        
        
        // Variable Declaration for below/equal/above average scores
        int belAvg = 0;
        int abvEqAvg = 0;
        double average = (total/(double)totalScores);
        
        for(i=0; i < totalScores; i++){
            if(eff_scores[i] < average){
                belAvg++;
            }
            else{
                abvEqAvg++;
            }
        }
        
        System.out.printf("Total number of scores is: %d\n", totalScores);
        System.out.printf("The average score is: %.2f\n", average);
        System.out.printf("The number of scores below the average is: "
                + "%d\n", belAvg);
        System.out.printf("The number of scores above or equal to the "
                + "average is: %d\n", abvEqAvg);
   
    }
    
}