
/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that 
 * displays the current time in GMT. Revise the program so that it prompts 
 * the user to enter the time zone offset to GMT and displays the time in 
 * the specified time zone.�
 *
 * @tan ahmed
 * @8/23/19
 */

import java.util.Scanner;
public class ShowTime
{
    public static void main(String[] args){
    long totalHours, currentHours;
    long totalMinutes, currentMinutes;
    long totalSeconds, currentSeconds;
    long totalMilliseconds, currentMilliseconds;
    long GmtOffset;
    Scanner in = new Scanner(System.in);
    
    
    totalMilliseconds = System.currentTimeMillis();
        
    totalSeconds = totalMilliseconds / 1000;
    currentSeconds = totalSeconds % 60;
    
    totalMinutes = totalSeconds / 60;
    currentMinutes = totalMinutes % 60;
    
    totalHours = totalMinutes / 60;
    currentHours = totalHours % 24;

    System.out.println("The time is " + currentHours + ":" + currentMinutes 
        + ":" + currentSeconds);
    
    System.out.println("Enter the GMT offset");    
    GmtOffset = in.nextInt();
    
    currentHours = currentHours - GmtOffset;
       
    System.out.println("The new time is " + currentHours + ":" + currentMinutes 
        + ":" + currentSeconds); 
    }
}
