/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido.
*/
import java.util.Scanner;

public class MoreOnWhile{
    public static void main(String[]args){
        
        double valorNota;
        Scanner askNota = new Scanner(System.in);
        System.out.println("Digite valor da nota: ");
        valorNota = askNota.nextDouble();
        
        while (valorNota < 0 || valorNota > 10){
            System.out.println("Valor digitado é inválido.");
            System.out.print("Digite novamente: ");
            valorNota = askNota.nextDouble();
        }
        
        System.out.println("Valor da nota: " + valorNota);
        
        }

    }
