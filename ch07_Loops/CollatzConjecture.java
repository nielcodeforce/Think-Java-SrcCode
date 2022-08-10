import java.util.Scanner;
public class CollatzConjecture{
    public static void main(String[]args){
    
    //public class Sequence
    Scanner askNum = new Scanner (System.in);
    System.out.println("First we're going to print a sequence starting with 16 as an example: ");
    sequence(16);
    System.out.print("Now, please, enter an integer number: ");
    sequence(askNum.nextInt());
    }
    
        public static void sequence(int n){
            while (n!= 1){
                System.out.println(n);
                if (n%2==0){
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
            }
        }
}
