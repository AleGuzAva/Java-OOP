// HW3 Q5: Process String
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 31st 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 
import java.lang.Math;

public class ProcessString {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
  
        
        // Input Variables
        System.out.println("Enter a string: ");
        String userInput = input.nextLine();
        int length = userInput.length();        
        
        // This will be used for switch statements to decide what to do with string
        System.out.println("Input 1 for eliminating characters. "
                + "Input 2 for vowels and consonants.");
        int option = input.nextInt();

        switch(option){
            
            // Eliminate characters
            case 1:
                for(int i=0; i<length; i++){
                    
                    int randNumber = (int)(Math.random() * 101);
                    // Decides randomly whether to print the char or not
                    if(randNumber % 2 == 0 && userInput.charAt(i) != ' '){
                        System.out.print(userInput.charAt(i));
                    }
                }
                
                System.out.println();
            // End Case    
            break;  
            
            // Count Vowels and Consonants    
            case 2:
                int vowelCount = 0;
                int consCount = 0;
                for(int i=0; i<length; i++){
                    // Vowel Checker
                    if(userInput.charAt(i) == 'A' || userInput.charAt(i) == 'E' 
                        || userInput.charAt(i) == 'I' || userInput.charAt(i)
                        == 'O' || userInput.charAt(i) == 'U' || 
                        userInput.charAt(i) == 'a' || userInput.charAt(i) 
                        == 'e' || userInput.charAt(i) == 'i' || 
                        userInput.charAt(i) == 'o' || userInput.charAt(i) 
                        == 'u'){
                            vowelCount++;
                    }
                    // Consonant checker, excludes spaces
                    else if(userInput.charAt(i) != ' '){
                         consCount++;           
                    }
                }
                
                // Print Results
                System.out.println("The number of vowels is: " + vowelCount);
                System.out.println("The number of consonants is: "+ consCount);
            // End Case
            break;
            // Invalid Case
            default: System.out.println("Error: Invalid Option");
                     System.exit(1);
            
            
            
            
            
            
            
            
            
        }           
    }
}
