// HW3 Q9: Check Password
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 3rd 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 

public class CheckPassword {
    public static int validPassword(String s){
        
        int value = 0;
        // Number Counter
        int numCount = 0;
        // T/F for correct size
        int corSize = 0;
        // Checks for invalid characters
        int invalidChar = 0;

        // Checks for the correct size
        if(s.length() >= 8){
            corSize = 1;
        }        
        
        // Checks for digits and other symbols
        for(int i=0; i < s.length(); i++){
            // Check
            if(Character.isDigit(s.charAt(i))){  
                numCount++;
            }  
            if(Character.isLetterOrDigit(s.charAt(i)) == false){
                invalidChar++;
            }
        }
        // Checks to see if all password requirements are met
        if(corSize == 1 && numCount > 1 && invalidChar == 0){
            value = 1;
        }
        
        return value;
    }
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
                
        // Input Password
        System.out.println("Please enter your password");
        String password = input.nextLine();
                
        if(validPassword(password) == 1){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
                
                
    }
}

// three functions, at least 8 char, only letters and digits, must contain two digits
