import java.util.Arrays;
public class DisplayingArrays{
    public static void main(String[]args){
        // int[] b = new int[5];
        int[] b = {0,2,4,6,8};
        System.out.println(b);
        printArray(b);
        System.out.println(Arrays.toString(b));
    }
    
    public static void printArray(int[] a){
        System.out.print("{"+ a[0]);
        for(int i=1; i<a.length; i++){
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

}
