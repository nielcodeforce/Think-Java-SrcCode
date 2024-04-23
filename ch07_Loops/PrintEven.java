import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um número entre 1 e 1000: ");
            int num = entrada.nextInt();
            if (num >= 1 && num <= 1000){
                for (int i = 1; i <= num; i++ ){
                    if ((i%2) == 0) {
                        System.out.print(i+" ");
                    }
                }
            } else {
                System.out.println("Valor inválido");
            }
            System.out.println();
    }
}
