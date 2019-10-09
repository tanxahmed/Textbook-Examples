
/**
 *(Cost of driving) Write a program that prompts the user to enter the distance to
 *drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 *and displays the cost of the trip.�
 *
 * @tan ahmed
 * @08/29/19
 */
import java.util.Scanner;
public class CostDriving
{
    public static void main(String[] args){
        
        double distance, mpg, ppg, cost;
        double gallons;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the driving distance ");    
        distance = in.nextDouble();
        
        System.out.println("Enter miles per gallon ");       
        mpg = in.nextDouble();
        
        System.out.println("Enter price per gallon ");    
        ppg = in.nextDouble();
        
        gallons = distance/mpg;
        cost = gallons * ppg;
        
        System.out.println("The cost of driving is " + cost);
        
        
        
    }
    
}
