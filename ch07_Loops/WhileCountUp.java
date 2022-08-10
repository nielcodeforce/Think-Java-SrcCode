import java.util.Scanner;
public class WhileCountUp{

    public static void main(String[]args){

        System.out.println("Starting CountUp!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from which to count up to 1000: ");
        countup(input.nextInt());

    }


    public static void countup(int n){

        while(n <= 1000){
            if((n%2) == 0){
                System.out.print(" "+n);
            }
            n = ++n;
        } System.out.println("\nUpper limit reached!");

    }

}
