import java.util.Scanner;
public class TemperatureConverter{

    public static void main(String[]args){

        System.out.println(" __________::: CONVERSOR DE TEMPERATURA :::__________");
        System.out.println();
        System.out.println("Escolha um tipo de conversão dentre as opções abaixo:\n");
        System.out.println("1) Celsius para Fahrenheit ");
        System.out.println("2) Fahrenheit para Celsius ");
        System.out.println("3) Sair. \n");
        System.out.print("Entre o número da opção: ");
        Scanner askUser = new Scanner(System.in);
        int userChoice = askUser.nextInt();
        if(userChoice==3){
            System.out.println(">>> Encerrando execução!");
        } else if (userChoice==1){
            System.out.print("Informe o valor da temperatura em Celsius: ");
            double tempCelsius = askUser.nextDouble();
            System.out.println("\n>>> O valor de "+tempCelsius+" °C equivale a "+convertToFahrenheit(tempCelsius)+" °F");
        } else if (userChoice==2){
            System.out.print("Informe o valor da temperatura em Fahrenheit: ");
            double tempFahrenheit = askUser.nextDouble();
            System.out.println("\n>>> O valor de "+tempFahrenheit+" °F equivale a "+convertToCelsius(tempFahrenheit)+" °C");
        } else {
            System.out.println(">>> Opção inexistente!");
        }

        askUser.close();

    }

    // Temperatura em graus Fahrenheit convertida em graus Celsius:

    public static double convertToCelsius(double Fahrenheit){

        double Celsius = ((Fahrenheit-32)*5)/9;
        return Celsius;

    }

    // Temperatura em graus Celsius convertida em graus Fahrenheit:

    public static double convertToFahrenheit(double Celsius){

        double Fahrenheit = (9*Celsius+160)/5;
        return Fahrenheit;

    }

}
