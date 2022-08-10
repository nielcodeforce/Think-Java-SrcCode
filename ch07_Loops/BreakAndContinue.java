import java.util.Scanner;
public class BreakAndContinue{
    
    public static void main(String[]args){
        // getDouble();
        continueDemo();
    }
    
    public static void getDouble(){
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()){
                break;
            }
            String word = in.nextLine();
            System.err.println(word + " is not a number.");
        }
        double x = in.nextDouble();
        System.out.println("The number entered is: " + (int) x);
    }
    
    public static void continueDemo(){ // Demostration of the continue statement
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while(x != 0){
            x = in.nextInt();
            if (x <= 0){
                continue;
            }
            System.out.println("Adding " + x);
            sum += x;
        }
    }

}
