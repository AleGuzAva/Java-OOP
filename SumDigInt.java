package alejandro_hw_1;
import java.util.Scanner;

public class SumDigInt {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input Integer
        System.out.print("Enter a number between 0 and 1000: ");
        int integer = input.nextInt();
        // Calculate Sum
        int sum; 
        sum = integer % 10;
        integer = integer / 10;
        sum += integer % 10;
        integer = integer / 10;
        sum += integer % 10;
            
        // Display Results
        System.out.println("The sum of the digits is " + sum);    
    }
}
