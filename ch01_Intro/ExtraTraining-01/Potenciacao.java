/*
* Efetuar o cálculo de uma raiz de base qualquer com índice qualquer.
*/

import java.util.Scanner;

public class Potenciacao {

    public static void main(String[]args) {

        Scanner getNum = new Scanner(System.in);
        System.out.print("Entre com um número inteiro base da potência: ");
        int number = getNum.nextInt();
        System.out.print("Informe o valor do expoente: ");
        int expoente = getNum.nextInt();
        getNum.close();
        System.out.println();
        System.out.println("O valor da potência é: "+squareRoot(number, expoente));

    }

    private static int squareRoot(int num, int pot) {

        return (int) Math.pow(num, pot);

    }

}
