// FINANCIAL APPLICATION: PAYROLL
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// January 25th 2022 

// Packages
package alejandro_hw_2;

// Imports
import java.util.Scanner; 
import java.lang.Math;

// Main Function 
public class PAYROLL {
    public static void main(String[] args){
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Input Values
        System.out.println("Enter employee's name: ");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double numHours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double fedTaxWR = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxWR = input.nextDouble(); 
        
        // Calculations
        double grossPay = numHours * payRate;
        double fedTaxWH = fedTaxWR * grossPay;
        double stateTaxWH = stateTaxWR * grossPay;
        double totalDeduction = stateTaxWH + fedTaxWH;
        double netPay = grossPay - totalDeduction;
        
        
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + numHours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay : $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("      Federal Withholding (" + fedTaxWR + "%): " + 
                fedTaxWH);
        System.out.println("      State Withholding (" + stateTaxWR + "%): " + 
                stateTaxWH);        
        System.out.println("      Total Deduction: " + totalDeduction);
        System.out.println("Net Pay: " + netPay);
        
    }
}
