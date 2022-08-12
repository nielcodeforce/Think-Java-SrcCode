import java.util.Arrays;

public class CopyingArrays{
        public static void main(String[]args){
        double[] a = new double[3];
        a[0]=2;
        a[1]=4;
        a[2]=8;

        double[] b = new double[3];
        for (int i = 0; i<3; i++){
            b[i] = a[i];
        }
        System.out.println("The a Array is: " + Arrays.toString(a));
        System.out.println("The b Array is: " + Arrays.toString(b));



        /* Defining a new integer array and making two array variables point to it */

        int[] vetor = {1,2,4,8,16,32};

        System.out.println("\nArray vetor: " + vetor); // Não mostra o que queremos, apenas a ref de memória do array
        System.out.println("\nO array 'vetor' tem " + vetor.length + " posições:");

        for(int i=0;i<vetor.length;i++){
            System.out.println("vetor["+i+"]=" + vetor[i]+" ");
        } System.out.println();

        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        } System.out.println();

        int[] outro = vetor;
        System.out.println("Ao fazer o array outro igual ao array vetor, ambos apontam para o mesmo array:");
        System.out.println("Primeiro elemento do array 'outro' é: "+ outro[0]);
        System.out.println("O último elemento do array 'outro' é: "+ outro[5]);
        outro[0]=10;
        System.out.println("Primeiro elemento do array 'outro' agora é: "+ outro[0]);
        System.out.println("E agora, o primeiro elemento do array 'vetor' é: "+ vetor[0]);

        System.out.println("Array vetor: " + Arrays.toString(vetor));
        System.out.println("Array outro: " + Arrays.toString(outro));
        int[] copiaDeoutro = Arrays.copyOf(vetor, 3);
        System.out.println("Array copiaDeoutro: " + Arrays.toString(copiaDeoutro));

        double[] a = {2,3,4,5};
        int[] b = {1,3,5,7,9};
        System.out.println("Arrays in Java");

        for(int i = 0; i < a.length; i++){
            a[i] = Math.pow(a[i],2);
        } System.out.print("The a array is: "+Arrays.toString(a));

        System.out.println(" The length of a is: "+a.length);
        System.out.print("The b array is: "+Arrays.toString(b));
        System.out.println(" The length of b is: "+b.length);
        System.out.println("The sum of a + b = " +(a.length + b.length));

        printArray(a);
        printArray(b);
    }

    public static void printArray(double[] a){
        System.out.print("{"+ a[0]);
        for(int i = 1; i < a.length;i++){
            System.out.print(", " + a[i]);
        } System.out.println("}");
    }

    public static void printArray(int[] a){
        System.out.print("{" + a[0]);
        for(int i = 1; i < a.length;i++){
            System.out.print(", " + a[i]);
        } System.out.println("}");
    }

}
