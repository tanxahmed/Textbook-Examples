
/**
 * (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Note that
 * you can use Math.pow(a, 0.5) to compute 2a.�
 *
 * tan ahmed
 * 08/27/2019
 */

import java.util.Scanner;
public class PointDistance
{
    public static void main(String[] args){
    
        double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter x1 and y1");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        
        System.out.println("Enter x2 and y2");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        
        distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        
        System.out.println("The Distance between the two points is " + 
            distance);
        
    
    }
}
