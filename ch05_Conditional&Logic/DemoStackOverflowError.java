public class DemoStackOverflowError{
    public static void main(String[]args){
        System.out.println("Main method begining");
        forever("Calling forever method.");
    }
    
    public static void forever(String s){
        System.out.println(s);
        forever(s);
    }
}
