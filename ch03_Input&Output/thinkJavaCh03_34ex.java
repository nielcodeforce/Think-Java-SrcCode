/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    import java.util.Random;
    public class thinkJavaCh03_34ex{
        public static void main(String args[]){
            System.out.println("::: GUESS MY NUMBER!!! :::\n");
            Random random = new Random();
            int number = random.nextInt(5)+1;
            System.out.println("I'm thinking of a number between 1 and 5 "+
            "(including both). Can you guess what it is? ");
            
            // System.out.println("(- Alright, you wanna cheat then! The number was: "+number+")");
            
            System.out.print("Try a number: ");
            Scanner ask = new Scanner(System.in);
            int guessNumber = ask.nextInt();  // get the number the user thinks is the answer.            
            System.out.println("Your guess is: " + guessNumber);
            if (number!=guessNumber){
                System.out.println("You were off by: " + (guessNumber-number) + "."+" The number was: "+number);
            } else {
                System.out.println("That's right! The number was: " + number + "." + " You got it.");
            }
        }
    }
