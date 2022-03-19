// HW4 Q5: Strictly Identical Arrays
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 16th, 2022

// Packages
package alejandro_hw_4;

// Imports
import java.util.Scanner; 

public class StrictlyIdenticalArrays {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // User Inputs
        int sizeof1 = input.nextInt();
        // Declares arrays based on first char of user input
        int[] array1 = new int[sizeof1];
        for(int i=0; i<sizeof1; i++){
            array1[i] = input.nextInt();
        }
        // Repeat for second array
        int sizeof2 = input.nextInt();
        int[] array2 = new int[sizeof2];
        for(int i=0; i<sizeof2; i++){
            array2[i] = input.nextInt();
        }        
        
        
        if(equals(array1, array2) == true){
            System.out.printf("Two lists are strictly identical\n");      
        }
        else{
            System.out.printf("Two lists are not strictly identical\n");
        }
    }
    public static boolean equals(int[] list1, int[] list2){
        
        if(list1.length != list2.length){
        System.out.printf("The arrays are not of equal size!");
            return false;
        }        
        
        for(int i=0; i<list1.length; i++){
            if(list1[i] != list2[i]){
                // If difference is found, return false
                return false;
            }     
        }
        // If no differences are marked, return true
        return true;
    }
}
