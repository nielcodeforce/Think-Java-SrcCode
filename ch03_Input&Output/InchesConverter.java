/*
 *   A simple Centimeters to Inches converter demonstrating the concepts presented in the textbook.
 */
    import java.util.Scanner;
    public class InchesConverter{
        public static void main(String args[]){
            System.out.println("..::: HOW-MANY-INCHES :::..\n");
            System.out.println("This app converts from Centimeters to Inches");
            double cm;
            int feet, inches, remainder;
            final double CM_PER_INCH = 2.54;
            final int IN_PER_FOOT = 12;
            
            Scanner get = new Scanner(System.in);
            System.out.print("Exactly how many cm? "); // prompt the user and get the value
            cm = get.nextDouble();
            
            // convert and output the result
            inches = (int)(cm/CM_PER_INCH);
            feet = inches / IN_PER_FOOT;
            remainder = inches % IN_PER_FOOT;
            System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
        }
    }
