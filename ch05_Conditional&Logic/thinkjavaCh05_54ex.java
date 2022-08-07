/*
 *  Demonstration of the concepts treated in the textbook.
 */
 
 import java.util.Scanner;
 public class thinkjavaCh05_54ex{
    public static void main(String args []){
        int a, b, c, n;
        Scanner getNum = new Scanner(System.in);
        System.out.println("Please, enter four numbers to feed the Fermat's Last Theorem we're about to test.");
        System.out.println("Fermat's Last Theorem has the form: (a^n)+(b^n)=(c^n), except when n<=2.");
        System.out.println("Value for 'a' is: ");
        a = getNum.nextInt();
        System.out.println("Value for 'b' is: ");
        b = getNum.nextInt();
        System.out.println("Value for 'c' is: ");
        c = getNum.nextInt();
        System.out.println("Value for 'n' is: ");
        n = getNum.nextInt();
        System.out.println("The values are: "+a+", "+b+", "+c+", "+n+", "+" respectivelly.");//Output for testing
        
        // checkFermat(a, b, c, n);
         System.out.println(Math.pow(a, n)+Math.pow(b, n));
         System.out.println(Math.pow(c, n));
         int z;
         System.out.println("Entre com uma variável aleatória z: "+getNum.nextInt());
         
         
         
    }
    
//     int a, int b, int c, int n

//     public static void checkFermat(){ 
//        Math.pow((a, n) + (b, n) = (c, n));
//        if (Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n)) {
//          System.out.print("Yes!");
//        }
//     }
    
 }
