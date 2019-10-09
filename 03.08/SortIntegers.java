/**
 * (Sort three integers) Write a program that prompts the user to enter 
 * three integers and display the integers in non-decreasing order.
 *
 * @tan ahmed
 * 08/29/19
 */

import java.util.Scanner;
public class SortIntegers
{
    public static void main(String[] args){
        int a, b, c, temp;
        Scanner in = new Scanner(System.in);
        
       
        System.out.println("Enter three integers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();    
        
        //need this to show in increasing order
        //it's best to swap numbers here to display 
        
        //this is if a is greater than b
        /*for example if a=10 and b=3, then a will become 3 and 
        b will become 10*/
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        
        //this is if b is greater than c
        /*for example, if b=10 and c=4, then b will be 4 and c will be 
        10.  or if b=3 from previous example, then b and c stay the same
        */
        if (b > c){
            temp = b;
            b = c;
            c = temp;
        }
        
        /*this is if b is greater than a, if above happened.  so if b 
        became 4 and a is 10, then these swap.
        */
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println("The order is " + a + " " + b + " " + c);
        
        
        
        
        
        
    }
}