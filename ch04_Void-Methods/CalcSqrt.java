/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class CalcSqrt{
        public static void main(String args[]){
            Scanner getNum = new Scanner(System.in);
            System.out.print("Enter with the value to be square rooted: ");
            double inputNum = getNum.nextDouble();
            
            System.out.println("The result is: "+Math.sqrt(inputNum));
            
//             double root = Math.sqrt(inputNum);
//             System.out.println(root);
        }
    }
