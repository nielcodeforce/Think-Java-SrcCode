import java.util.Scanner;
public class DesvCondComposto{

    /*
    ** Ler dois valores numéricos inteiros e apresentar o valor da diferença (subtração) entre o maior e o menor
    ** dos valores lidos. (p.85, item e - Estudo dirigido de Algoritmos. Manzano, J.A. & Oliveira, J. F.).
    */

    public static void main(String[]args){

        int resposta, n1, n2;
        Scanner askNum = new Scanner(System.in);
        System.out.println("Entre com um primeiro numero inteiro: ");
        n1=askNum.nextInt();
        System.out.println("Entre com o segundo numero inteiro: ");
        n2=askNum.nextInt();
        askNum.close();

        if(n1>n2){
            System.out.println("O maior menos o menor resulta na diferença: " + (n1-n2));
        } else if (n1<n2){
            System.out.println("O maior menos o menor resulta na diferença: " + (n2-n1));
        }
    }

}
