import java.util.Scanner;

public class DoWhileLoop {
    
    public static void main(String[]args) {
        getDouble();
    }
    
    public static void getDouble() {
        Scanner in = new Scanner (System.in);
        boolean okay;
        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.nextLine();
                System.err.println(word + " is not a number in computer terms. Use numeric format, please.");
            }
        } while (!okay);
        
        //double x = in.nextDouble();
        //System.out.println("You typed: " + x);
        System.out.println("You typed: " + in.nextDouble());
    }
}
