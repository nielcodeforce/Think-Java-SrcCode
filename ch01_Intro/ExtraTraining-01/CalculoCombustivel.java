/*

b) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (variável TEMPO) e a velocidade média (variável VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTÂNCIA <- TEMPO * VELOCIDADE. A partir do valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS <- DISTÂNCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.

*/

import java.util.*;
public class CalculoCombustivel{

    public static void main(String[]args){

        Scanner askUser = new Scanner(System.in);
        System.out.println("Informe a velocidade média durante a viagem (em km/h): ");
        double velocidade = askUser.nextDouble();
        System.out.println("Qual o tempo de duração da viagem? ");
        double tempo = askUser.nextDouble();
        askUser.close();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("- Tempo gasto na viagem: " + tempo + " hora(s).");
        System.out.println("- A uma velocidade média de: " + velocidade + " km/h");
        System.out.println("- A distância total percorrida: " + calcDistance(velocidade, tempo) + " km.");
        System.out.println("- O total de combustível consumido na viagem: " + fuelConsumption(calcDistance(velocidade, tempo)) + " litros.");
        System.out.println("============================================================================");

    }

    public static double calcDistance(double velocidade, double tempo){

        double distancia = tempo * velocidade;
        return distancia;
    }

    public static double fuelConsumption(double distancia){

        double consumedFuel = distancia / 12;
        return consumedFuel;
    }
}

