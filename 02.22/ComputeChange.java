
/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
 * .java, to fix the possible loss of accuracy when converting a double value to an
 * int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.�
 *
 * @tan ahmed
 * @08/29/19
 */

import java.util.Scanner;
public class ComputeChange
{
    public static void main(String[] args){
        int amount, dollars, cents;
        int numberOfQuarters, numberOfDollars, numberOfDimes, 
            numberOfNickels, numberOfPennies;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter money without decimal point ($11.56 will be 1156)");
        
        amount = in.nextInt();     
        dollars = amount / 100;
        cents = amount % 100;
                   
        numberOfQuarters = cents / 25;
        cents = cents % 25;
                
        numberOfDimes = cents / 10;
        cents = cents % 10;
        
        numberOfNickels = cents / 5;
        cents = cents % 5;
        
        numberOfPennies = cents;
        
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + dollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
        
    
    }
}
