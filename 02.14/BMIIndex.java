
/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI. Note
 * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.�
 *
 * @tan ahmed
 * @08/27/19
 */

import java.util.Scanner;
public class BMIIndex
{
    public static void main(String[] args){
    
        double pounds;
        double inches;
        double kg;
        double meters;
        double BMI;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter weight in pounds");
        pounds = in.nextDouble();    
        kg = pounds * 0.45359237;
        
        System.out.println("Enter height in inches");
        inches = in.nextDouble();
        meters = inches * 0.0254;
        
        BMI = kg / (meters * meters);
        
        System.out.println("BMI is " + BMI);
    }
}
