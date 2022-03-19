// HW3 Q4: Display Calendars
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 1st 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 

public class DisplayCalendars {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
         
        // Input Variables
        System.out.println("What year do you want to load in?");
        int year = input.nextInt();
        System.out.println("What weekday does January 1st land on? (1-7)");
        int startDay = input.nextInt();
        
        // Declare program variables
        String curMonth = "";
        int monthNum = 1;
        int numMonthDays = 0;
         
        
        // Check for leap years
        int leapYear = 0;
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            leapYear++;
        }
        
        // Main For Loop 
        for(monthNum=1; monthNum <= 12; monthNum++){
            
            // Sets string to corresponding month, and sets the number of days
            if(monthNum == 1){
                System.out.println("       January " + year);
                numMonthDays = 31;
            }
            if(monthNum == 2){
                System.out.println("       February " + year);
                if(leapYear > 0){
                    numMonthDays = 29;
                }
                else{
                    numMonthDays = 28;
                }
            }
            if(monthNum == 3){
                System.out.println("       March " + year);
                numMonthDays = 31;
            }
            if(monthNum == 4){
                System.out.println("       April " + year);
                numMonthDays = 30;
            }
            if(monthNum == 5){
                System.out.println("       May " + year);
                numMonthDays = 31;
            }
            if(monthNum == 6){
                System.out.println("       June " + year);
                numMonthDays = 30;
            }
            if(monthNum == 7){
                System.out.println("       July " + year);
                numMonthDays = 31;
            }
            if(monthNum == 8){
                System.out.println("       August " + year);
                numMonthDays = 31;
            }
            if(monthNum == 9){
                System.out.println("       September " + year);
                numMonthDays = 30;
            }
            if(monthNum == 10){
                System.out.println("       October " + year);
                numMonthDays = 31;
            }
            if(monthNum == 11){
                System.out.println("       November " + year);
                numMonthDays = 30;
            }
            if(monthNum == 12){
                System.out.println("       December " + year);
                numMonthDays = 31;
            }       
            
            // Prints the Repeating Title 
            System.out.println("------------------------------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat"); 
            
            // Prints the day number
            for(int i=0; i<startDay; i++){
                if(startDay < 7){
                    System.out.print("     ");
                }
            }
            for(int i=1; i<=numMonthDays; i++){
                if(i < 10){
                    System.out.print(" " + i + "   ");
                }
                else{
                    System.out.print(i + "   ");
                }
                if((i + startDay) % 7 == 0){
                    System.out.println();
                }
            }
            
            // Updates start day for the next month
            startDay = (startDay + numMonthDays) % 7;
            System.out.println();
            
        }            
    } 
}

