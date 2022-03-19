// CONVERT LETTER GRADE TO NUMBER
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 

// Main Function 
public class LetterGradeToNumber {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Values
        String letterGrade = input.nextLine();
        char letGrade = letterGrade.charAt(0);
        int numGrade = 0;
       
        
        // Convert Number Grade to Letter Grade
        if(letGrade == 'A'){
            numGrade = 4;
        }
        if(letGrade == 'B'){
            numGrade = 3;
        }
        if(letGrade == 'C'){
            numGrade = 2;
        }
        if(letGrade == 'D'){
            numGrade = 1;
        }
        if(letGrade == 'F'){
            numGrade = 0;
        }
        // Checks valid bounds
        if(letGrade != 'A' && letGrade != 'B' && letGrade != 'C' && letGrade != 
                'D' && letGrade != 'F'){
            System.out.println(letGrade + " is an invalid grade");
            System.exit(0);
        }
        
        // Display Result
        System.out.println("The numeric value for grade " + letGrade + " is " + 
                numGrade);
    }    
}
