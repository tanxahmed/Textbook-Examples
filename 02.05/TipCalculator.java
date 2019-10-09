
/**
 * (Financial application: calculate tips) Write a program that reads the 
 * subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, 
 * the program displays $1.5 as gratuity and $11.5 as total.�
 *
 * @tan ahmed
 * @08/23/19
 */

import java.util.Scanner;
public class TipCalculator
{
    public static void main (String[] args){
    double subtotal;
    double rate;
    double gratuity;
    double total;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a subtotal");
    subtotal = in.nextDouble();
    
    System.out.println("Enter a gratuity rate");
    rate = in.nextDouble();
    
    gratuity = rate * subtotal;
    total = subtotal + gratuity;
    
    System.out.println("The gratuity is $" + gratuity + " and the total is $" 
        + total);
}
}
