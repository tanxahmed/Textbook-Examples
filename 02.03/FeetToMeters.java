
/**
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter.�
 *
 * @tan ahmed
 * @8/23/2019
 */

import java.util.Scanner;

public class FeetToMeters
{
    public static void main(String[] args) {
        double feet;
        double meter;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a value for feet: ");
        feet = in.nextDouble();
        meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters.");
    }
        
        
}
