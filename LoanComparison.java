// HW3 Q2: Financial Application: Compare Loans with various interest
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 31st 2022 

// Packages
package alejandro_hw_3;

// Imports
import java.util.Scanner; 
import java.lang.Math;

public class LoanComparison {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Variables
        System.out.print("Loan Amount: ");
        int loanAmt = input.nextInt();
        System.out.print("Number of Years: ");
        int numYears = input.nextInt();        
        
        // Menu Title 
        System.out.print("Interest Rate         ");
        System.out.print("Monthly Payment       ");
        System.out.println("Total Payment");
        
        // Declare Variables
        double annualIntRate = 5.0;
        double monthlyIntRate = (annualIntRate / 100.0) / 12.0;
        //System.out.println(monthlyIntRate);
        double monthlyPayment = loanAmt * monthlyIntRate / (1.0 - 1.0 / 
                Math.pow(1.0 + monthlyIntRate, numYears * 12));   
        double totalPayment = monthlyPayment * (numYears * 12);

        while(annualIntRate <= 8.0){
            System.out.printf("%.3f", annualIntRate);
            System.out.print("%                ");
            System.out.printf("%.2f", monthlyPayment);
            System.out.print("             ");            
            System.out.printf("%.2f", totalPayment);
            System.out.println();
            annualIntRate += 0.125;
            // Updates the next calculations
            monthlyIntRate = annualIntRate / 1200.0;
            monthlyPayment = loanAmt * monthlyIntRate / (1.0 - 1.0 / 
                    Math.pow(1.0 + monthlyIntRate, numYears * 12));  
            totalPayment = monthlyPayment * (numYears * 12);            
        }
                
                
    }
}

