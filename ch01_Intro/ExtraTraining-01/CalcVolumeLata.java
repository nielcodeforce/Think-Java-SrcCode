/*
* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula
* volume <- 3.14159 * Raio ^ 2 * Altura.
*/

import java.util.Scanner;
public class CalcVolumeLata{

    public static void main(String[]args){
        Scanner userIn = new Scanner(System.in);
        System.out.print("Entre com o valor do diâmetro da lata (em cm): ");
        double diameter = userIn.nextDouble();
        System.out.print("Entre com o valor da altura da lata (em cm): ");
        double height = userIn.nextDouble();
        userIn.close();

        System.out.println("O volume da lata (cilindro) é de: "+volCilinder(diameter, height)+" cm³.");
        System.out.println();
    }

    public static double volCilinder(double diameter, double height){

        double radius = diameter/2;
        // double areaCircle = radius*radius*PI;  << Calculo passará a ser feito pelo método areaCircle().
        double circleArea = areaCircle(radius);
        double totalVolume = height*circleArea;
        return totalVolume;
    }

    public static double areaCircle(double radius){

        final double PI = 3.14159;
        double areaCircle = radius*radius*PI;
        return areaCircle;

    }

}
