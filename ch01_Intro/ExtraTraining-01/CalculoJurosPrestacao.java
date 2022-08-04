/*
-------------------------------------------------------------------------------------------------------------------
f) Efetuar o cálculo de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <- VALOR + (VALOR *(TAXA/100)*TEMPO).
-------------------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;
public class CalculoJurosPrestacao {


    public static void main(String[]args){

        Scanner askUser = new Scanner(System.in);
        System.out.print("Informe o valor atual da prestação: ");
        double valorPrestacao = askUser.nextDouble();
        System.out.print("Informe a quantidade de dias em atraso: ");
        int diasAtrasados = askUser.nextInt();

        System.out.println("Valor re-calculado da prestação: " + valorPrestacao(valorPrestacao, diasAtrasados, 2.5));

    }

    // 'valor' é o valor da prestacao em atraso e prestacao é a nova prestacao com os juros calculados.
    // 'diasAtraso' é o tempo de atraso da prestacao em dias - tipo inteiro.

    private static double valorPrestacao(double valor, int diasAtraso, double taxa){

        double prestacao = valor+(valor*((taxa/30)/100)*diasAtraso);
        return prestacao;

    }

}
