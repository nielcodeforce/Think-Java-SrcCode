/*
 *  Demonstration of the concepts treated in the textbook.
*/
    import java.util.Date;
    public class PrintDateFormat{
        public static void main(String args[]){
//         
//                 Date novaData = new Date();
//                 System.out.println(novaData);
//
            
            int year = 2021;
            int calendarDay = 22;
            String month = "August";
            String weekDay = "Sunday";
            printAmerican(weekDay, month, calendarDay, year);
            printEuropean(weekDay, month, calendarDay, year);
            }
            
            static void printAmerican(String weekDay, String month, int calendarDay, int year){
                System.out.println(weekDay+", "+month+" "+calendarDay+", "+year);
            }
            
            static void printEuropean(String weekDay, String month, int calendarDay, int year){
                System.out.println(year+", "+month+" "+calendarDay+", "+weekDay+".");
            }
}
