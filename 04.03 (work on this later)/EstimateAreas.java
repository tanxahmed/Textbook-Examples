
/**
 * Write a description of class EstimateAreas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class EstimateAreas
{
    public static void main(String[] args){
        double ax, ay;
        double ox, oy;
        double sx, sy;
        double cx, cy;
        double d1, d2, d3, d4, radius;
        Scanner in = new Scanner(System.in);
        
        //a = atlanta coordinates
        ax = Math.toRadians(40.41044);
        ay = Math.toRadians(-99.40505000000002);
        //o = orlando coordinates
        ox = Math.toRadians(28.5383);
        oy = Math.toRadians(81.3792);
        //s = savannah coordinates
        sx = Math.toRadians(32.0809);
        sy = Math.toRadians(81.0912);
        //c = charlotte coordinates
        cx = Math.toRadians(35.2271);
        cy = Math.toRadians(80.8431);

        radius = 6371.01;
        
        //distance between charlotte to savannah
        d1 = radius * Math.acos(Math.sin(cx) * Math.sin(cy) + Math.cos(cx) * Math.cos(cy) * Math.cos(sx - sy));
        //distance between savannah to orlando
        d2 = radius * Math.acos(Math.sin(sx) * Math.sin(sy) + Math.cos(sx) * Math.cos(sy) * Math.cos(ox - oy));
        //distance between orlando to atlanta
        d3 = radius * Math.acos(Math.sin(ox) * Math.sin(oy) + Math.cos(ox) * Math.cos(oy) * Math.cos(ax - ay));        
        //distance between atlanta to charlotte
        d4 = radius * Math.acos(Math.sin(ax) * Math.sin(ay) + Math.cos(ax) * Math.cos(ay) * Math.cos(cx - cy));  
        
        
        System.out.println("The distance between Charlotte to Savannah is " + d1);
        System.out.println("The distance between Savannah to Orlando is " + d2);
        System.out.println("The distance between Orlando to Atlanta is " + d3);
        System.out.println("The distance between Atlanta to Charlotte is " + d4);
        
    }
}

