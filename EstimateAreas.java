// GEOGRAPHY: ESTIMATE AREAS
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class EstimateAreas {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Set location for cities
        double xAtl = 33.4790, yAtl = -84.3880; 
        double xSav = 32.0808, ySav = -81.0912; 
        double xCha = 35.2271, yCha = -80.8431;         
        double xOrl = 28.5384, yOrl = -81.3789; 
        
        // Calculates Area
        
        // Compute all sides
        double a = Math.sqrt(Math.pow(xSav - xCha,2) + Math.pow(ySav - yCha,2));
        double b = Math.sqrt(Math.pow(xAtl - xCha,2) + Math.pow(yAtl - yCha,2));        
        double c = Math.sqrt(Math.pow(xAtl - xSav,2) + Math.pow(yAtl - ySav,2));
        double d = Math.sqrt(Math.pow(xOrl - xCha,2) + Math.pow(yOrl - yCha,2));
        
        // Compute all angles
        
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) 
                / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) 
                / (-2 * a * c)));        
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) 
                / (-2 * a * b)));        
        double D = Math.toDegrees(Math.acos((d * d - b * b - c * c) 
                / (-2 * b * c)));        
        
        // Estimate Area
        double TriOne = ((a * b) * Math.sin(C)) / 2;
        double TriTwo = ((d * b) * Math.sin(C)) / 2;
        float FourArea = (float)TriOne + (float)TriTwo;
        
        // Display Result
        
        System.out.printf("The area encompassed by these four cities is: %.2f "
                + "units", FourArea);
        System.out.println();
    }   
}
