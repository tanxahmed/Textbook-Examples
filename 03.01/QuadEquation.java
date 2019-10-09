
/**
 *  (Algebra: solve quadratic equations) The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:

 *  r1=−b+b2−4ac−−−−−−−√2a  and  r2=−b−b2−4ac−−−−−−−√2a
 *  b2 − 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.

 *  Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”.

 *  Note that you can use Math.pow(x, 0.5) to x−−√ .
 *
 * @tan ahmed
 * @08/29/19
 */

import java.util.Scanner;
public class QuadEquation
{
    public static void main(String[] args){
    
        double a, b, c;
        double discriminant;
        double r1, r2;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the values for a, b, c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        
        discriminant = (Math.pow(b, 2)) - (4*a*c);
        System.out.println("Discriminant = " + discriminant);
             
        if (discriminant > 0){
            r1 = (-b + Math.sqrt(discriminant))/(2*a);
            r2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
        else if (discriminant == 0){
            r1 = (-b + Math.sqrt(discriminant))/(2*a); 
            System.out.println("The equation has one root: " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }

    }
    
}
