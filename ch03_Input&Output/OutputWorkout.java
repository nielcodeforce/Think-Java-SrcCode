/**
 * Working with output formatting.
 */
public class OutputWorkout {
    public static void main(String[] args) {

        System.out.println(System.out);

        System.out.print("The result of (4.0/3.0) is: " + (4.0 / 3.0) + ".");
        System.out.print(" Or, one could say: ");
        System.out.printf("'Four thirds' = %.4f\n", 4.0 / 3.0);

        double pi = 3.14159;
        double x = (int) pi * 20.0;
        System.out.println("The casted value of x is: " + x);
        System.out.println("The value of 'pi' is: " + pi);
        // new code with new things learned:
        x = Math.PI * 20.0;
        System.out.println("The non-casted value of x is: " + x);
    }
}
