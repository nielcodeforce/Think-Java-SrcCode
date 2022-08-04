/*
 * Using input from the user in order to calculate the value of pounds translated to kilograms.
*/
import java.util.Scanner;
public class PoundsConverter {
    public static void main(String[] args){
        
        System.out.println("\n..:: CONVERSOR POUNDS PARA QUILOS ::..");
        System.out.println("- Let's convert a certain value in pounds to kilograms:");
        double valueInPounds=0;
        Scanner in = new Scanner (System.in);
        System.out.print("What's the amount in pounds you need to convert to kilograms? ");
        valueInPounds = in.nextDouble();
        double valueInKilograms = valueInPounds * 0.45359237d;
        System.out.println("The value of "+ valueInPounds +" pounds converted to kilos is: "+valueInKilograms);
        
    }
}
