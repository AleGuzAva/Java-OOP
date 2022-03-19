// HW4 Q7: Largest Block
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 16th, February 17th, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class LargestBlock {
    public static void main(String[] args){
        
        // Create new scanner object
        Scanner input = new Scanner(System.in);
        
        // User Inputs Rows/Columns
        System.out.printf("Enter the number of rows in the matrix\n");
        int numRows = input.nextInt();
        int numCol = numRows;
        
        // Declare a matrix 
        int matrix[][] = new int[numRows][numCol];
        
        // User Inputs Matrix Values
        System.out.printf("Enter the matrix row by row: \n");
        for(int i=0; i<numRows; i++){
            for(int j=0; j<numCol; j++){
                matrix[i][j] = input.nextInt();
                // Checks to make sure user only enters 0 or 1
                if(matrix[i][j] < 0 || matrix[i][j] > 1){
                    System.out.printf("Invalid Input!\n");
                    System.exit(0);
                }
            }
        }
        
        int[] result = findLargestBlock(matrix);
        
        
        System.out.printf("The maximum square submatrix is at (%d, %d) with "
                + "size %d\n", result[0], result[1], result[2]);
    }
    public static int[] findLargestBlock(int[][] m){
        
        // Declare Tracker Variables
        int firstCol=0, firstRow=0;
        int tempSize = 0, size = 0;
        // Declare new array
        int[] largestBlock;
        
        // Checks to make sure the subsquare isn't interrupted by a 0
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                if(m[i][j] == 1){
                    if(tempSize>=size){
                        firstCol = i;
                        firstRow = j;   
                    }
                    
                    tempSize += 1;
                }
                else if(m[i][j] == 0){
                    if(tempSize > size){
                    size = tempSize;
                    }
                    tempSize = 0;
                }
            }
            if(tempSize > size){
                size = tempSize;
            }
            tempSize = 0;
        }
       
        largestBlock = new int[]{firstCol+1, firstRow, size};
        
        return largestBlock;
    }
}