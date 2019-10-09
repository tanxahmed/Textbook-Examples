
/**
 * (Health application: BMI) Revise Listing 3.4 ComputeAndInterpretBMI.java 
 * to let the user enter weight, feet, and inches. For example, if a person 
 * is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
 *
 * @tan ahmed
 * @08/29/19
 */

import java.util.Scanner;
    public class ComputeAndInterpretBMI {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double weight, inches, feet, weightInKilograms, 
                heightInMeters, bmi;
        
        // Prompt the user to enter weight in pounds
            System.out.println("Enter weight in pounds: ");
            weight = input.nextDouble();
       
       // Prompt the user to enter inches
            System.out.println("Enter inches: ");
            inches = input.nextDouble();
            
       // Prompt the user to enter feet
            System.out.println("Enter feet: ");
            feet = input.nextDouble(); 
            
            inches = inches + (feet*12);
       
            final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
            final double METERS_PER_INCH = 0.0254; // Constant 
       
       // Compute BMI
            weightInKilograms = weight * KILOGRAMS_PER_POUND; 
            heightInMeters = inches * METERS_PER_INCH; 
            bmi = weightInKilograms / 
                (heightInMeters * heightInMeters);
   
       // Display result
            System.out.println("BMI is " + bmi);
               if (bmi < 18.5)
                 System.out.println("Underweight");
               else if (bmi < 25)
                 System.out.println("Normal");
               else if (bmi < 30)
                 System.out.println("Overweight");
               else
                 System.out.println("Obese");
            }
       }
           