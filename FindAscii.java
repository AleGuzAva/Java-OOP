// ALGEBRA: SOLVE 2*2 LINEAR EQUATIONS
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class FindAscii {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Value
        System.out.println("Enter an ASCII code (between 0 and 127): ");
        int asciiCode = input.nextInt();
        char asciiChar = (char)asciiCode;
        
        // Compute code, conver to char
        
        // Display Result
        System.out.println("The character for ASCII code " + asciiCode + " is " +
                asciiChar);
    }  
}
