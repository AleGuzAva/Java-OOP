// HW4 Q2: Find The Smallest Element
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 15th, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class FindSmallestElement {
    public static void main(String[] args){
        
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Declare an array to input numbers
        double numArray[] = new double[10];
        
        // Input Numbers
        System.out.printf("Enter ten numbers: \n");
        for(int i=0; i < 10; i++){
            numArray[i] = input.nextDouble();
        }
        
        System.out.printf("The minimum number is %.1f\n", min(numArray));

    }
    public static double min(double[] array){
        // Sets the minimum as the first value of the array
        double minimum = array[0];
        
        for(int i=0; i < 10; i++){
            if(minimum >= array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }
}