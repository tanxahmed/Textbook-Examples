
/**
 * (Find the number of years) Write a program that prompts the user to enter 
 *  the minutes (e.g., 1 billion), and displays the number of years and days 
 *  for the minutes. For simplicity, assume a year has 365 days.�
 *
 * @tan ahmed
 * @8/23/19
 */

import java.util.Scanner;
public class NumberYears
{
    public static void main (String[] args){
    
    int minutes;
    int years;
    int days;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the number of minutes: ");
    minutes = in.nextInt();
    
    years = minutes / 525600;
    days = ((minutes % 525600) / 1440);
    
    System.out.println(minutes + " minutes is approximately " + 
        years + " years and " + days + " days");
        
    }
    
}
