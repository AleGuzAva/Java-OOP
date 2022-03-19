// HW4 Q6: Markov Matrix
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 16th, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class MarkovMatrix {
    public static void main(String[] args){
        
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Declare a 2D Array to store Matrix
        double matrix[][] = new double[3][3];
        
        // User Input
        System.out.printf("Enter a 3-by-3 matrix row by row: \n");
        for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
             matrix[i][j] = input.nextDouble();  
           } 
        }
        
        if(isMarkovMatrix(matrix) == true){
            System.out.printf("It is a Markov matrix\n");
        }
        else{
            System.out.printf("It is not a Markov matrix\n");
        }
    }
    public static boolean isMarkovMatrix(double[][]m){
        
        // Tracks the sum
        double sum = 0.0;
        
        // Checks to make sure all the inputs are positive
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(m[i][j] < 0){
                return false;
                }
            }
        }
        
        // Checks to make sure all the columns add up to 1
        for(int j=0; j<3; j++){
            for(int i=0; i<3; i++){
                sum += m[i][j];
            }
            if(sum != 1.0){
                return false;
            }
            sum = 0;
        }
        
        // If all conditions are met, return true
        return true;
    }
}
