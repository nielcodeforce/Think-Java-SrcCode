import java.util.Scanner;
public class BinaryNumbers{
    public static void main(String [] arg){
        System.out.print("Enter a decimal number you'd like to convert to Binary: ");
        Scanner getNum = new Scanner(System.in);
        int userNum = getNum.nextInt();
        displayBinary(userNum);
        System.out.println();
        System.out.println("Convertion App closed.");
    }

    public static void displayBinary(int value){
        if (value > 0){
            displayBinary(value/2);
            System.out.print(value%2);
        } 
    }
}
