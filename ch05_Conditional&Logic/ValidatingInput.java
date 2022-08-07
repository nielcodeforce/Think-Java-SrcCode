/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class ValidatingInput{
        public static void main(String args[]){
            System.out.println("---- ::: LOGARITHM CALC ::: ----");
            scanDouble();
        }
        
        public static void printLogarithm(double x){
                if (x<=0.0) {
                    System.err.println("Error: x must be positive");
                    return;
                }
            System.out.println("The log of "+ x + " is " + Math.log(x));
        }
        
        public static void scanDouble(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            if (!in.hasNextDouble()){
                String word = in.nextLine();
                System.err.println(word+" is not a number. It's a string.");
                return;
            }
            // double x = in.nextDouble();
            // printLogarithm(x);
            printLogarithm(in.nextDouble());
        }
    }
