public class WhileStatement{
    public static void main(String[]args){
        // WhileStatement();
        WhileStatementTwo(6);
        WhileStatementTwo(10);
    }

//     public static void WhileStatement(){
//         int n = 0;
//         while(n<=5){
//             System.out.println(n);
//             n = ++n;
//         }
//         System.out.println("Blastoff!");
//     }
    
    public static void WhileStatementTwo(int n){
        int i = 1;
        while (i <= n){
            System.out.printf("%4d", n * i);
            i = ++i;
        }
        System.out.print("\nDone! 'i' variable has reached " + i + " - ");
        System.out.println("I'm out of the loop.");
    }
}
