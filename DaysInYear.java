// HW3 Q8: Number of Days in a Year
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 3rd 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 

public class DaysInYear {
    public static int numberOfDaysInAYear(int year){

        int numDays = 0;
        
        // Check for leap years
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            numDays = 366;
        }
        else{
            numDays = 365;
        }
        
        // End Method 
        return numDays;
    }
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Variables
        System.out.println("What year would you like to start in?");
        int startYear = input.nextInt();
        System.out.println("What year would you like to end in?");
        int endYear = input.nextInt();
        
        if(startYear > endYear){
            System.out.println("Error: Start year must be less than end year");
            System.exit(0);
        }
        
        int totalDays = 0;
        int i = startYear;
        
        while(i <= endYear){
            totalDays += numberOfDaysInAYear(i);
            i++;
        }
        
        System.out.printf("Number of days between January 1st, %d and \n"
                + "December 31st, %d is: %d\n", startYear, endYear, totalDays);
                
                
                
                
    }
}

