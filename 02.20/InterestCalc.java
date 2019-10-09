
/**
 * (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly payment
 * using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month.�
 *
 * tan ahmed
 * 08/28/19
 */

import java.util.Scanner;
public class InterestCalc
{
    public static void main(String[] args){
    
        double interest, balance, annualInterestRate;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the balance and interest rate: ");
        balance = in.nextDouble();
        annualInterestRate = in.nextDouble();
        
        interest = balance * (annualInterestRate/1200);
        
        System.out.println("The interest is " + interest);
          
             
        
    }
    
}
