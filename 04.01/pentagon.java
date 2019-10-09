/*(Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon.

The formula for computing the area of a pentagon is Area =
5 * s2
4 * tan¢p
5
≤
, where
s is the length of a side. The side can be computed using the formula s = 2r sin
p
5
,
where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point.*/

import java.util.Scanner;
public class pentagon
{
    public static void main(String[] args){
        double r, s;
        double area;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the length from the center to a vertex: ");
        r = in.nextDouble();
        
        s = 2 * r * Math.sin(Math.PI / 5);
        area = (5 * (s*s))/ (4 * (Math.tan(Math.PI / 5)));
        
        System.out.printf("The area of the pentagon is %.2f", area);

    }
}