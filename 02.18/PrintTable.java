
/**
 * (Print a table) Write a program that displays the following table. Cast 
 * floating point numbers into integers.
 * a b pow(a, b)
 * 1 2 1
 * 2 3 8
 * 3 4 81
 * 4 5 1024
 * 5 6 15625
 *
 * @tan ahmed
 * @08/27/19
 */

public class PrintTable
{
    public static void main(String[] args) {
    
        int a;
        int b;
        
        a = 1;
        b = 2;
        
        System.out.println("a   b   pow(a, b)");
        System.out.println(" " + ++a + "   " + ++b + "   " + Math.pow(a,b));
        System.out.println(" " + ++a + "   " + ++b + "   " + Math.pow(a,b));
        System.out.println(" " + ++a + "   " + ++b + "   " + Math.pow(a,b));
        System.out.println(" " + ++a + "   " + ++b + "   " + Math.pow(a,b));
        System.out.println(" " + ++a + "   " + ++b + "   " + Math.pow(a,b));
    }
}
