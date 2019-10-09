
/**
 * Compute the volume of a cylinder) Write a program that reads in the radius 
 * and length of a cylinder and computes the area and volume using the 
 * following formulas:
 * area = radius * radius * 3.14 (pi)
 * volume = area * length
 *
 * @tan ahmed
 * @8/23/2019
 */

import java.util.Scanner;

public class Sizes
{
    public static void main(String[] args) {
        double radius;
        double area;
        double length;
        double volume;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius of a cylinder: ");
        radius = in.nextDouble();
        area = radius * radius * 3.14;
        
        System.out.println("Enter the length of a cylinder: ");
        length = in.nextDouble();
        volume = area * length;
              
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
        
        
    }
}
