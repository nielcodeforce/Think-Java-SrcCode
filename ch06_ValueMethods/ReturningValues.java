import java.util.Scanner;
public class ReturningValues{
    public static void main(String[]args){    
        
        // int value = myReturnFunction();
        // System.out.println("Return value from 'myReturnFunction()' is: "+ value);
        
        System.out.println("User value is: " + getUserValue());
    }
    
    public static int myReturnFunction(){
        return 45;
    }
    
    public static int getUserValue(){
        Scanner askValue = new Scanner(System.in);
        System.out.print("Enter an integer value of your choice, please: ");
        int userValue = askValue.nextInt();
        return userValue;
    }
}


/*
import java.util.Scanner;
public class javatest{
    public static void main(String[]args){
        // int value = myReturnFunction();
        Scanner myIntValue = new Scanner(System.in);
        System.out.print("Enter an integer number of your choice, please: ");
        int IntValue = myIntValue.nextInt();
        System.out.println("Return value from 'myReturnFunction()' is: " + myReturnFunction(IntValue));
    }
    
    public static int myReturnFunction(int value){
        int x = 2 * value;
        return x;
    }
}
*/
