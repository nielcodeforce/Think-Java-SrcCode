import java.util.Scanner;

public class Javatest {

//     public static void main(String[]args) {
//
//         Scanner in = new Scanner(System.in);
//         boolean okay;
//
//         do {
//             System.out.println("Enter a number: ");
//             okay = in.hasNextDouble();
//             if (!okay) {
//                 String word = in.next();
//                 System.err.println(word + " is not a number");
//             }
//             System.out.println(okay + " number");
//
//         } while (!okay);
//
//         double x = in.nextDouble();
//         System.out.println(x + " is the number typed.");
//
//     }


    public static void main(String[]args) {

        double number = getDouble();
        System.out.println("The number you typed: " + number);

    }

     public static double getDouble() {

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
                if (in.hasNextDouble()) {
                    break;
                }
            String word = in.next();
            System.err.println(word + " is not a number.");
            System.out.println("Please, type again.");

        }

        double x = in.nextDouble();
        return x;

        }

}
