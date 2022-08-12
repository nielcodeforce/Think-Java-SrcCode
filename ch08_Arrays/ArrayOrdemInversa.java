/*
* Crie um array de 6 números inteiros - uma linha (vetor) - e mostre-o na ordem inversa.
* Classe nome 'ArrayOrdemInversa'.
*/


public class ArrayOrdemInversa{

    public static void main(String[]args){

        int[] vetor = {1,2,4,8,16,32};

/*        System.out.println(vetor); // Não mostra o que queremos, apenas a ref de memória do array
        System.out.println("O array tem " + vetor.length + " posições");

        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        } System.out.println();

        System.out.println();
        System.out.println("Ordem reversa do array: ");
        for(int i= vetor.length-1;i>=0;i--){
            System.out.print(vetor[i]+" ");
                } System.out.println();
*/

        System.out.println("Ordem dos elementos do array:");
        int count = 0;
        while (count < (vetor.length)){
            System.out.print(vetor[count]+" ");
            count++;
        } System.out.println();

        System.out.println("Ordem inversa dos elementos do array: ");
        count = vetor.length-1;
        while (count >=0){
            System.out.print(vetor[count]+" ");
            count--;
        } System.out.println();



    }

}

