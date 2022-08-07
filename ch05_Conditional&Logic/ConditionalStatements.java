import java.util.Scanner;

public class ConditionalStatements{
    public static void main(String[] args){
        Scanner askNum = new Scanner(System.in);
        System.out.print("Enter an integer number between -100 and 100, inclusive: ");
        int x = askNum.nextInt();
        if (x<-100 || x>100){ 
            System.out.print("Invalid value! The value you entered is out of range. Try again, please: ");
            x = askNum.nextInt();}
            if (x<-100 || x>100) { System.out.println("Invalid value again!!! The app is going to exit.");
            return; 
            } else if (x > 0){
                System.out.println("X is positive.");
            } else if (x < 0){
                System.out.println("X is negative.");
            } else {
                System.out.println("X is null.");
            }
        }
    }
