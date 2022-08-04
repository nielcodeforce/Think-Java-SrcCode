/*
 *  Demonstration of the concepts treated in the textbook.
*/
    import java.util.Scanner;
    public class PrintTimeAlarm{
    
        public static void printTime(int hour, int minute){
            System.out.print(hour);
            System.out.print(":");
            System.out.println(minute);
        }
        
        public static void main(String args []){
            int hour = 9;
            int minute = 00;
            System.out.println("Current time: ");
            printTime(hour, minute);
            setAlarm();
        }
        
        public static void setAlarm(){
            int hour = 8;
            int minute = 30;
            System.out.println("Time to WakeUp: ");
            printTime(hour, minute);
            System.out.println("Type 'y' (yes) if you wanna reset the timer or 'n' (no) to skip");
            Scanner askUser = new Scanner(System.in);
            char userAnswer = askUser.nextChar();
            if (userAnswer == y){
                System.out.println("Lets set the new hour for the Alarm Timer:");
                Scanner setTime = new Scanner(System.in);
                int wakeUpHour = setTime.nextInt();
                System.out.print("Now let's set the minutes for the WakeUp time: ");
                int wakeUpMinute = setTime.nextInt();
                System.out.print("The new time for your wake-up time alarm is: ");
                System.out.println(wakeUpHour+" hour(s) and "+wakeUpMinute+" minute(s).");
                printTime(wakeUpHour, wakeUpMinute);
            } else if (userAnswer == n) {
                System.out.println();
                System.out.println("Alarm Timer Unchanged");
            }

        }
    }
    
