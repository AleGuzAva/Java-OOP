package alejandro_hw_1;
import java.util.Scanner; 
import java.lang.Math;

public class WindChill {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input Variables
        System.out.println("Enter the temperature in Fahrenheit between -58 F");
        System.out.print("and 41 F: ");
            double outTemp = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
            double windSpeed = input.nextDouble();
        
        // Calculate Wind Chill
        double firstCalc = 35.74 + 0.6215*outTemp;
        double secondCalc = 35.75*Math.pow(windSpeed, 0.16);
        double thirdCalc = 0.4275*outTemp*Math.pow(windSpeed, 0.16);
        double windChillTemp = firstCalc - secondCalc + thirdCalc;
        
        // Print Results
        System.out.println("The wind chill index is " + windChillTemp);
    }  
}
