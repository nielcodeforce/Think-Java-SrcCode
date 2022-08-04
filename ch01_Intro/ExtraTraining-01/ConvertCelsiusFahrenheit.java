import java.util.Scanner;
public class ConvertCelsiusFahrenheit{

    public static void main(String[]args){

        Scanner inputTemp = new Scanner(System.in);
        System.out.print("Informe o valor da temperatura em Celsius: ");
        double tempInCelsius = inputTemp.nextDouble();
        inputTemp.close();
        System.out.println(tempInCelsius+" °C equivale a " + convertToFahrenheit(tempInCelsius)+" °F.");

    }

    public static double convertToFahrenheit(double Celsius){

        double Fahrenheit = (9*Celsius+160)/5;
        return Fahrenheit;

    }

}
