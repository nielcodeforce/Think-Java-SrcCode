import java.util.Scanner;
public class Divisability{
    
    
    public static void main(String [] args){
        getDivOperands();
    }
    
    public static void getDivOperands(){
        Scanner askNum = new Scanner(System.in);
        System.out.println("---- DIVISABILITY TEST ----");
        System.out.print("Enter an integer number to be our dividend: ");
        int a = askNum.nextInt();
        System.out.print("Now enter a second integer that's to be our divisor: ");
        int b = askNum.nextInt();
        
        boolean isDivResult = isDivisible(a, b);
        System.out.println(isDivResult);
    }
    
    public static boolean isDivisible(int a, int b){
        System.out.println("a is: "+a); // scaf code
        System.out.println("b is: "+b); // scaf code
        System.out.println("The result is: " + ((double)(a/b));
        if (a%b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
