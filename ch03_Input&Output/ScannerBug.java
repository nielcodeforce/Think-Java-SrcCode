/*
 *  Demonstration of the "Scanner Bug".
 */
    import java.util.Scanner;
    public class ScannerBug{
        public static void main(String args[]){
        Scanner ask = new Scanner(System.in);
            
            System.out.println("Hi, whats your age? ");
            int userIdade = ask.nextInt();
            
            ask.nextLine(); // add 'SINGLE COMMENTS' sign to the beginning of the statement and recompile this
            // source file to see the bug in action!
            System.out.print("And your name, please? ");
            String userName = ask.nextLine();
            
            System.out.printf("Hello %s, age %d. \n", userName, userIdade);
            // System.out.println("Nice to meet you, " + userName + ", " + userIdade + " years old.\n");
        }   
    }
