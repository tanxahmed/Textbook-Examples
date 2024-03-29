
/**
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length =
 * v2/
 * 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway
 * length.�
 *
 * @tan ahmed
 * @8/27/19
 */
import java.util.Scanner;
public class RunwayLength
{
    public static void main(String[] args){
    //acceleration
    double a;
    //takeoff speed
    double v;
    double length;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter speed and acceleration:");
    v = in.nextInt();
    a = in.nextInt();
    
    length = (v * v)/(2 * a);
    System.out.println("The minimum runway length for this airplane is " 
        + length);
    
    }

}
