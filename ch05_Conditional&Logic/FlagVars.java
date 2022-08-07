/*
* Demo of the use of flag variables and conditional statements.
*/
import java.util.Scanner;
public class FlagVars{

    public static void main(String[] args){
        System.out.print("Type an integer number of your choice: ");
        Scanner typedIn = new Scanner(System.in);
        int n = typedIn.nextInt();
        checkCondition(n);
    }
    
    public static void checkCondition(int userNum){
            boolean flagVar = (userNum % 2 == 0); // true if userNum is even, false if not.
            if (flagVar) {
                System.out.println("The flag variable is "+flagVar+": "+"The number is even.");
            } else if (!flagVar) {
                System.out.println("The flag variable is "+flagVar+": "+"The number is odd.");
            }
    }
}
