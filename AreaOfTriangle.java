package alejandro_hw_1;
import java.util.Scanner; 
import java.lang.Math;

public class AreaOfTriangle {
    public static void main(String[] args){
        // Input Scanner
        Scanner input = new Scanner(System.in);
        // Input Coordinates 
        System.out.println("Enter the first x value");
            double fX = input.nextDouble();
        System.out.println("Enter the first y value");
            double fY = input.nextDouble();
        System.out.println("Enter the second x value");
            double sX = input.nextDouble();
        System.out.println("Enter the second y value");
            double sY = input.nextDouble();
        System.out.println("Enter the third x value");
            double tX = input.nextDouble();
        System.out.println("Enter the third y value");
            double tY = input.nextDouble();
        
        // Calculate Area
        double firstCalc = fX * (sY - tY);
        double secondCalc = sX * (tY - fY);
        double thirdCalc = tX * (fY - sY);
        double area = (firstCalc + secondCalc + thirdCalc)/2;
        area = Math.pow(area, 2);
        area = Math.sqrt(area);
        // Print Result
        System.out.println("The area of the triangle is " + area);
    }    
}
