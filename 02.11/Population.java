
/**
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number 
 * of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer.
 *
 * @tan ahmed
 * @8/23/19
 */

import java.util.Scanner;
public class Population
{
    public static void main(String[] args){
    
    int years;
    int population = 312032486;
    Scanner in = new Scanner (System.in);
    
    System.out.println("The population at the moment is " + population);
    System.out.println("Enter the number of years");
    years = in.nextInt();
    
    //there are 31536000 seconds in a year
    double births = 31536000/7;
    double deaths = 31536000/13;
    double immigrants = 31536000/45;
    population = (int)(population + (births * years) + (immigrants * years) 
        - (deaths * years));
        
    System.out.println("The population in " + years + " years is " + 
        population);
      
    
    
    
    }
}
