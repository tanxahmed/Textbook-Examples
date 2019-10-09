  
/**
 * (Convert pounds into kilograms) Write a program that converts pounds 
 * into kilograms.
 * The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilograms.�
 *
 * @tan ahmed
 * @8/23/19
 */
import java.util.Scanner;

public class PoundsToKg
{
   public static void main (String[] args){
   double kilograms;
   double pounds;
   Scanner in = new Scanner(System.in);
   
   System.out.println("Enter the number of pounds.");
   pounds = in.nextDouble();
   
   kilograms = pounds * 0.454;
   
   System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
   
   } 
}
