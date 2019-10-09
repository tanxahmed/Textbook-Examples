
/**
 * (Game: add three numbers) The program in Listing 3.1 AdditionQuiz.java, generates two integers and prompts the user to enter the sum of these two 
 * integers. Revise the program to generate three single-digit integers and prompt the user to enter the sum of these three integers.
 *
 * @tan ahmed
 * @08.29.19
 */

import java.util.Scanner;
public class ThreeNumGame
{
    public static void main(String[] args){
    
        int number1, number2, number3, answer;
        Scanner in = new Scanner(System.in);
        
        //these are good for random number generators
        number1 = (int)(System.currentTimeMillis() % 10);
        number2 = (int)(System.currentTimeMillis() / 10 % 10);
        number3 = (int)(System.currentTimeMillis() / 100 % 10);
        
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
   
        answer = in.nextInt();
   
        System.out.println(number1 + " + " + number2 + " + " + number3 + " is " +
         (number1 + number2 + number3 == answer));
    
    }
}
