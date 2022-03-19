// HW3 Q6: Sum the Digits in an Integer
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 3rd 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 

public class SumDigitsinInt {
    public static int sumDigits(long n){

        // Counts number of digits for future for loop.
        int digitInt = (int) n;
        int numDigit = 0;
        
        while(digitInt != 0){
            digitInt /= 10;
            numDigit++;
        }
        
        // Calculate Sum
        int sum = 0;
        for(long i=0; i<=numDigit; i++){
        sum += (int)n % 10;
        n = n / 10;
        }  
        
        return sum;
    }

    public static void main(String[] args){

        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Integer
        System.out.print("Enter a number between 0 and 1000: ");
        int integer = input.nextInt();
                
        System.out.println("Sum of the digits is: " + sumDigits(integer));
    }
}