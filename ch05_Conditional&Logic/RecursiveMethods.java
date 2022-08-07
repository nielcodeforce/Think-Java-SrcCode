public class RecursiveMethods{
    public static void main(String [] args){
        int x = 8;
        countdown(x);
    }

    public static void countdown(int n){
        if(n==0){
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            nLines(1);
            countdown(n-1);
        }
    }
    
    public static void nLines(int n){
        if(n>0){
            System.out.println();
            nLines(n-1);
        }
    }
}
