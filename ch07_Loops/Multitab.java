/*
* A very simple multiplication table Application (CLI) usind Conditional and Iteration.
*/

import java.util.Scanner;
public class Multitab {
    public static void main(String[]args){
       System.out.print("Escolha a tabuada que você deseja gerar de 0 a 10: ");
       Scanner num = new Scanner(System.in);
       int tab = num.nextInt();
       int i;
       if (tab >= 0 && tab <= 10){
            System.out.println("\nExibindo a tabuada de: " + tab);
            for (i=0; i<=10; i++){
                int y = tab * i;
                System.out.println(tab + " X " + i + " = " + y);
            }
        } else {
            System.out.println("Desculpe, você inseriu um valor inválido! Escolha valores inteiros de 0 a 10.");
        }
    }
}
