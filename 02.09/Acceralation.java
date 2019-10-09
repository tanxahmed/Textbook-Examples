
/**
 * (Physics: acceleration) Average acceleration is defined as the change of 
 * velocity divided by the time taken to make the change, as shown in the 
 * following formula: a = v1 - v0 / t
 * Write a program that prompts the user to enter the starting velocity v0 
 * in meters/second, the ending velocity v1 in meters/second, and the time 
 * span t in seconds, and displays the average acceleration.�
 *
 * @tan ahmed
 * @8/23/19
 */

import java.util.Scanner;
public class Acceralation
{
    public static void main(String[] args){
    
    double v0;
    double v1;
    double time;
    double acceleration;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a starting velocity");
    v0 = in.nextDouble();
    
    System.out.println("Enter an ending velocity");
    v1 = in.nextDouble();
    
    System.out.println("Enter the time span (seconds)");
    time = in.nextDouble();
    
    acceleration = (v1 - v0) / time;
    
    System.out.println("The average acceleration is " + acceleration);
      
    
    }
    
}
