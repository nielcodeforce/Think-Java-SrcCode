*/  Using variables and expressions to manage data in your code. */

public class TimeCounter {
    public static void main(String[]args){
        
        int hour, minute, second;
        hour = 10;
        minute = 25;
        second = 60;
        System.out.println("Hora atual: " +hour+":"+minute+":"+second+".");
        
        int secondsTimeSinceMidnight = (3600 * hour) + (60 * minute) + second;
        int minutesTimeSinceMidnight = (secondsTimeSinceMidnight/60);
        int hourTimeSinceMidnight = (626/60);
                
        System.out.println("Tempo transcorrido desde a meia-noite, em segundos: " + secondsTimeSinceMidnight + " segundos.");
        System.out.println("Tempo transcorrido desde a meia-noite, em minutos: " + minutesTimeSinceMidnight + " minutos.");
        System.out.println("Tempo transcorrido desde a meia-noite, em horas: " + hourTimeSinceMidnight+" horas.");
       
    }
}
