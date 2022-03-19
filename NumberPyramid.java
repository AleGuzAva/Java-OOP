// HW3 Q1: Number Pyramid
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 31st 2022 

// Packages
package alejandro_hw_3;

// Imports
//import java.lang.Math;

public class NumberPyramid {
    public static void main(String[] args){
        
        // Determines the number of spaces before integers are printed
        int numSpaces = 7;
        String spaces = "  ";
        
        // Nested For Loop        
        for(int i=0; i<8; i++){
            
            // Calculates how many integers per row
            int rowInt = (i*2 + 1);
            
            // Declares starting value
            int curVal = 1; 
            
            for(int k=0; k<numSpaces; k++){
                System.out.print(spaces);                
            }

            for(int j=1; j <= rowInt; j++){
                System.out.print(curVal + " ");
                curVal *= 2;
                // Starts printing backwards until back at 1
                if(j == (rowInt/2) + 1 && j != rowInt){
                    curVal /= 2;
                    for(j=(rowInt/2); j<rowInt; j++){
                        curVal /= 2;
                        if(curVal != 0){
                        System.out.print(curVal + " ");
                        }
                    }      
                }
            }
            System.out.println();
            numSpaces--;
        }
                
                
                
                
    }
}
