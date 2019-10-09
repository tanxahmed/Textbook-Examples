

/**
 * (Algebra: solve 2 × 2 linear equations) A linear equation can be 
 * solved using Cramer’s rule given in Programming Exercise 1.13. 
 * Write a program that prompts the user to enter a, b, c, d, e, 
 * and f and displays the result. If ad − bc is 0, report that 
 * “The equation has no solution.”
 *
 * @tan ahmed
 * @08/29/19
 */

import java.util.Scanner;
public class LinearEquation
{
    public static void main(String[] args){
    
        double a, b, c, d, e, f;
        double x, y;
        double result;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the six values for this linear function");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        e = in.nextDouble();
        f = in.nextDouble();       
        
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        
        //if denominator is zero, then there is no solution
        if ((a*d)-(b*c)==0){
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("x is " + x + " and y is " + y);
        }
        
    }

}
