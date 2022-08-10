/*
 *  Demonstration of the concepts treated in the textbook.
 */

 public class CountUpDown{
    public static void main(String[]args){
        recursiveCountDown(5);
        whileCountDown(5);
    }
        // Using recursivity to count down as an example
        public static void recursiveCountDown(int n){
            if (n==0) {
                System.out.println("Blastoff!");
            } else {
                recursiveCountDown(n-1);
                System.out.println(n);
            }
        }
        
        // Using a While Loop to count down for comparison
        public static void whileCountDown(int i){
            // int i=100; - Not necessary if the method gets this via argument parsing
            while(i>=0){
                System.out.println(i);
                i = --i;
            }
        }
 }
