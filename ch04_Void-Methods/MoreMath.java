import java.util.Scanner;
public class MoreMath{
    
    public static void main(String[]args){
        mathStuff();
        // System.out.println(double); Error!!!
        }
        
        private static void mathStuff(){
            Scanner InputNum = new Scanner(System.in);
            System.out.print("Type a number to be square rooted: ");
            double num = InputNum.nextDouble();
            printDoubles(Math.sqrt(num));  // Insted of: 'double sqroot = Math.sqrt(num);'
            // printDoubles(Math.sqrt(121)); // Example of a method's result passed as an argument to another method.
            Double returnedValue = Math.sqrt(num);
            // return returnedValue;
        }
        
        private static void printDoubles(Double x){
            System.out.println("The result of the requested operation is: "+x);
        }
}
