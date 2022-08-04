/*
public class myMethods {
    public static void main(String[]args) {
    myFirstMethod();
    mySecondMethod();
    System.out.println("End of Class overall execution");
    }
    
    public static void myFirstMethod() {
    System.out.println("myFirstMethod execution!");
    }
    
    public static void mySecondMethod(){
    System.out.println("mySecondMethod execution!");
    }
}
*/

public class MyMethods {
    public static void main(String[]args) {
        System.out.println();
        myFirstMethod();
        System.out.println("Methods 1 and 2 executed.");
        System.out.println("End of Class overall execution.");
        System.out.print("\n");
    }
    
    public static void myFirstMethod(){
        System.out.println("myFirstMethod execution!");
        mySecondMethod();
    }
    
    public static int mySecondMethod(){
        System.out.println("mySecondMethod execution!");
    return 1;
    }
}
