// HW3 Q10: Phone Keypads
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 3rd 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 

public class PhoneKeypads {
    public static int getNumber(char uppercaseLetter){
        int num = 0;
        
        // Converts all lower case to uppercase to minimize future code
        if(Character.isLetter(uppercaseLetter)){
            if(Character.isLowerCase(uppercaseLetter)){
                uppercaseLetter = Character.toUpperCase(uppercaseLetter);
            }
        }
        
        // Converts characters to numbers
        if(Character.isLetter(uppercaseLetter)){  
            if(uppercaseLetter == 'A' || uppercaseLetter == 'B' 
                    || uppercaseLetter == 'C'){
                num = 2;
            }
            if(uppercaseLetter == 'D' || uppercaseLetter == 'E' 
                    || uppercaseLetter == 'F'){
                num = 3;
            }
            if(uppercaseLetter == 'G' || uppercaseLetter == 'H' 
                    || uppercaseLetter == 'I'){
                num = 4;
            }
            if(uppercaseLetter == 'J' || uppercaseLetter == 'K' 
                    || uppercaseLetter == 'L'){
                num = 5;
            }
            if(uppercaseLetter == 'M' || uppercaseLetter == 'N' 
                    || uppercaseLetter == 'O'){
                num = 6;
            }
            if(uppercaseLetter == 'P' || uppercaseLetter == 'Q' 
                    || uppercaseLetter == 'R' || uppercaseLetter == 'S'){
                num = 7;
            }
            if(uppercaseLetter == 'T' || uppercaseLetter == 'U' 
                    || uppercaseLetter == 'V'){
                num = 8;
            }
            if(uppercaseLetter == 'W' || uppercaseLetter == 'X' 
                    || uppercaseLetter == 'Y' || uppercaseLetter == 'Z'){
                num = 9;
            }
        }

        // End getNumber
        return num;
    }
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
                
        // Input Telephone Number
        System.out.println("Enter a string: ");
        String teleNum = input.nextLine();
                
        // If character is letter, convert to num. Else print char. 
        for(int i=0; i<teleNum.length(); i++){
            if(Character.isLetter(teleNum.charAt(i))){
            System.out.print(getNumber(teleNum.charAt(i)));
            }
            else{
                System.out.print(teleNum.charAt(i));
            }
        }
       
        System.out.println();
                
    }
}

