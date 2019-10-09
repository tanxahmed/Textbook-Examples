
/**
 *  (Random month) Write a program that randomly generates an integer 
 *  between 1 and 12 and displays the English month name January, 
 *  February, …, December for the number 1, 2, …, 12, accordingly.
 *
 * @tan ahmed
 * @08/29/19
 */

import java.util.Scanner;
public class RandomMonth
{
    public static void main(String[] args){
        int month;
        Scanner in = new Scanner(System.in);
        
        //Math.random is 0.0 < =d < 1
        //generates random number from 1 to 12
        //the number multiplied is always 1 more than what you need
        month = (int)(Math.random() * 13);
        System.out.println(month);
        
        if (month == 1){
            System.out.println("Month is January");}
        else if (month ==2){
            System.out.println("Month is February");}
        else if (month ==3){
            System.out.println("Month is March");}
        else if (month ==4){
            System.out.println("Month is April");}
        else if (month ==5){
            System.out.println("Month is May");}
        else if (month ==6){
            System.out.println("Month is June");}    
        else if (month ==7){
            System.out.println("Month is July");}
        else if (month ==8){
            System.out.println("Month is August");}    
        else if (month ==9){
            System.out.println("Month is September");}    
        else if (month ==10){
            System.out.println("Month is October");}    
        else if (month ==11){
            System.out.println("Month is November");}    
        else if (month ==12){
            System.out.println("Month is December");}  
        else{
            System.out.println("Invalid");}
            
            
            
            
    }
}
