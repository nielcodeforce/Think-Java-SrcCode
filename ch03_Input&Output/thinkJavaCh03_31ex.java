/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class thinkJavaCh03_31ex{
        public static void main(String args[]){
            Scanner ask = new Scanner(System.in);
            System.out.print("Please, type in a interger number: ");
            int userNum1 = ask.nextInt();  // prompt the user and get an integer
            System.out.print("Now, type a double type number, please: "); // get a double
            double userNum2 = ask.nextDouble();
            System.out.printf("You typed %d for integer and %.2f for double. \n", userNum1, userNum2);
        }
    }
    
    
