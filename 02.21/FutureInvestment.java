
/**
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 * futureInvestmentValue =
 * investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.�
 *
 * @tan ahmed
 * @08/28/19
 */

import java.util.Scanner;
public class FutureInvestment
{
    public static void main(String[] args){
    
        double years, futureInvestmentValue, investmentAmount, interestRate;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter investment amount: " );
        investmentAmount = in.nextDouble();
                
        System.out.println("Enter interest rate in decimal: ");
        interestRate = in.nextDouble();
        //this is how you calculate interest rate, as seen in the previous question
        interestRate /= 1200;
        
        System.out.println("Enter number of years: ");        
        years = in.nextInt();
       
        futureInvestmentValue = investmentAmount * 
            Math.pow((1 + interestRate),(years*12));
          
        System.out.println("Accumulated value is: " + futureInvestmentValue);
        
        
    }
}
