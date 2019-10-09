
/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = 2s(s - side1)(s - side2)(s - side3)�
 *
 * @tan ahmed
 * @8/28/2019
 */

import java.util.Scanner;
public class AreaTriangle
{
    public static void main(String[] args) {
    
        double x1, x2, x3, y1, y2, y3, area, s, side1, side2, side3;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first point coordinates for a triangle: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
                
        System.out.println("Enter second point coordinates for a triangle: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
                
        System.out.println("Enter third point coordinates for a triangle: ");
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        
        //how you obtain the sides 
        side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
	side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
	side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        
        
        s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        
        System.out.println("The area of the triangle is " + area);
        
    }
    
}
