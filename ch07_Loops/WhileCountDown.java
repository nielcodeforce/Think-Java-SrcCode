import java.util.Scanner;
public class WhileCountDown{

    public static void main(String[]args){

        System.out.println("Starting countdown!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from which to countdown: ");

        countdown(input.nextInt());

    }

    public static void countdown(int n){

        while(n > 0){
            System.out.println(n);
            n = n - 1;
        } System.out.println("Blastoff!");

    }

}
