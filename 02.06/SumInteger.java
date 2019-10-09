
/**
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total.�
 *
 * tan ahmed
 * 8/23/19
 */

import java.util.Scanner;
public class SumInteger
{
    public static void main (String[] args){
    
        int integer;
        int sum;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number between 0 and 1000: ");
        integer = in.nextInt();
        
        sum = ((integer/100)%10) + ((integer/10)%10) + (integer % 10);
        System.out.println("The sum of the digits is " + sum);
        
        
    
    }
}
