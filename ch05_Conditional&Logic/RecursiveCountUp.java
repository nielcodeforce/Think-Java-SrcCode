/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class RecursiveCountUp{
        public static void main(String args[]){
            // countup(5);
            System.out.print("Enter an integer number, please: ");
            Scanner inNum = new Scanner(System.in);
            countup(inNum.nextInt());
        }
        
        public static void countup(int n){
            if (n==0){
                System.out.println("Blastoff!");
            } else {
                countup(n-1);
                System.out.println(n);
            }
        }
    }
