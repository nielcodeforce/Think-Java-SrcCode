/*
 *  Demonstration of the concepts treated in the textbook.
*/
    import java.util.Scanner;
    public class InchesConverter{
        public static void main(String args[]){
            System.out.println("..::: HOW-MANY-INCHES :::..");
            System.out.println("This app converts from Centimeters to Inches.\n");
            Scanner get = new Scanner(System.in);
            System.out.print("Enter the value in Centimeter(s) you want to see in Inche(s): "); // prompt the user and get the value
            double cm = get.nextDouble();
            cm2Inch(cm);
            }
            
        public static void cm2Inch(double cm){
            // constat declarations
            int feet, inches, remainder;
            final double CM_PER_INCH = 2.54;
            final int IN_PER_FOOT = 12;
            // convert and output the result
            inches = (int)(cm/CM_PER_INCH);
            feet = inches / IN_PER_FOOT;
            remainder = inches % IN_PER_FOOT;
            System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
        }
    }
