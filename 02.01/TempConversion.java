
/**
 * Write a description of class TempConversion here.
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 */

import java.util.Scanner;

public class TempConversion
{
    //main method
    public static void main(String[] args) {
        double farenheit;
        double celsius;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Celsius");
        celsius = in.nextDouble();
        farenheit = (9 / 5) * celsius + 32;
        System.out.println("Farenheit = " + farenheit);
        
    }
}
