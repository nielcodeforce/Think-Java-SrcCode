/*
 *  Demonstration of the concepts treated in the textbook.
 */
    // import java.util.Scanner;
    public class PrintTime{
        public static void printTime(int hour, int minute){
            System.out.print(hour);
            System.out.print(":");
            System.out.println(minute);
        }
        
        public static void main(String args []){
            int martelo = 11; // a sweet name for my local variable in main.
            int pregos = 59; // another sweet name for a second local variable in main.
            System.out.print("Current time: ");
            printTime(martelo, pregos); // no matter what their names are here, but their types as they are passed on.
            timeWakeUp();
        }
        
        public static void timeWakeUp(){
            int hour = 5;
            int minute = 30;
            System.out.print("WakeUp Time: ");
            printTime(7, minute);
        }
    }
