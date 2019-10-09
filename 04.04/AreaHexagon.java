
/**
(Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):
Area =
6 * s2
4 * tan¢p
6
≤
Write a program that prompts the user to enter the side of a hexagon and displays
its area.�
 */

import java.util.Scanner;
public class AreaHexagon
{
    public static void main(String[] args){
        double s, area;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the side");
        s = in.nextDouble();
        
        area = (6 * (s*s)) / (4 * Math.tan((Math.PI)/6));
        
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
