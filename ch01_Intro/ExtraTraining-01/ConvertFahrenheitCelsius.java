import java.util.Scanner;
public class ConvertFahrenheitCelsius{

    public static void main(String[]args){

        Scanner askTemp = new Scanner(System.in);
        System.out.print("Qual a temperatura em Fahrenheit? ");
        double Fahrenheit = askTemp.nextDouble();
        askTemp.close();
        System.out.println("Temperatura de "+Fahrenheit+" °F, equivale a "+convertToCelsius(Fahrenheit)+" °C");

    }

    public static double convertToCelsius(double Fahrenheit){

        double Celsius = ((Fahrenheit-32)*5)/9;
        return Celsius;

    }

}
