/*
 *  Demonstration of the concepts treated in the textbook.
 */

import java.util.Scanner;
public class MethodComposition{
    public static void main(String[]args){
        Scanner userNum = new Scanner(System.in);
        System.out.print("Enter the radius for a circle: ");
        System.out.println("The area of such a circle is: " + circleArea(userNum.nextDouble()));
        double distanceReturned = calculateRadius(1.0, 2.0, 4.0, 6.0);
        System.out.println("The 'radius' of the circle is: " + distanceReturned);
        // circleArea();
    }
    
    public static double circleArea(double radius){
        return Math.PI*radius*radius;
    }

    public static double calculateRadius(double x1, double y1, double x2, double y2){
        double dx = x2-x1;
        double dy = y2-y1;
        double dsquared = dx*dx + dy*dy;
        double radius = Math.sqrt(dsquared);
        return radius;
    }
    
//     public static double circleArea(){
//         System.out.println("You should provide at least one parameter.");
//         return 0.0;
//     }
    
}
