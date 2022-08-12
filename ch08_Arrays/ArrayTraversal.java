import java.util.Arrays;
public class ArrayTraversal{

    public static void main(String[]args){

            double[] a = {2.0,3.0,4.5,5.8};
            int[] b = {1,3,5,7,9};
            System.out.println("Arrays in Java");

            for(int i = 0; i < a.length; i++){
                a[i] = Math.pow(a[i],2);
            } System.out.print("The a array is: "+Arrays.toString(a));

            printArray(a);
            printArray(b);

            // Alguns exemplos da aula sobre arrays da DIO

            int testeArray[] = new int[] {10,20,30,40,50,60,70,80};
            System.out.print(testeArray[0]+" ");
            System.out.print(testeArray[2]+" ");
            System.out.println(testeArray[6]);
            System.out.println("testArray's length is " + testeArray.length);

            double secondTestArray[] = new double[20];

            double thirdTestArray[] = new double[]{1,2,3,4,5,6,7,8,9,10};
            for (int i=0;i<thirdTestArray.length;i++){
                double varTemp = thirdTestArray[i];
                if (varTemp==7){
                    System.out.println(Arrays.toString(thirdTestArray));
                    System.out.println("Reached: "+varTemp);
                } continue;
            }

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

