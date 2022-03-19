// HW3 Q7: Conversions between Celsius and Fahrenheit
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 3rd 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 

public class TempConversions {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
                
        double celsius = 40, fahrenheit = 120;        
        
        // Prints out the title
        System.out.println("Celsius   Fahrenheiht  |  Fahrenheit   Celsius");
        System.out.println("----------------------------------------------");
        
        for(int i=0; i <= 9; i++){        
           System.out.printf("%.1f       %.1f       |  %.1f         %.2f", 
               celsius, celsiusToFahrenheit(celsius), fahrenheit, 
               fahrenheitToCelsius(fahrenheit));   
           System.out.println();
           celsius -= 1.0;
           fahrenheit -= 10.0;
        }
    }
}

