
package alejandro_hw_1;

import java.util.Scanner;

public class CalcAccel {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
    // Input Initial Velocity, Final Velocity, and Time.
    System.out.println("Enter the initial velocity: ");
        double inVel = input.nextDouble();
    System.out.println("Enter the final velocity: ");
        double fiVel = input.nextDouble();
    System.out.println("Enter the time: ");
        double Time = input.nextDouble();
        
        // Calculate Average Acceleration
        double avgAcel = ((fiVel - inVel) / Time);
        // Display Results
        System.out.println("The average acceleration is " + avgAcel);
    }
}
