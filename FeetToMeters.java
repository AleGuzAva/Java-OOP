/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandro_hw_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author alejandroguzman-avalos
 */
public class FeetToMeters {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input Feet
        System.out.print("Enter a number for feet: ");
        double feet = input.nextDouble();
        // Calculate Meters
        double meters =  feet * 0.305;
        // Display Results
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
