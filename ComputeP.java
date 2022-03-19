// HW3 Q3: Compute Pi
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 1st 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.lang.Math;

public class ComputeP {
    public static void main(String[] args){
        
        double pi = 0;
        // This will be used to print out all the values in increments of 10000
        int j = 1;
        
        for(int i=1; i <= 100000; i++){
            if(i == 10000 * j){
                System.out.println("At i = " + i + " Pi = " + pi*4);
                j++;
            }
            pi +=  Math.pow(-1, i+1)/(2*i-1);
        }    
                
                
                
                
    }
}


// pi = 4(1-1/3+1/5-1/7+1/9....+ ((-1)^i+1) / 2i-1
