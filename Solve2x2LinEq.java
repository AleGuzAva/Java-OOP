// ALGEBRA: SOLVE 2*2 LINEAR EQUATIONS
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class Solve2x2LinEq {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Values
        System.out.println("Enter your a value: ");
        double a = input.nextDouble();
        System.out.println("Enter your b value: ");
        double b = input.nextDouble();
        System.out.println("Enter your c value: ");
        double c = input.nextDouble();
        System.out.println("Enter your d value: ");
        double d = input.nextDouble();    
        System.out.println("Enter your e value: ");
        double e = input.nextDouble();
        System.out.println("Enter your f value: ");
        double f = input.nextDouble(); 
        
        
        // Cramer's Rule Calculations
        double x, y, xa, xc, yb, yd;    
        
        // X Calculations
        xa = e;
        xc = f;
        x = (xa*d - b*xc)/(a*d - b*c);
        // Checks to see if solution exists
        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
            // Ends the program if this if-statement is triggered
            System.exit(0);
        }
        
        // Y Calculations
        yb = e;
        yd = f;
        y = (a*yd - c*yb)/(a*d - b*c);
        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
            // Ends the program if this if-statement is triggered
            System.exit(0);
        }
 
        
        
        // Print Results
        System.out.println("X is " + x + " and Y is " + y);
    }
}
