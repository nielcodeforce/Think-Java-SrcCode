/*
 *  Demonstration of the concepts treated in the textbook.
 */
    import java.util.Scanner;
    public class CalcPow{
        public static void main(String args[]){
            Scanner getNum = new Scanner(System.in);
            System.out.println("Vamos elevar um número a uma dada potência.");
            System.out.print("Primeiro digite o valor da base: ");
            double numBase = getNum.nextDouble();
            System.out.print("Agora o valor da potência à qual será elevada a base: ");
            double numPot = getNum.nextDouble();
            double resultPot = Math.pow (numBase, numPot);
            System.out.println("O número " + numBase + " elevado à " + numPot + " = " + resultPot);
        }
    }

