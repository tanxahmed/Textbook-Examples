
/**
 * (Science: calculating energy) Write a program that calculates the energy 
 * needed to heat water from an initial temperature to a final temperature. 
 * Your program should prompt the user to enter the amount of water in 
 * kilograms and the initial and final temperatures of the water. The 
 * formula to compute the energy is 
 * Q = M * (finalTemperature – initialTemperature) * 4184 
 * where M is the weight of water in kilograms, temperatures are in degrees 
 * Celsius, and energy Q is measured in joules.�
 *
 * @tan ahmed
 * @8/23/19
 */

import java.util.Scanner;
public class Energy
{
    public static void main(String[] args){
    
        //amount of water in kg
        double m;
        //t0 is initial temperature
        double t0;
        //t1 is final temperature
        double t1;
        double q;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the amount of water (in kg)");
        m = in.nextDouble();
        
        System.out.println("Enter the initial temperature");
        t0 = in.nextDouble();
        
        System.out.println("Enter the final temperature");
        t1 = in.nextDouble();
        
        q = m * (t1 - t0) * 4184;
        System.out.println("The energy needed is " + q);
    
    }
}
