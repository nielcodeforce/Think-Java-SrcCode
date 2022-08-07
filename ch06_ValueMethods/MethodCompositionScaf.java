/*
 * This src code includes the scaffolding that will not be present in the final code once the program is
 * ready. It's implemented here just as a demo and with training porposes;
 */

import java.util.Scanner;
public class MethodCompositionScaf{
    public static void main(String[]args){
        Scanner userNum = new Scanner(System.in);
        System.out.print("Enter the radius for a circle: ");
        System.out.println("The area of such a circle is: " + calculateArea(userNum.nextDouble()));
        double tempDistReturning = distance(1.0, 2.0, 4.0, 6.0);
        System.out.println("The 'distance' method returns: "+tempDistReturning);
    }
    
    public static double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public static double distance(double x1, double y1, double x2, double y2){
        double dx = x2-x1;
        double dy = y2-y1;
        System.out.println("Dx is: "+dx);
        System.out.println("Dy is: "+dy);
        double dsquared = dx*dx + dy*dy;
        System.out.println("dsquared is: " + dsquared);
        return Math.sqrt(dsquared);
    }
}
