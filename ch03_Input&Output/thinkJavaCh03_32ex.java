/*
 *  Simple temperature conversor - from Celsius to Fahrenheit.
 */
    import java.util.Scanner;
    public class thinkJavaCh03_32ex{
        public static void main(String args[]){
            Scanner get = new Scanner(System.in);
            System.out.print("Type the temperature in Celsius for convertion, please: ");
            double tempCelsius = get.nextDouble();  // get the temperature in Celsius
            System.out.println("You entered "+ tempCelsius +"° Celsius."); // some feedback to user
            double tempFahrenheit = ((tempCelsius * (9f/5f)) + 32);
            System.out.printf("%.1f °C = %.1f °F\n", tempCelsius, tempFahrenheit);
        }
    }
    
    
