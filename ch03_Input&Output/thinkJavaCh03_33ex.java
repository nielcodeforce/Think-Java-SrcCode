/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class thinkJavaCh03_33ex{
        public static void main(String args[]){
            System.out.println("-------- SECONDS CONVERSOR --------");
            
            System.out.print("Enter the total amount of seconds to be converted: ");
            Scanner ask = new Scanner(System.in);
            int totalSeconds = ask.nextInt();  // get the total time in seconds         
            System.out.println();
            int totalHours = totalSeconds / 3600;
            int hoursLeftSeconds = totalSeconds % 3600;
            int totalMinutes = hoursLeftSeconds / 60;
            int minutesLeftSeconds = hoursLeftSeconds % 60;

            System.out.println(totalHours + " hour(s), ");
            System.out.println(totalMinutes + " minutes(s), ");
            System.out.println(minutesLeftSeconds + " seconds.");
            System.out.println();
            System.out.printf("%d hour(s), %d minute(s) and %d seconds.\n", totalHours, totalMinutes, minutesLeftSeconds);
        }
    }
