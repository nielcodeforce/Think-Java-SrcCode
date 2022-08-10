import java.util.Scanner;
public class PrintTables{

    public static void main(String[]args){
        Scanner rowNumber = new Scanner(System.in);
        System.out.println("How many rows do you wanna print out? ");
        printTable(rowNumber.nextInt());
        
    }

    public static void printTable(int rows){
        int i = 1;
        while (i <= rows){
            printRow(i, rows);
            i++;
        }
    }

    public static void printRow(int n, int cols){
        int i = 1;
        while (i <= cols){
            System.out.printf("%4d", n * i);
            i++; // i = i + 1;
        }
        System.out.println();
    }

}
