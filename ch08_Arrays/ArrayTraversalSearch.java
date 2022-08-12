public class ArrayTraversalSearch{


    public static void main(String[]args){

        int[] someElements = {1,3,5,7,9,11,13};
        int searchResut = search(someElements, 11);
        System.out.println("The element searched for is in position: " + searchResut);
        // System.out.println("The element is" + someElements[i]);

        System.out.println("The total value sum of the elements is: "+sum(someElements));
    }

    public static int search(int[] a, int target){
        for(int i = 0; i < a.length; i++){
            if (a[i]==target){
                return i;
            }
        } return -1;
    }

    public static int sum(int a[]){
        int sum = 0;
        for(int i=0; i< a.length; i++){
            sum += a[i];
        } return sum;
    }

}
