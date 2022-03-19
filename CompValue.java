
package alejandro_hw_1;
import java.util.Scanner; 

public class CompValue {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input monthly savings amount
        System.out.println("Enter the monthly saving amount:");
        double monSavAmt = input.nextDouble();
        // Calculate value
        final double CONSTANT = (1 + 0.00417);
        double storeVal = CONSTANT;
        double value = (monSavAmt + storeVal) * CONSTANT;
        // Second Month
        storeVal = value;
        value = (monSavAmt + storeVal) * CONSTANT;
        // Third Month 
        storeVal = value;
        value = (monSavAmt + storeVal) * CONSTANT;
        // Fourth Month
        storeVal = value;
        value = (monSavAmt + storeVal) * CONSTANT;
        // Fifth Month
        storeVal = value;
        value = (monSavAmt + storeVal) * CONSTANT;
        // Sixth Month
        storeVal = value;
        value = (monSavAmt + storeVal) * CONSTANT;
              
        // Print result
        System.out.println("After the sixth month, the value is " + value);
    }  
}
