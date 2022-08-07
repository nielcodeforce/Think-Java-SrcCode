/*
 *  Demonstration of the concepts treated in the textbook.
 */
 import java.util.Scanner;
 public class AbsoluteValue{
    
    public static void main(String args []){
        Scanner inNum = new Scanner(System.in);
        System.out.print("Enter an integer value, please: ");
//         double result = absoluteValue(inNum.nextInt());
//         System.out.println("Result = "+result);

        System.out.println("Result = " + (int) absoluteValue(inNum.nextInt()));
        // Worth noting that with the above statement you don't have the returned value from the method stored
        // anywhere in the memory for later usage.
    }
    
    public static double absoluteValue(double x){
        if (x<0){
            return -x;
        } else {
            return x;
        } 
    }
    
 }
