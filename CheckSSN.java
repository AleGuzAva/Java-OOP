// CHECK SSN
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class CheckSSN {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input SSN
        String SSN = input.nextLine();
        // SSN Format Verifier
        String formatSSN = "111-11-1111";
        
        if(SSN.length() == formatSSN.length()){
            System.out.println(SSN + " is a valid social security number.");
        }
        else{
            System.out.println(SSN + " is not a valid social security number.");
        }
        
    }    
}
