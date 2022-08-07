import java.util.Scanner;
public class BooleanMethods{
    public static void main(String [] args){
        Scanner askNum = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        System.out.println(isSingleDigit(askNum.nextInt()));
        boolean bigFlag = !isSingleDigit(14);
        System.out.println(bigFlag);
    }
    
    public static boolean isSingleDigit(int x){
        return (x>-10 && x<10);
    }
}
