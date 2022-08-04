/* A very simple multiplication table Application (CLI) usind Conditional and Iteration. */

// import java.util.Scanner;
// public class Multitab {
//     public static void main(String[]args){
//        // Scanner num = new Scanner(System.in);
//        System.out.print("Escolha a tabuada que você deseja gerar de 0 a 10: ");
//        Scanner num = new Scanner(System.in);
//        int tab = num.nextInt();
//        int i;
//        if (tab >= 0 && tab <= 10){
//             System.out.println("\nExibindo a tabuada de: " + tab);
//             for (i=0; i<=10; i++){
//                 int y = tab * i;
//                 System.out.println(tab + " X " + i + " = " + y);
//             }
//         } else {
//             System.out.println("Desculpe, você inseriu um valor inválido! Escolha valores inteiros de 0 a 10.");
//         }
//     }
// }


import java.util.Scanner;

public class Multitab {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um número entre 1 e 1000: ");
            int num = entrada.nextInt();
            entrada.close();

            if (num >= 1 && num <= 1000){
                for (int i = 1; i <= num; i++)
                    if ((i%2) != 0) {
                        System.out.print(i+" ");
                    }
            } else { System.err.println("Valor inválido"); }

            System.out.println();
    }
}
