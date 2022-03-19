// GEOMETRY: TWO CIRCLES
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class TwoCircles {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Values
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");     
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        // Calculate 
        
        double radiusCalc = (r1-r2);
        double distPow = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        double distSqrt = Math.sqrt(distPow);
        
        //System.out.println(radiusCalc + "     " + distSqrt);
        // Display Result
        if(radiusCalc > distSqrt){
        System.out.println("circle2 is inside circle1");
        }
        else{
        System.out.println("circle2 overlaps with circle1");
        }
    }    
}
