/* 
*  Cálculo da média ponderada.
*/

import java.util.Scanner;
public class CalcMediaPonder{

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double a = reader.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = reader.nextDouble();
        

        final double WEIGHT_A = 5.5; // Assumindo que os pesos não mudam: CONSTANTES - tipo final
        final double WEIGHT_B = 7.5; // Assumindo que os pesos não mudam: CONSTANTES - tipo final
        var TOTAL_WEIGHT = 11; // tipo final

        double m = (a*WEIGHT_A + b*WEIGHT_B ) / TOTAL_WEIGHT;

        System.out.println("MEDIA = "+m);

    }
}
