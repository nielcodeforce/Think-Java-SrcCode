
public class ForStatement {

    public static void main(String[]args) {

        // forStatement();
        printRow(4, 5);

    }
    
    // First version of the ForStatement method:

//     public static void forStatement() {
//         for (int n = 1; n <= 7; n++) {
//             System.out.println(n);
//         }
//         System.out.println("Blastoff!");
//     }
    
    public static void printRow(int n, int cols) {
        int i;
        for (i = 1; i <= cols; i++) {
            System.out.printf("%4d", n * i);
        }

        System.out.print("\nDone! 'i' variable has reached columns' number " + i + " - ");
        System.out.println("I'm out of the loop!");
    }

}
