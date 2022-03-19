// BUSINESS: CHECK ISBN-10
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class CheckISBN_10 {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Values
        System.out.println("Enter the first 9 digits of an ISBN as an integer");
        String ISBN9 = input.nextLine();
        String ISBN10;

        // Checksum calculation
        int checksum = (((ISBN9.charAt(0) - 48)  * 1) + ((ISBN9.charAt(1) - 48) 
                * 2) + ((ISBN9.charAt(2)-48) * 3) + ((ISBN9.charAt(3)-48) * 4) +
                ((ISBN9.charAt(4) -48) * 5) + ((ISBN9.charAt(5)-48) * 6) + 
                ((ISBN9.charAt(6)-48) * 7) + ((ISBN9.charAt(7)-48) * 8) + 
                ((ISBN9.charAt(8)-48) * 9))%11; 
        System.out.println((ISBN9.charAt(1) - 48) * 2);
        String X = "X";
        
        // Checks to see if it appends checksum value or X 
        if(checksum == 10){
            ISBN10 = ISBN9.concat(X);             
        }
        else{
            String checksumString = checksum + " ";
            ISBN10 = ISBN9.concat(checksumString);
        }
        // Results
        System.out.println("The ISBN-10 number is: " + ISBN10);
                
        
        
        
    }    
}
