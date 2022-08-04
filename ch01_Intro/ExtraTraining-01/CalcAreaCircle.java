/*
** Elaborar um programa de computador que calcule a área de uma circunferẽncia e apresente a medida.
** (p.50, Exemplo resolvido - Estudo dirigido de Algoritmos. Manzano, J.A. & Oliveira, J. F.).
*/
import java.util.Scanner;

public class CalcAreaCircle {

    public static void main(String[]args) {

        Scanner askRadius = new Scanner(System.in);
        System.out.print("Please, enter the radius of the circle: ");
        double radius = askRadius.nextDouble();
        askRadius.close();
        System.out.println("The area is: " + areaCirc(radius));

    }

    public static double areaCirc(double radian) {

        final double PI = 3.14159265;
        double areaCircle = PI * radian * radian;
        return areaCircle;

    }

}
