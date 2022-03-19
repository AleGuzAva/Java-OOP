package alejandro_hw_1;
import java.util.Scanner; 
import java.lang.Math;

public class CalcFutInvestValue {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input Variables
        System.out.println("Enter investment amount: ");
            double invAmt = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
            double monIntRate = input.nextDouble();
            monIntRate = monIntRate/100;
        System.out.println("Enter number of years: ");
            double numYears = input.nextDouble();
        // Calculate Future Investment Values    
        double futInvVal = invAmt * Math.pow((1+monIntRate), (numYears*12));
        // Print Result
        System.out.println("Future value is $" + futInvVal);
                
    }    
}
