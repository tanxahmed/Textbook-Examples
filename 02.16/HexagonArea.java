
/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is
 * Area =
 * 323
 * 2
 * s2,�
 *
 * @tan ahmed
 * @08/27/19
 */

import java.util.Scanner;
public class HexagonArea
{
    public static void main(String[] arg) {
    
        double s;
        double area;
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter the side of a hexagon");
        s = in.nextDouble();
        
        area = ((3 * Math.sqrt(3)) / 2) * Math.pow(s, 2);
        System.out.println("The area of the hexagon is " + area);
    }
}
